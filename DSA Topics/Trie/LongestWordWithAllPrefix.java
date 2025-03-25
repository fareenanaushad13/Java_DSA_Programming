public class LongestWordWithAllPrefix {
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

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){   
        if(root == null){
            return;
        }
        // for(int i=0;i<26;i++){ //apple //alphabetically smaller
        for(int i=25;i>=0;i--){ //apply //alphabetically larger
            if(root.Children[i] != null && root.Children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length()> ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.Children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack
            }
        }
    }
    public static void main(String[] args) {
        String word[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i=0;i<word.length;i++){
            inset(word[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
