public class conseq1 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,0,0,1,1,1,1};
        int n = nums.length;
        int l = 0;
        int temp = 0;
        int ans = 0;
        int k =2;
        for(int r = 0;r<n;r++){
            if(nums[r]==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]==1){
                    temp--;
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
