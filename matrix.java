class matrix{
    public static void main(String[] args) {
        int arr[][] = {{0,0,1},{1,1,1},{1,0,0}};
        int n = arr.length;
        int[] zeros = new int[n];
        for(int i = 0;i<n;i++){
            int count  = 0;
            for(int j = n-1;j>=0&&arr[i][j]==0;j--){
                count++;

            }
            zeros[i] = count;

        }
        int swaps = 0;
        for(int i = 0;i<n;i++){
            int needed = n-i-1;
            int j = i;
            while(j<n&&zeros[i]<needed) j++;
            if(j==n) System.out.println(-1);
            while(j>i){
                int temp = zeros[i];
                zeros[i] = zeros[j-1];
                zeros[j-1] = temp;
                j--;
                swaps++;
            }
        }
        System.out.println(swaps);

    }
}