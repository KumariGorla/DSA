import java.util.Scanner;
public class NumberConverter {
   
   // Convert decimal to binary
   public static String decimalToBinary(int n) {
       String binary = "";
       while (n > 0) {
           binary = (n % 2) + binary;  // Store remainder (0 or 1)
           n = n / 2;  // Divide by 2
       }
       return binary;
   }
   // Convert binary to decimal
   public static int binaryToDecimal(String binary) {
       int decimal = 0;
       int power = 1;  // Represents 2^0 initially
       // Read binary from right to left
       for (int i = binary.length() - 1; i >= 0; i--) {
           if (binary.charAt(i) == '1') {
               decimal += power;  // Add the power of 2
           }
           power *= 2;  // Move to the next power of 2
       }
       return decimal;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // Convert Decimal to Binary
       System.out.print("Enter a decimal number: ");
       int decimal = sc.nextInt();
       System.out.println("Binary: " + decimalToBinary(decimal));
       // Convert Binary to Decimal
       System.out.print("Enter a binary number: ");
       String binary = sc.next();
       System.out.println("Decimal: " + binaryToDecimal(binary));
       sc.close();
   }
}