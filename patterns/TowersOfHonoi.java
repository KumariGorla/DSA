public class TowersOfHonoi {
    public static void TowersHonio(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        TowersHonio(n-1,src,dest,helper);
        System.out.println("transfer disk"+n+"From"+src+"to"+dest);
        TowersHonio(n-1,helper,src,dest);
    }public static void main(String[] args) {
        int n = 3;
        TowersHonio(n,"S","H","D");
        System.out.println("Total moves are hapended");
        System.out.println((int)Math.pow(2, n)-1);
    }
}
