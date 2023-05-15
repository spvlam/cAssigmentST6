import java.util.Scanner;
public class secondOrder {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanf = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = scanf.nextDouble();
        System.out.print("Enter b = ");
        b = scanf.nextDouble();
        System.out.print("Enter c = ");
        c = scanf.nextDouble();
        double delta  = b*b - 4*a*c;
        if(delta < 0 ){
            System.out.println("There is no sollutions");
        }else if(delta == 0 ){
            System.out.printf("there is one sollutions %f",-b/2*a);
        }else{
            System.out.printf("There are tow sollution x1 =%f and x2=%f",(-b-Math.sqrt(delta))/2*a,(-b+Math.sqrt(delta))/2*a);
        }
        scanf.close();
    }
}
