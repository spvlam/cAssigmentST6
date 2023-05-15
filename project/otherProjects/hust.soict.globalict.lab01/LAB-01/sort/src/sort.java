// package sort.src;
import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner scanf = new Scanner( System.in);
        System.out.print("nhap n = ");
        int n=scanf.nextInt();
        int [] arr= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]=",i);
            arr[i]=scanf.nextInt();
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int ex;
                    ex=arr[i];
                    arr[i]=arr[j];
                    arr[j]=ex;
                }
            }
        }
        System.out.println("the arrangement of array is : ");
        for(int i=0;i<n;i++){
            System.out.printf("  %d  ",arr[i]);
        }
        float avarage = sum/n;
        System.out.printf("\n the sum is %d and  avarage of array is %f",sum,avarage);
        scanf.close();
    }
   
}
