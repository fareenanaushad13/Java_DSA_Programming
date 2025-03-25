//Time Complexity: O(L)
public class StartWithProblem {
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

    public static boolean startWith(String prefix){
        Node curr = root;

        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.Children[idx] == null){
                return false;
            }
            curr = curr.Children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String word[] = {"apple", "app", "mango", "man", "women"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0;i<word.length;i++){
            inset(word[i]);
        }
        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
