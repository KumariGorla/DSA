class varslidwind{
    public static void main(String[] args) {
        //int arr[] = {1,8,3,7,5,6};
        //int n = arr.length;
        //int sl = 3;
        //
        //int maxval = 0;
        //int temp = 0;
        //int l = 0;
        //for(int r=0;r<n-sl;r++){
        //    int j = r+sl-1;
        //    int temp = 0;
        //    for(int k = r;k<=j;k++){
        //        temp += arr[k];
//
        //    }
        //    if(temp>maxval)
        //        maxval = temp;
        //}
        //System.out.println(maxval);
        //for(int r = 0;r<n;r++){
        //    temp += arr[r];
        //    if(r-l==sl){
        //        temp -= arr[l];
        //        l++;
        //    }
        //    if(r-l+1==sl){
        //        maxval = Math.max(maxval,temp);
        //    }
        //}
        //System.out.println(maxval);
        int arr[] = {1,8,3,7,5,6};
        int n = arr.length;
        int k = 10;
        int l = 0;
        int temp = 0;
        int ans = 0;
        for(int r = 0;r<n;r++){
            temp += arr[r];
            while(temp>k){
                temp -= arr[l];
                l++;

            }
            ans = Math.max(ans,r-l+1);
        }
        System.out.println(ans);
        
        

    }
}

//variable sliding window
