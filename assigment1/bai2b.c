// giai thuat quy hoach dong
#include<stdio.h>
int num,expW;
int g[100],v[100];
char typ[100];
int quantity[100];
int maxW=-5;
int curW=0;
int quaF[100];

void trya(int k){ 
        int m = expW/g[k];
        for(int j=0;j<=m;j++){
            curW+=v[k]*j;
            expW-=j*g[k];
            quantity[k]=j;
            if(k==num-1){
                if(curW>maxW){
                    maxW=curW;
                    for(int a=0;a<k+1;a++){
                        quaF[a]=quantity[a];
                    }
                }
            }else{
                trya(k+1);
            }
            curW-=v[k]*j;
            expW+=j*g[k];
        }
}
int main(){
    FILE *pt;
    pt = fopen("bag.inp","r");
    fscanf(pt,"%d%d",&num,&expW);
    for(int i=0;i<num;i++){
        fscanf(pt,"%d %d %c",&g[i],&v[i],&typ[i]);
        //  the code will be wrong if we do not use space fscanf(pt,"%d%d%c",&g[i],&v[i],&typ[i]);
    }
    fclose(pt);
    trya(0);
    printf("%d\n",maxW);
    for(int a=0;a<num;a++){
        if(quaF[a]!=0){
            printf("%c \t %d \n",typ[a],quaF[a]);
          }
   }
}