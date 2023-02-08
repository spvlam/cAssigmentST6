// GIẢI THUẬT THAM LAM
#include<stdio.h>
void arrange(int a[], int b[], float c[],char name[], int size){
    for( int i=0;i<size;i++){
        for ( int j=i+1;j<size;j++){
            if(c[i]<c[j]){
                int ex;
                ex =c[i];
                c[i]=c[j];
                c[j]=ex;
                 ex =a[i];
                a[i]=a[j];
                a[j]=ex;
                 ex =b[i];
                b[i]=b[j];
                b[j]=ex;
                char exname;
                 exname =name[i];
                name[i]=name[j];
                name[j]=exname;
            }
        }
    }
}
int main(){
    char name[100];
    int  weight[100];
    int value[100];
    int neV , amount;
    FILE *dread, *dWrite;
    float valP[100];
    FILE *dWrite0 ;
    printf("NHAP DU LIEU (THEO DONG) : \n");
    dWrite0 = fopen("bag.inp","w");
    scanf("%d%*c%d",&amount,&neV);
    fprintf(dWrite0,"%d %d",amount,neV);
    for( int m=0;m<amount+1;m++){
        char n[40];
        scanf("%[^\n]%*c",&n);
        fprintf(dWrite0,"%s\n",n);
        fflush(stdin);

    } 
    fclose(dWrite0);
    
    dread = fopen("bag.inp","r");
    dWrite=fopen("result.out","w");
    fscanf(dread,"%d%d",&amount,&neV);
    int i=0;
    while (!feof(dread))
    {
        // note that why its get the finish value
        int w,v;
        char n;
        fscanf(dread,"%d%d",&w,&v);
        n = getc(dread);
        while (n==' ')
        {
           n = getc(dread);
        }
        weight[i]=w;
        value[i]=v;
        name[i]=n;
        i++;
    }
    // for( int j =0;j<i-1;j++){
    //     printf("%d %d %c\n",weight[j],value[j], name[j]);
    // }
    for( int j=0;j<i-1;j++){
        float c= value[j];
        float d = weight[j];
        valP[j]=c/d;
    }

   arrange(weight,value,valP,name,i-1);
//    for( int j =0;j<i-1;j++){
//         printf("%d %d %.1f\n",weight[j],value[j], valP[j]);
//     }
   int ge=0;
   int expect=0;
   char path[100];
   int quanlity[100];
   int rea=0;
   while ( ge < i-1)
   {
     int num = neV/weight[ge];
    //  printf("%d\n",num);
     neV-= num*weight[ge];
     expect += num*value[ge];
    if (num >0){
        path[rea] = name[ge];
        quanlity[rea]=num;
        rea++;
    }
     ge++;
   }
   fprintf(dWrite,"%d \n",expect);
   for( int m=0;m<rea;m++){
     fprintf(dWrite,"%c %d \n",path[m],quanlity[m]);
   }
   
   fclose(dWrite);
   fclose(dread);
   FILE *dread2 ;
   dread2 = fopen("result.out","r");
   char c='a';
   while (1)
   {
     c= fgetc(dread2);
     if (feof(dread2)){
        break;
     }
     printf("%c",c);
   }
   fclose(dread2);
}