#include<stdio.h>
#include<time.h>
#include<stdlib.h>
#include <stdbool.h>
int i=0;
int dachia[55];
char card[13][13]={"ace","tow","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
char material[4][13]={"heart","diamond","clube","spade"};
bool checkRand(int c){
    for (int m=0;m<i;m++){
        if(dachia[m]==c){
            return false;
        }
    }
    return true;
}
void convert(int a[]){
    int b[13];
    printf("( ");
    for (int m=0;m<13;m++){
        int x=a[m]/4;
        b[m]=x;
        int  y=a[m]%4;
        printf("%s %s ,",card[x],material[y]);
            }
     printf(") ");
     for (int m=0;m<13;m++)
     {
        int dem=0;
         for (int n=0;n<13;n++){
              if (m==b[n]){
                dem++;
              }
         }
         if (dem==4)
         {
           printf("\n co tuong quy ");
        
         }else{
            printf("\n khong co tuong quy");
            break;
         }
         
     }
     

}
int main(){
   int ng1[13],ng2[13],ng3[13],ng4[13];
   int c;
   int dem=0,dem2=0,dem3=0, dem4=0;
        while (i<52)
        { 
           
            c= rand()%52;
            if (i%4==0){ 
                
                while (checkRand(c)==false)
                {
                   c= rand()%52;
                }
                dachia[i]=c;
                ng1[dem]=c;
                dem++;
            }
            else if (i%4==1){
            
                while (checkRand(c)==false)
                {
                   c= rand()%52;
                }
                dachia[i]=c;
                ng2[dem2]=c;
                dem2++;
                
            }
            else if (i%4==2)
            {
                 while (checkRand(c)==false)
                {
                   c= rand()%52;
                }
                dachia[i]=c;
                ng3[dem3]=c;
                dem3++;
            }else{
                 while (checkRand(c)==false)
                {
                   c= rand()%52;
                }
                dachia[i]=c;
                ng4[dem4]=c;
                dem4++;
                
            }
             i++;
        }
   convert(ng1);
   printf("\n");
   convert(ng2);
   printf("\n");
   convert(ng3);
   printf("\n");
   convert(ng4);
}