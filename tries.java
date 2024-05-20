public class tries {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0 ; i< 26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insertion  O(L)
    public static void insert(String word){
        Node curr = root;
        for( int level = 0 ; level< word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    // search //O(L)
    public static boolean search(String key){
        Node curr = root;
        for( int level = 0 ; level< key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;

    }

    // word break problem  o(l)
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for( int i = 1 ; i<= key.length(); i++){
            //substring (begidx, lastidx)
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
              return true;
        }
    }
    return false;

 }
    public static void main(String agrs[]){
        // String words[] = {"the", "a","there", "their", "any", "three"};
        // for(int i = 0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("three"));
        // System.out.println(search("throw"));
        
        // wordbreak problem
        String arr[] = { "i" , "like", "sam", "samsung", "moblie", "ice"};
        for( int i = 0 ;i< arr.length;i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
}
}
