
    import java.util.*;
    public class 2DArray {
    // public static boolean search(int matrix[][],int key ){
    //     for ( int i = 0;i<matrix.length;i++){
    //         for(int j =0;j< matrix[0].length;j++){
    //             if(matrix [i][j]==key){
    //                 System.out.print("found at cell ("+ i+","+ j+")");
    //                 return true;
    //             }
    //         }
    //     System.out.println("element not found ");
    //     return false;
    // }
    // public static void main(String args[]){
    //      int matrix [][]=new int[3][3];
    //      int n = matrix.length, m = matrix[0].length;


    //      Scanner sc = new Scanner(System.in);
    //      for( int i  = 0;i <n;i++){
    //          for(int j= 0 ; j< m;j++){
    //             matrix[i][j]= sc.nextInt();
    //         }
    //      }
 
    //      for( int i  = 0;i <n;i++){
    //         for(int j= 0 ; j< m;j++){
    //             System.out.print(  matrix[i][j]+ " ");
             
    //         }
    //         System.out.println("");
    //      }
 
    //     search(matrix,5);

    // }

    



// SPIRAL MATRIX

// public static  void printsprial( int matrix[][]){
//     int startRow = 0;
//     int startCol = 0;
//     int endRow = matrix.length - 1;
//     int endCol = matrix.length - 1;

//     while(startRow <= endRow && startCol <=endCol){
//         // top
//         for(int j=startCol;j<=endCol;j++){
//             System.out.print(matrix[startRow][j]+" ");
//         }
//         // right
//         for(int i=startRow;i<=endRow;i++){
//             System.out.print(matrix[i][endCol]+" ");
//         }

//         //  bottom
//          for(int j=endCol-1;j>=startCol;j--){
//             if(startRow == endRow){
//                 break;
//             }
//             System.out.print(matrix[endRow][j]+" "); 
//          }
            
//          //left
//          for(int i=endRow-1;i>=endCol;i--){
//             if(startCol == endCol){
//                 break;
//             }
//             System.out.print(matrix[i][startCol] +" ");
//          } 

//          startCol++;
//          startRow++;
//          endCol--;
//          endRow--;
//         }
//         System.out.println();
// }


// }

//      DIAGONAL SUM   ---o(n^2)
// public static int diagonalsum( int matrix[][]){
//     int sum = 0; 

    // for( int i = 0 ; i < matrix.length;i++){
    //     for( int j = 0;  j<matrix[0].length ; j++ ){
    //         if( i == j ){
    //             sum += matrix[i][j];
    //         }
    //         else if(i+j == matrix.length-1 ){
    //             sum += matrix[i][j];
    //         }
    //     }
    // } 



//     for(int i =0 ; i <matrix.length;i++){
//         sum =+matrix[i][i];
//         if(i!= matrix.length-1-i)
//         sum+=matrix[i][matrix.length-i-1];
//     }
//     return sum;
// }

  

// public static boolean starincase( int matrix[][],int key){
//     int row = 0 , col = matrix[0].length-1;
//     while(row < matrix.length && col >=0){
//         if(matrix[row][col] == key){
//             System.out.println("found key at("+ row + ", "+ col+ " )");
//             return true;
//         }
//         else if( key< matrix[row][col]){
//             col--;
//         }
//         else{
//             row++;
//         }
//     }
//     System.out.print("element not found");
//     return false;
// }


//         -----------PRACTICE ------------

// QUES1
// public static int find( int matrix[][], int key){
//     int count = 0;
//         for ( int i = 0;i<matrix.length;i++){
//             for(int j =0;j< matrix[0].length;j++){
//                 if(matrix [i][j]==key){
//                     count = count + 1;
//                     // System.out.print("found at cell ("+ i+","+ j+")");
//                 }
//             }
//         }
//         System.out.println();
//         return count;
//     }


// QUES2
// public static void main( String[] agrs){
//     int [][] num = {{1,4,9},{11,4,3},{2,2,3}};
//     int sum=0;
//         // for ( int i = 0;i<matrix.length;i++){
//             for(int j =0;j<num[0].length;j++){
//                   sum = sum + num[1][j];
//                     // System.out.print("found at cell ("+ i+","+ j+")");
//                 }
//             }
//         }
//         System.out.println("sum is "+ sum);
//     }
// }


// QUES3
public static void main (String [] args){
    int row = 2 , col = 3;
    int [][] matrix= {{2,3,7},{5,6,7}};

    printMatrix(matrix);

    int[][] transpose = new int[col][row];
    for(int i = 0; i<row;  i++){
        for( int j=0;j<col;j++){
            transpose[j][i] = matrix[i][j];
        }
    }

    printMatrix(transpose);
}


public static void printMatrix(int[][] matrix){
    System.out.print("the matrix is:");
    for ( int i = 0;i<matrix.length;i++){
           for(int j =0;j< matrix[0].length;j++){
              System.out.print(matrix[i][j]+ " ");
           }
           System.out.println();
        }
    }

}












// public static void main(String args[]){
//     int matrix[][] = {{1,2,3,4},
//                       {3,6,7,8}};
                    //   {9,10,11,12},
                    //   {13,14,15,16}};
// printsprial(matrix);
// System.out.print(diagonalsum(matrix));
// starincase(matrix,13);
// System.out.print(find(matrix,3));

// }}

}
