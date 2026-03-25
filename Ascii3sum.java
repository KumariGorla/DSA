class Main {
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E'};
        int n = arr.length;
        int sl = 3;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<=n-sl;i++){
            int j = i+sl-1;
            int sum = 0;
            for(int k = i;k<=j;k++){
                sum += arr[k];
            }
            if(sum>maxsum){
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}