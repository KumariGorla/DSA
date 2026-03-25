package OOPS;

public class Lecture2 {
    public static void main(String[] args) {
        //For non parametarized constructor


        //Student s1 = new Student();

        //s1.name = "Aman";
        //s1.rollno = 43;

        //For parametarized constructor
        //Student s1 = new Student("LILI",21);

        //For copy constructor

        Student s1 = new Student();
        s1.name = "Arya";
        s1.rollno = 34;
        Student s2 = new Student(s1);
        s2.PrintInfo();

        
        
    }
}
class Student{
    String name;
    int rollno;
    
    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
    }
    //Non parametarized constructor


    //Student(){
    //    System.out.println("Constructor called");
    //}

    //Parametarized constructor
    //Student(String name,int rollno){
    //    this.name = name;
    //    this.rollno = rollno;
//
    //}
    Student(Student s2){
        this.name = s2.name;
        this.rollno = s2.rollno;
    }
    Student(){
        
    }


}
