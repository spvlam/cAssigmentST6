#include<stdio.h>

int main(){
    FILE *temp;
    temp = fopen("temp.dat.txt","r");
    double tem[1000],tem2[1000];;
    int i=0,j=0;
    int date,month,year,hour,min,sec;
    double tema;
    double sum1=0,sum2=0;
    char c[5];
    while (!feof(temp))
    {
        fscanf(temp,"%d%*c%d%*c%d%d%*c%d%*c%d",&date,&month,&year,&hour,&min,&sec);
        fscanf(temp,"%lf",&tema);
        if(hour>=5 && ( hour <=15) ){
            tem[i]=tema;
            sum1+=tema;
            i++;
        }
        else if(hour>=16 && ( hour <=21) ){
            tem2[j]=tema;
            sum2+=tema;
            j++;
        }
    }
    if(sum1==0 ){
        printf("the avarage temperature from 5 am to 3 pm is 0 \n");
    }else{
        printf("the avarage temperature from 5 am to 3 pm is %.3lf \n",sum1/i);
    }
      if(sum2==0 ){
        printf("the avarage temperature from 4 pm to 9 pm is 0 \n");
    }else{
        printf("the avarage temperature from 4 am to 9 pm is %.3lf \n",sum2/j);
    }
    fclose(temp);
}