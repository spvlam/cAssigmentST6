#include<stdio.h>
double factory(double n){
    if (n==1) return 1;
    else return n*factory(n-1);
}
double tohop(double n, double k){
    return factory(n)/(factory(k)*factory(n-k));
}

int main(){
    FILE *dRead ,*dWrite;
    dRead = fopen("tohop.inp","r");
    dWrite= fopen("tohop.out","w");
    double n,k;
    while (!feof(dRead))
    {
        fscanf(dRead,"%lf%lf",&n,&k);
        fprintf(dWrite,"%.lf\n",tohop(n,k));
    }
 fclose(dWrite);
 fclose(dRead);
    
}