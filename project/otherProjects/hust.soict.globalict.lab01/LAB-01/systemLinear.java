import java.util.Scanner;
public class systemLinear {
    public static void main(String[] args) {
        double a11,a12,a21,a22,b1,b2;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a11 = ");
        a11 = scanf.nextDouble();
        System.out.print("Enter a12 = ");
        a12 = scanf.nextDouble();
        System.out.print("Enter b1 = ");
        b1 = scanf.nextDouble();
        System.out.print("Enter a21 = ");
        a21 = scanf.nextDouble();
        System.out.print("Enter a22 = ");
        a22 = scanf.nextDouble();
        System.out.print("Enter b2 = ");
        b2 = scanf.nextDouble();
        double del = a11*a22-a12*a21;
        if(del==0){
            if(b1/b2!=a11/a21 && b1/b2 != a12/a22){
                System.out.println("There is no sollutions");
            }else{
                System.out.println("There are many sollutions");
            }
        }else{
           double x1,x2;
           x1= (b1*a22-b2*a12)/(a22*a11-a12*a21);
           x2 = (b2*a11-b1*a21)/(a22*a11-a12*a21);
           System.out.printf("x1 = %f \n x2 = %f", x1,x2);
        }
        scanf.close();
    }
}
