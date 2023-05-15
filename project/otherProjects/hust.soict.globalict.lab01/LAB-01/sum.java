import java.util.Scanner;
public class sum {
   public static void main(String[] args) {
    String strnum1, strnum2;
    Scanner scanf = new Scanner(System.in);
    System.out.print("enter the the first number : ");
    strnum1 = scanf.nextLine();
    System.out.print("enter the the second number : ");
    strnum2 = scanf.nextLine();
    double num1 = Double.parseDouble(strnum1);
    double num2 = Double.parseDouble(strnum2);
    scanf.close();
    System.out.printf("The sum of the first number and the second number is %.2f \n", num1 + num2);
    System.out.printf("The difference of tow numbers is %.2f\n", num1 - num2);
    System.out.printf("The product of tow numbers is %.2f\n", num1*num2);
    System.out.printf("The quotient of tow numbers is %.2f\n", num1/num2);
   }
}
