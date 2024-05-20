
public class tries2 {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq ;

        public Node(){
            for(int i = 0 ; i<children.length ;i++){
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    //Q1 start with problem
    public static boolean startWith(String prefix){
        Node curr = root;
        for( int i = 0 ;i < prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';
            if( curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //Q2 prefix problem
    public static void insert(String word){
        Node curr = root;
        for( int level = 0 ; level< word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
            curr.children[idx].freq++;
            }
            curr= curr.children[idx];
        }
        curr.eow = true;
    }
    public static void findPrefix(Node root, String ans){  //o(L) longest word
        if(root ==null){
             return ;
        }
        if( root.freq == 1){
            System.out.println(ans);
            return;
        }

        for( int i = 0 ; i<26;i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));           
            }
        }
    }
    // Q3 count node
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for( int i=0;i< 26;i++){
            if(root.children[i]!= null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1 ;
    }

    // Q4 LONGEST WORD WITH ALL PREFIX
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root ==null){
            return;
        }
        for(int  i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow ==true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }


    public static void main(String agrs[]){
        //prefix
        // String arr[] = {"zebra", "dog","duck","dove"};
        // for( int i = 0 ; i< arr.length;i++){
        //     insert(arr[i]);
        // }

        // root.freq = -1;
        // findPrefix(root,"");


        //startWith
        // String words[] = {"apple", "app", "mango", "man", "woman"};
        // String prefix1 = "app";
        // String prefix2 = "moon";

        // for( int i = 0; i<words.length;i++){
        //     insert(words[i]);
        // }

        // System.out.println(startWith(prefix1));
        // System.out.println(startWith(prefix2));


        // count node
        // String str = "ababa";

        // for( int i = 0 ; i<str.length();i++){
        //     String suffix = str.substring(i);
        //     insert(suffix);
        // }
        // System.out.println(countNodes(root));

        
        //longestWord
        String words[] ={ "a", "banana","app","appl","ap", "apply","apple"};
        for (int i=0; i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);

    }
}