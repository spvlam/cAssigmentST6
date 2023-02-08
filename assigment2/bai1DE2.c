#include<stdio.h>
int arr[100];
int n; 
void nhap(){
   printf("so phan tu cua mang la : ");
   scanf("%d",&n);
   for(int i=0;i<n;i++){
       scanf("%d",&arr[i]);
   }
}
int check(int i){
      int left=0,right=0;
      for(int m=0;m<i;m++){
        left+=arr[m];
      }
      for (int m=n-1;m>i; m--)
      {
         right+=arr[m];
      }
      if (left==right)
      {
       return 1;
      }
      return 0;
}
int main(){
    nhap();
    for(int j=1;j<n-1;j++){
        if(check(j)==1){
            printf("YES");
            return 0;
        }
    }
    printf("NO");
}