//Time Complexity: O(L)
public class WordBreakProblem {
    static class Node{
        Node Children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0;i<26;i++){
                Children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //insert in trie
    public static void insert(String word){ //O(L)
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.Children[idx] == null){
                curr.Children[idx] = new Node();
            }
            curr = curr.Children[idx];
        }
        curr.eow = true;
    }

    //Search In Trie
    public static boolean search(String key){ //O(L)
        Node curr = root;
        for(int level = 0;level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.Children[idx] == null){
                return false;
            }
            curr = curr.Children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key){ //O(L)
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) 
                && wordBreak(key.substring(i))){
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i", "love","far", "farru","developer","computerscienece"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        String key = "ilovefar";
        System.out.println(wordBreak(key));
    }
}
