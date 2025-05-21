public class poweroftwo {
    public static void main(String args[]){
        
        int n = 5;
        //int pos = 2;
        //int bitMask = 1<<pos;
        //System.out.println(bitMask);
        //int newNumber = bitMask & n;
        //if(newNumber % 2 == 0){
        //    System.out.println("Power of two");
        //}else{
        //    System.out.println("Not a Power of two");
        //}
        if((n & (n - 1)) == 0 && n > 0){
            System.out.println(n + " " + "is a Power of two");
        }else{
            System.out.println(n + " " + "is not a power of two");
        }
    }
}
