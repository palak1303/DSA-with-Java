import java.util.*;
public class greedyAlg3 {

    public static void main(String[] args) {

        // //-----min absolute difference pair-----------
        // int A[] = { 40,20,10};
        // int B[] = { 30,20,30};
        // Arrays.sort(A);
        // // for( int i = 0 ; i < A.length ; i++ ){
        // // System.out.print(A[i]+ " " );
        // // }
        // System.out.println();
        // Arrays.sort(B);
        // // for( int i = 0 ; i < B.length ; i++ ){
        // //     System.out.print(B[i]+ " ");
        // // }
        // int sum = 0 ;
        // for ( int i = 0; i < B.length; i++) {
        //     if( A[i] > B [ i]){
        //         sum = sum + ( A[i] - B[i]);
        //     }
        //     else{
        //         sum += B[i] - A[i];
        //     }   
        //     // sum += Math.abs(A[i] - B[i]);
        // }
        // System.out.println(" min diff" +sum);


        //-----Max Length chain of pairs----------
        int A[] = { 5,39,5,27,50};
        int B[] = { 24,60,28,40,90};

        int pairs[][] = new int[A.length][3];
         for( int i=0;i< A.length;i++){
            pairs[i][0] = i;
            pairs[i][1] = A[i];
            pairs[i][2] = B[i];
         }
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[2]));

        int maxlen=1;
        int lastEnd= pairs[0][2];
        for (int i = 0; i < B.length; i++) {
            if (pairs[i][1]>lastEnd) {
                maxlen++;
                lastEnd=pairs[i][2];
            }
        } 
        System.out.println(maxlen);
}
}