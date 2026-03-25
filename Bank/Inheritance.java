package Bank;

//Single level inheritance
class Shape{
    String color;
    public void area(){
        System.out.println("Display area");
    }

}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println((1/2)*l*h);
    }
}
//Heirarchial Inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//Multilevel Inheritance
class Equilatriangle extends Triangle{
    public void are(int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        //t1.color = "red";
        //Circle t2 = new Circle();
        
        t1.area(2,46);

        Bank.Acc a1 = new Bank.Acc();
        a1.name = "Kamal";
        
    }
}
