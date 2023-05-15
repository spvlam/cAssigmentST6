package triangle.src;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        scanf.close();
        System.out.println();
        for(int i=0;i<n+1;i++){
            for(int m = 0;m<2*n+1;m++){
                if(n-i < m && m < n+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
}
