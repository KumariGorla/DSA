//import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        int arr[] = {3,2,1,0,9,8,3,1,0,1,2,1,2};
        //Scanner sc = new Scanner(System.in);
        //int countEle = sc.nextInt();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%3==0){//(arr[i] == countEle)
                count = count + 1;
            }
        }
        System.out.println(count);
        //sc.close();
    }
}
