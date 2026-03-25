import java.util.*;
public class nof1tpsw {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int n = arr.length;
        int l   = 0;
        for(int r = 0;r<n;r++){
            if(arr[r]!=0){
                int temp = arr[r];
                arr[r]= arr[l];
                arr[l] = temp;
                l++;
                
            }
            
            
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
