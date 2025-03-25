//Time Complexity: O(L)
public class CountUniqueSubstrings {
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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.Children[i] != null){
                count += countNodes(root.Children[i]);
            }
        }
        return count+1;

    }
    public static void main(String[] args) {
        String str = "far";

        //suffix ---> insert in a trie
        for(int i=0;i<str.length();i++){
            String suffix  = str.substring(i);
            inset(suffix);
        }
        System.out.println(countNodes(root));
    }
}
