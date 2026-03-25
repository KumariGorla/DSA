public class subarray3 {
    public static void main(String[] args) {
        int arr[]={1,4,45,6,10,8};
        int n = arr.length;
        int sl = 3;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<n-sl;i++){//<= ayithe n-sl+1 or < ayithe n-sl
            int j = i+sl-1;
            int sum = 0;
            for(int k = i;k<=j;k++){
                sum += arr[k];


            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
        
    }
}

