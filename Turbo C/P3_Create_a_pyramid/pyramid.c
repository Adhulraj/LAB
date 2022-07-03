#include <stdio.h>

void main(){
    int i,j,n;
    printf("Enter the number of rows\n");
    scanf("%d",&n);
    for(i=0;j<n;i++){
        for(j=0;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
    getch();
}