public class threshold {
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,5,5,5,8};
        int sl = 3;
        int l = 0;
        int n = arr.length;
        int temp = 0;
        int th = 4;
        int ans = 0;
        for(int r = 0;r<n;r++){
            temp += arr[r];
            if(r-l==sl){
                temp = temp - arr[l];
                l++;
            }
            if(r-l+1==sl){
                int res  = temp/sl;
                if(res>=th)
                    ans += 1;
            }

        }
        System.out.println(ans);
        
    }//1343
}
//int arr[] = {1,2,3,1,4};
//        int n = arr.length;
//        int sl = 3;
//        int thres_hold = 7;
//        int ans = 0;
//        for(int i = 0;i<=n-sl;i++){
//            int j = i+sl-1;
//            int sum = 0;
//            for(int k = i;k<=j;k++){
//                sum+= arr[k];
//                
//                
//
//            }
//            if(sum>=thres_hold)
//                ans++;
//
//        }
//        System.out.println(ans);