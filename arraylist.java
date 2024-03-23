import java.util.ArrayList;
import java.util.*;

public class arraylist{
    public static void main(String agrs[]){
        //syntax
        // ArrayList<Integer> list = new ArrayList<>(); 
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3  = new ArrayList<>();
    
        //  // add 
        // list.add(1);   //0(1)
        // list.add(22);
        // list.add(31);
        // list.add(14);
        // list.add(5);
        // list.add(6);

        // System.out.println(list);

        // //get opern    -0(1)
        // int element = list.get(2);
        // System.out.println(element);


        // //Delete     -0(n)
        // list.remove(1);
        // System.out.println(list);

        // //set
        // list.set(2,10);
        // System.out.println(list);

        // //contain elemnet
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        //print an array
        // System.out.println(list.size());
        // for(int i = 0;i<list.size();i++){
        //     // System.out.print(list.get(i)+ " ");
        // }
        // System.out.println(list);
        // System.out.println();


        //Reverse of an arraylist
        // for(int i =list.size()-1 ;i>=0;i--);
        //     list2.add(list.get(i));
        // }
        // System.out.println(list2);


        //Max in list
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<list.size();i++){
        //     // if(max < (list.get(i)));
        //     // max = list.get(i);

        //     max = Math.max(max,list.get(i));
        // }
        // System.out.println("max element is "+max);


        //Swap of 2 no
        // int idx1 = 1,idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1,idx2);
        // System.out.println(list);

        //sorting
        // System.out.println(list);
        // Collections.sort(list);        //ascending
        // System.out.println(list);    

        //descending
        // Collections.sort(list,Collections.reverseOrder());
        //  System.out.println(list);


        //Multidim array
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 1 ; i<=5;i++){
            list2.add(i*2);
        }
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 1 ; i<=5;i++){
            list3.add(i*3);
        }
        mainList.add(list3);


        for(int i = 0; i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
              for(int j = 0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
              }
            System.out.println();}    
            System.out.println(mainList);
    }

// public static void swap(ArrayList<Integer> list,int idx1 , int idx2){
//     int temp = list.get(idx1);
//     list.set(idx1, list.get(idx2));
//     list.set(idx2,temp);

// }
}