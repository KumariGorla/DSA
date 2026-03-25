public class subarryodd {
    public static void main(String[] args) {
        int arr[]={3,4,7,2};
        int k = 1;
        int temp = 0;
        int n = arr.length;
        int ans = 0;
        int l = 0;
        for(int r = 0;r<n;r++){
            if(arr[r] %2==1 ){
                temp++;
            }
            while(temp>k){
                if(arr[l]%2==1){
                    temp--; 
                }
                l++;
            
            }
            ans = Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
    
}
