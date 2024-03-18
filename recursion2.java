public class recursion2 {

    //            tiling problem
    // public static int tiling(int n){   //2Xn(floor size)
    //     //base case
    //     if(n==0||n==1 ){
    //         return 1;
    //     }
    //     // verticalTiles
    //  int fnm1 =  tiling(n-1);
    //     //horizontal
    //  int fnm2 = tiling(n-2);

    //  int totalWays = fnm1 + fnm2;
    //  return totalWays;


    // return tiling(n-1) + tiling(n-2);
    // }

    
    //           remove duplicate in a string
    // public  static void removeDuplicate(String str,int idx,StringBuilder newstr, boolean map[]){

    //       if( idx == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if( map[currChar - 'a'] == true){
    //         removeDuplicate(str,idx+1,newstr,map);
    //     } else{
    //         map[currChar -'a'] = true;
    //             removeDuplicate(str,idx+1,newstr.append(currChar),map);
    //         }
    //     }

        //              friend pair 
        // public static int friendPair(int n){   //2Xn(floor size)
        //     //     //base case
        //         if(n==1||n==2 ){
        //             return n;
        //         }
            //     // single
            //  int fnm1 =  friendPair(n-1);
            //     //pair
            //  int fnm2 =friendPair(n-2);
            //  int pairway = ( n-1)* fnm2;
        
            //  int totalWays = fnm1 + pairway;
            //  return totalWays;
            // return friendPair(n-1) + (n-1)*friendPair(n-2);
            // }

            // binary string 
             public static void binarystring( int n, int lastidx , String str){
                if( n == 0){
                    System.out.println(str);
                    return;
                }
            // if( lastidx == 0){
            //     binarystring ( n-1 , 0 , str.append("0"));
            //     binarystring ( n-1 , 1, str.append("1"));
            // }else{
            //     binarystring ( n-1 , 0 , str.append("0"));
            // }
            binarystring ( n-1 , 0 , str +("0"));
            if( lastidx == 0){
                binarystring ( n-1 , 1, str+ ("1"));
            }
             }
    
public static void main(String args[]){
//     System.out.println(tiling(3));     ///tilling 
// String str  = "appnacollefeujdehcehehvdxbnjiuyfxgcvl";            //removeduplicate
// removeDuplicate( str,0,new StringBuilder(""), new boolean[26]);
// }
binarystring(3,0,"");

}
}