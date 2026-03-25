public class Maxarrnum {
    public static int Maxnum(int arr[],int n){
        //int ans = 0;
        //for(int i = 0;i<arr.length;i++){
        //    ans = Math.max(ans,arr[i]);
        //}
        //System.out.println(ans);

        //Recursive approach
        if (n == 1) return arr[0];
        return Math.max(arr[n-1],Maxnum(arr, n-1));
    }public static void main(String[] args) {
        int arr[]={1,4,2,1,7,8,9,5,3};
        System.out.println(Maxnum(arr,arr.length));
    }
    
}
