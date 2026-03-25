

class Leetcode1{
    public static void main(String[] args) {
        int arr[] = {5,9,1,8,7};
        int l = 0;
        int n = arr.length;
        int temp = 0,ans = 0;
        for(int r = 0;r<n;r++){
            temp += arr[r];
            if(r-l == 3){
                temp -= arr[l];
                l++;
            }
            if(r-l+1==3){
                ans = Math.max(ans,temp);

            }
            
            

        }
        System.out.println(ans);
    }
}//using two pointers and sliding window


