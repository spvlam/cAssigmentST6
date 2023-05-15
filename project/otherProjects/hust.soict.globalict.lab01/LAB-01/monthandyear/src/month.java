package monthandyear.src;
import java.util.Arrays;
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
    Object[] check = {
        "January", "Jan.", "Jan", "1",
        "March", "Mar.", "Mar", "3",
        "May", "May.", "May", "5",
        "July", "Jul.", "Jul", "7",
        "August", "Aug.", "Aug", "8",
        "October", "Oct.", "Oct", "10",
        "December", "Dec.", "Dec", "12"
    };
    Object[] check2 = {"February", "Feb.", "Feb", "2"};
    Object[] check3={"April", "Apr.", "Apr", "4", "June", "Jun.", "Jun",
     "6", "September", "Sept.", "Sep", "9", 
     "November", "Nov.", "Nov", "11"};
    
    boolean result;
    boolean result2;
    boolean result3;
    String input,month;
    String[] parts ;
    int year;
    int i=0;
    do{
        if(i>=1){
            System.out.print("input again   ");
        }else{
            System.out.print("Enter month/year (format: month/year): ");
        }
        input = scanf.nextLine();
        parts = input.split("/");
        month = parts[0];
        year = Integer.parseInt(parts[1]);
        result = Arrays.asList(check).contains(month);
        result2 = Arrays.asList(check2).contains(month);
        result3 = Arrays.asList(check3).contains(month);
        i+=1;
    }while(!(result||result2||result3));
    if(result){
        System.out.print("there are 31 days");
    }else if (result3){
        System.out.print("there are 31 days");
    }else{
        if ( (year %4 != 0) || (year % 100 == 0 && year % 400 !=0) ){
            System.out.print("there are 28 days");
        }else{
            System.out.print("there are 29 days");
        }
    }
    scanf.close();
}
}
