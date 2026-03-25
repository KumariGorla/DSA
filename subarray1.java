public class subarray1 {
    public static void main(String[] args) {
        int arr[] = {0,1,3,1,1,6,7,1,0,1};
        int k = 2;
        int n = arr.length;
        int l = 0;
        int temp = 2;
        int ans = 0;
        for(int r = 0;r<n;r++){
            
            if(arr[r] == 1){
                temp++;
            }
            while(temp > k){
                if(arr[r] == 1){
                    temp--;
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);

        }
        System.out.println(ans);
       
    }
}
