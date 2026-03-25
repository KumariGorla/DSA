public class leapyear {
    public static void LeapYear(int year){
        if(year%4==0 && year%400==0){
            System.out.println("Leap year");
        }else if(year % 100 != 0){
            System.out.println("leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }public static void main(String[] args) {
        LeapYear(2004);
        
    }
    
}
