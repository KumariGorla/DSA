public class presum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        for(int i = 0;i<pre.length;i++){
            System.out.print(pre[i]+" ");
        }
    }
}
