import java.util.*;

public class git {
    public  static String longestCommonPrefix(String[] strs) {
        int idx = 0;
        Arrays.sort(strs);
        while( idx < strs[0].length()){
            if(strs[0].charAt(idx) == strs[strs.length-1].charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }
        return idx == 0 ? " ": strs[0].substring(0,idx);
        
    }
    public static void main(String args[]){
       String strs[] = { "flower","flur", "flon"};
       System.err.println(longestCommonPrefix(strs));
        
    }
}
 
