public class bitmani {
    public static void main(String[] args) {
        int n = 6;
        int pos =  1;
        int bitmask = 1 << pos;
        int res = bitmask | n;
        if (res==0){
            System.out.println("Bit is zero");
        }else{
            System.out.println("Bit is not zero");
        }
    }
}
