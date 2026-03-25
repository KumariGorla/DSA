package Bank;
class Acc{
    public String name;
    protected String email;
    private String pwd;
    //getters and setters are used for access private var
    public String getPwd(){
        return this.pwd;
    }
    public void setPwd(String pass){
        this.pwd = pass;
    }

}

public class bank {
    public static void main(String[] args) {
        Acc a1 = new Acc();
        a1.name = "Ists clg";
        a1.email = "istsplacement@gmail.com";
        a1.setPwd("12334");
        a1.getPwd();
        System.out.println(a1.getPwd());
        
    }
}
/***Access Modifiers are 4 types in JAVA
 1.public
 2.private
 3.protected
 4.default
 ***/

