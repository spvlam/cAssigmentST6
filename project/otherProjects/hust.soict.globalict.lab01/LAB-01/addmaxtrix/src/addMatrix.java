package addmaxtrix.src;
import java.util.Scanner;
public class addMatrix {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("the size of matrix is ");
        int n = scanf.nextInt();
        int a[][]= new int[n][n];
        int b[][] =new int[n][n];
        int c[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j]=scanf.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("b[%d][%d] = ",i,j);
                b[i][j]=scanf.nextInt();
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the sum of given two matrix is ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%d ",c[i][j]);
            }
            System.out.println();
        }
        scanf.close();
    }
}