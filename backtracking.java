public class backtracking {
    // BACKTRACKINH ON ARRAY
    // public static void changeArr(int arr[], int i , int val) {
    //     //base
    //     if( i==arr.length){
    //         printArr(arr);
    //             return;
    //     }

    //     ///recursion
    //     arr[i] = val;
    //     changeArr(arr,i+1,val+1);  //recursion
    //     arr[i] = arr[i] -2;          //backtracking
    // }
    // public static void printArr( int arr[]) {
    //     for(int i = 0; i< arr.length;i++){
    //         System.out.print(arr[i] + "  ");
    //     }
    // }
    

    //FIND SUBSET
    // public static void subSet(String str , String ans , int i ) {
    //     //base
    //     if( i == str.length()){
    //         if(ans.length()==0){
    //             System.out.println("null");
    //         }
    //         System.out.println(ans );
    //         return;
    //     }
    //     //recursion
    //     //yes choice
    //     subSet(str,ans + str.charAt(i),i+1);
    //     //no choice
    //     subSet(str,ans,i+1);
        
    // // }

    // // PERUTATION
    // public static void permutation(String str, String ans) {
    //         //base
    //         if(str.length() ==0){
    //             System.out.println(ans);
    //             return;
    //         }
    //         //recursion
    //         for(int i = 0; i< str.length();i++){
    //             char curr = str.charAt(i);
    //             //"abcde" = "ab"+ de = abde ,c delete
    //             String Newstr  = str.substring(0,i) + str.substring(i+1);
    //             permutation(Newstr,ans+curr);
    //         }

    // }

    //N QUEEN
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left up
        for(int i = row-1, j=col-1;i>=0&& j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j=col-1; i>=0&&j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueen(char board[][],int row){   
        // /base
        if(row ==board.length){
            printBoard(board);
            return;
        }
        //column loop
     for( int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nQueen(board,row+1);
            board[row][j] = '-';

        }
        board[row][j] = 'Q';
        nQueen(board,row+1);
        board[row][j] = '.';
    
    }

}
public static void printBoard(char board[][]) {
    System.err.println("---------chess board-------");
    for( int i = 0;i<board.length;i++){
        for( int j = 0 ; j<board.length;j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
    
}
    
    // 
    public static void main(String[] args) {
        // String str = "abc"; //permuation
        // permutation(str,"");
        // String str = "abcde";   //subset
        // subSet(str, "",0);
        // int arr[] = new int[5];   //array
        // changeArr(arr,0,1);
        // printArr(arr);

        int n= 2;
        char board[][] = new char[n][n];
        //intailise
        for( int i = 0; i< n;i++){
            for(int j=0;j<n;j++){
                board[i][j]= '-';

            }

        }
        nQueen(board,0);
    }
}
