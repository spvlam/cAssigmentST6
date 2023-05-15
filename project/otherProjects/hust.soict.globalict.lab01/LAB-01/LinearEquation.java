import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args) {
        double a,b;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = scanf.nextDouble();
        System.out.print("Enter b = ");
        b = scanf.nextDouble();
        if ( a == 0 && b==0){
            System.out.println("there are many sollutions ");
        }else if(a == 0 && b!=0){
            System.out.println("there is no  sollution ");
        }else{
            System.out.printf("the solution is x = %f",-b/a);
        }
        scanf.close();
    }
}
