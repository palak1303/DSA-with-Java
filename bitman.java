public class bitman {
        // public static void main( String rgs[]){
        //     System.out.println(( 5 & 6));
        //     System.out.println(( 5 | 6));
        //     System.out.println(( 5 ^ 6));
        //     System.out.println(( ~5 ));
        //     System.out.println(( 5<<2));
        //     System.out.println(( 5>>2));
    
    
    
            // check whwther no is even or odd
            //     public static void oddOrEven(int n){
            //         int bitMask = 1;
            //         if((n & bitMask )==0){
            //             // even
            //             System.out.println("even number");
    
            //         }else{
            //             System.out.println(" odd number ");
            //         }
            //     }
            
            // public static void main(String args[]){
            //     oddOrEven(3);
            //     oddOrEven(11);
            //     oddOrEven(14);
    
            //  }
    
    
            // public static int getIthBit(int n, int i){
            //     int bitMask = 1<<i;
            //     if((n & bitMask ) == 0){
            //         return 0;
            //     }else{
            //         return 1;
            //     }
    
            // }
            // public static void main( String agrs[]){
            //     System.out.println(getIthBit(10,3));
    
            // }
            // public static int setIthBit(int n, int i){
            //     int bitMask = 1<<i;
            //      return n| bitMask;
            //     }
    
            
            // public static void main( String agrs[]){
            //     System.out.println(setIthBit(10,2));
    
            // }
            // public static int clearIthBit(int n, int i){
            //     int bitMask = ~(1<<i);
            //     return n & bitMask;
    
            // }
            // public static void main( String agrs[]){
            //     System.out.println(clearIthBit(10,1));
    
            // }
         
      
            // UPDATE IT BIT   ????????????????
            // public static clearIthBit(int n, int i){
            //     int bitMask = ~(1<<i);
            //     return n & bitMask;
    
            // }
            // public static updateIthBit( int n , int i , int newBit){
            //     if( newBit == 0){
            //         return  clearIthBit(n, i);
            //     }else{
            //         return setIthBit(n,i);
            //     }
    
            //     }
            //     System.out.println(updateIthBit(10,1));
    
            // }
             
    
    //         public static int clearItnBit(int n, int i){
    //             int bitMask = (~0) <<i;
    //             return n & bitMask ;
    //         }
    // }       public static void main(String args[]){
    //     System.out.println(clearIthBit(15,2));
    // }
    // public static int clearBitsRange(int n, int i,int j){
    //     int a = (~0) <<i;
    //     int b = (1<<i) -1;
    //     int bitMask = a|b;
    //     return n & bitMask ;
    // }
    // public static void main(String agrs[]){
    //     System.out.print(clearBitsRange(10,2,4));
    // }
    
    
    
    //  find out whwther of two
    // public static boolean isPowerTwo(int n){
    //         return (n&(n-1))==0;
    // }
    // public static void main( String agrs[]){
    //     System.out.println(isPowerTwo(15));
    // }
    
    
    // COUNT SET BITS IN A NUMBER
    // public static int countSetBit(int n){
    //     int count = 0;
    //     while( n>0){
    //         if( ( n&1)!=0){
    //             count ++;
    
    //         }
    //         n = n>>1;
    //     }
    //     return count;
    // }
    // public static void main( String args[]){
    //     System.out.println(countSetBit(10));
    // }
    
    
    
    public static int fastExp(int a,int n){
        int ans = 1;
        
        while( n>0){
            if( (n&1)!=0){   //lsb
                ans = ans * a;
            }
            a = a* a;
             n= n>>1;
        }
        return ans;
    }
    public static void main( String args[]){
            System.out.println(fastExp(5,3));
        }
    }
    
    
    
    
    
    

