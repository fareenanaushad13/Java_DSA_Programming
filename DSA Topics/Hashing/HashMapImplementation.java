import java.util.*;

public class HashMapImplementation {
    static class HashMap<K, V> { //generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private int N;
        private LinkedList<Node> bucket[]; // N = bucket.length;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int HashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) { // Use equals() for object comparison
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuck = bucket;
            N = N * 2; 
            bucket = new LinkedList[N];

            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // Reinsert nodes into new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { //O(lambda)  ->O(1)
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { //O(1)
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { //O(1)
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].remove(di);
                n--; 
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { //O(1)
            int bi = HashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 360);
        hm.put("Us", 400);
        hm.put("SriLanka", 70);
        hm.put("Dubai", 500);
        hm.put("Indonesia", 243);
        hm.put("Australia", 334);
        hm.put("Nepal", 45);

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }
        System.out.println(hm.get("Nepal"));
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm.get("Nepal"));
    }
}
