package OOPS;
class book{
    String type;
    String version;
    public void read(){
        System.out.println("Read it");
    }
    public void PrintRes(){
        System.out.println(this.type);
        System.out.println(this.version);
    }
}
public class Lecture1 {
    public static void main(String[] args) {
        book b = new book();
        b.type = "Horror";
        b.version = "classic 2.0";

        //book b2 = new book();
        //b2.type = "History";
        //b2.version = "Modern 3.6";

        b.read();
        b.PrintRes();
    }
}
