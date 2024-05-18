import java.util.*;

public class hashSet3 {

     // ticket 
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String ,String> revMap = new HashMap<>();
        
        for(String key: tickets.keySet()){
           revMap.put(tickets.get(key), key); 
        }
        for(String key: tickets.keySet()){              
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    public static void main(String args[]){

        // Q1 union and intersection
        // HashSet<Integer> set = new HashSet<>();
        // int arr1[] = { 7,3,9};
        // int arr2[] = {6,3,7,2,9,4};

        // // union
        // for( int i = 0 ; i< arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        // for( int i = 0 ; i < arr2.length;i++){
        //     set.add(arr2[i]);
        // }
        
        // System.out.println("union = "+ set.size());
        // System.out.println(set);

        // //intersection
        // set.clear();
        // for( int i = 0 ; i <arr1.length ; i++){
        //     set.add(arr1[i]);
        // }
        // int count = 0;
        // for( int i = 0 ; i < arr2.length;i++){
        //     if( set.contains(arr2[i])){
        //         count ++;
        //         set.remove(arr2[i]);
        //     }
        // }
        // System.out.println("intersection = "+ count);




        // Q2 count Distinct element
        //     int arr[] = { 4,3,2,5,6,7,3,4,2,1};
        //     HashSet<Integer> hs = new HashSet<>();

        //    for( int i = 0 ; i< arr.length ;i++){
        //         hs.add(arr[i]);
        //    }
        //    System.out.println(hs.size());


        
            //Q3 ticket
        //  HashMap<String , String> tickets = new HashMap<>();
        //     tickets.put("Chennai","Bengaluru");
        //     tickets.put("Mumbai","Delhi");
        //     tickets.put("Goa","Chennai");
        //     tickets.put("Delhi","Goa");

        //     String start = getStart(tickets);
        //     System.out.print(start);
        //     for( String key : tickets.keySet()){
        //         System.out.print(" -> " + tickets.get(start));
        //         start = tickets.get(start);
        //     }
        //     System.out.println();

        

        // Q4 largest subarray with sum 0   --O(N)
        // int arr[] = { 15,-2,2,-8,1,7,10,23};

        // HashMap<Integer , Integer> map = new HashMap<>();

        // int sum = 0;
        // int len = 0;

        // for( int j = 0 ; j<arr.length ;j++){
        //     sum += arr[j];
        //     if( map.containsKey(sum)){
        //         len = Math.max(len, j-map.get(sum));
        //     }else{
        //         map.put(sum,j);
        //     }
        // }
        // System.out.println(len);



        // Q5 subarray sum equal to k  --O(n)
        int arr[] ={ 10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0; 
        int ans = 0;

        for( int j = 0 ; j< arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}

