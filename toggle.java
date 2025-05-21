//public class toggle {
//    public static void main(String args[]){
//        int n = 5;
//        int pos = 2;
//        int bitMask = 4<<pos;
//        int numNumber = n ^ bitMask;
//        System.out.println("Original Number (Binary): " + Integer.toBinaryString(n));
//        System.out.println("New Number (Binary)     : " + Integer.toBinaryString(numNumber));
//        System.out.println("New Number (Decimal)    : " + numNumber);
//    }
//}


//Using functions

public class toggle{
    public static void main(String[] args) {
        int res = Togglenum(5, 2);
        //System.out.println("Original Number (Binary): " + Integer.toBinaryString(n));
        System.out.println(res);
    }
    public static int Togglenum(int n,int pos){
        int bitMask = 4<<pos;
        int numNumber = n ^ bitMask;
        System.out.println("Original Number (Binary): " + Integer.toBinaryString(n));
        System.out.println("New Number (Binary)     : " + Integer.toBinaryString(numNumber));
        //System.out.println("New Number (Decimal)    : " + numNumber);
        return numNumber;

    }

}

