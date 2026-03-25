public class greatestnum {
    public static void main(String[] args) {
        int n1 = 76,n2 = 75,n3 = 89,res,temp;
        if (n1 == n2){
            System.out.println("Both are equal");
        }else{
            temp =n1 < n2 ? n1 : n2;
            System.out.println(temp);
            
            //Greatest of three numbers
            res = temp > n3 ? temp:n3;
            System.out.println(res);
        }
    }
    
}
