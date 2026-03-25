package OOPS;
class Student{
    String name;
    int age1;
    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInfo(int age1){
        System.out.println(age1);
    }
    public void printInfo(String name,int age1){
        System.out.println(name+" "+age1);
    }
}


public class Lecture3 {
    public static void main(String[] args) {
        /***1.Function over loading --> Compile time polymorphism -->Diff difff functions consist of same name
            2.Function over riding --> Run time polymorphism***/
        Student s1 = new Student();
        s1.name = "Arun";
        s1.age1 = 23;
        s1.printInfo(s1.age1);

    }
}
