
import java.util.*;

class leetcode3{
    public static void main(String[] args) {
        int arr[] = {9 , 4 , 1 , 7};
        int k = 3;
       
        Arrays.sort(arr);
        int ans = 0;
        for(int r = 0;r<arr.length-k+1;r++){
            int j = r + k -1;
            int temp = arr[j] - arr[r];
            ans = Math.min(ans,temp);
        }
        System.out.println(ans);
    }
        
}
