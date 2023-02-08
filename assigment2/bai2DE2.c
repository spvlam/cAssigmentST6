#include<stdio.h>
#include<time.h>
#include <stdlib.h>
int main(){
    srand(time(NULL));
    int rand(void);
   int x = rand()%100;
   int y;
   printf("gess y = ");
   scanf("%d",&y);
   while (x!=y)
   {
        if (x>y)
        {
          printf("your guess are too small, put again : ");
           scanf("%d",&y);
        }else{
             printf("your guess are too large, put again : ");
           scanf("%d",&y);
        }
   }
   printf("EXACTLY ");
   
}