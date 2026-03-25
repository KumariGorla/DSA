import java.util.*;
public class mcobcwd {
    public static void main(String[] args) {
        int arr[] = {6,5,7,9,2,2};
        Arrays.sort(arr);
        int ans  = 0;
        int n = arr.length;
        for(int i = arr.length-1;i>=0;i--){
            if(i%3!=n%3)
                ans += arr[i];
        }
        System.out.println(ans);
    }
}
