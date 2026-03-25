import java.util.*;
public class partition {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
           
            int temp = target-arr[i];
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);

            }
            if(map.containsKey(temp)){
                    System.out.println(i+" "+map.get(temp));
                }
        }
        //System.out.println(map);

      

    }
}
//for(int i = 0;i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]+arr[j] == target){
//                    System.out.println(i+" "+j);
//                }
//            }
//        }
//