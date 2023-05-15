package JavaBasic.src;
import java.util.Scanner;
public class inputFromKeyBoard {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("What is your name ? ");
        String strName = scanf.nextLine();
        System.out.print("How old are you ? ");
        int iAge = scanf.nextInt();
        System.out.print("How tall are you ? ");
        double dHight = scanf.nextDouble();
        System.out.println("Mr/ms " + strName +" is "+ iAge +" years old " + " your hight is  " + dHight + "." );
        scanf.close();
    }
}
