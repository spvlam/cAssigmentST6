#include<stdio.h>
#include "student.h"
#include<ctype.h>
#include<string.h>
int compare(char *c,char *d){
   char e = c[0];
   int i=0;
    while (e!='\n')
    {
        char f = d[i];
        if (e!=f)
        {
            return 0;
        }
        i++;
    }
    if (d[i]!='\n') 
    {
       return 0;
    }
    return 1;
    
}
void display(){
    FILE *sv;
    sv = fopen("sv.txt","r");
    char c;
    while (!feof(sv))
    {
         c=fgetc(sv);
         printf("%c",c);
    }
    fclose(sv);
} 

void add(){
    student stu;
    FILE *sv;
    sv = fopen("sv.txt","a");
    char c;
do
{
    printf("name: ");
    scanf("%[^\n]%*c",stu.name);
    fflush(stdin);
    printf("score: ");
    scanf("%f",&stu.diem);
    fflush(stdin);
    fprintf(sv,"\n %-s \t %.2f ",stu.name,stu.diem);
    printf("do you want to add more : y for yes and otherwise ");
    scanf("%c",&c);
    fflush(stdin);
}while (c =='y' || c=='Y');
    fclose(sv);
}
void find(){
    char s[9];
    scanf("%s",&s);
    fflush(stdin);
    float score;
    int dem=0;
   FILE *sv;
    sv = fopen("sv.txt","r");
    while (!feof(sv))
    {
       char f[10],m[10],l[22];
       float score;
       fscanf(sv,"%s%s%s%f",&f,&m,&l,&score);
       if(strcmp(s,l)==0){
        printf("%s %s %s %.2f \n",f,m,l,score);
        dem+=1;
       }
    }
    if (dem==0){
        printf("do not have this student like this");
    }
    fclose(sv);
     
}

int main(){  
   int opt;
do
{
   printf("\n-------------------------QLSV-------------------------\n");
   printf("1:List of Student \n");
   printf("2:Add student \n");
   printf("3:Find student by name \n");
   printf("4:Exist \n");
   scanf("%d",&opt);
   fflush(stdin);
   switch (opt)
   {
   case 1:
       display();
    break;
   case 2:
       add();
       break;
    case 3:
       
        find();
       break;
    case 4: break;
   default:
    break;
   }
}while (opt!=4);
}