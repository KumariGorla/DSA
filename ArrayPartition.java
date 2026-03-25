import java.util.*;


class ArrayPartition{
    public static void main(String[] args) {
        int arr[] = {6,2,6,5,1,2};
        Arrays.sort(arr);
        int max_val = 0;
        for(int i = 0;i<arr.length;i+=2){
            for(int j = i+1;j<arr.length;j++){
                //System.out.println(arr[i]+" "+arr[j]);
                int temp = Math.min(arr[i],arr[j]);
                //System.out.println(temp);
                max_val = Math.max(max_val,temp);

            }
        }
        System.out.println(max_val);

    }
}