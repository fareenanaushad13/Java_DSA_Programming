//Time Complexity: O(L)
public class SearchInTrie {
    //create a Trie
    static class Node{
        Node Children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                Children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //insert in trie
    public static void inset(String word){ //O(L)
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
    public static void main(String[] args) {
        String word[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i=0;i<word.length;i++){
            inset(word[i]);
        }

        System.out.println(search("thee"));//true
        System.out.println(search("thor"));//false
    }
}

