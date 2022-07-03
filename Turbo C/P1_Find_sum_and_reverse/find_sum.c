#include <stdio.h>
#include <conio.h>

void main(){
    // clrscr();
    int num,sum=0,rev=0,d;
    printf("Enter the number : ");
    scanf("%d",&num);
    while(num){
        d = num % 10;
        num = num / 10;
        sum = sum + d;
        rev = rev*10+d;
    }
    printf("Sum of digits = %d",sum);
    printf("\n Reverse of the number = %d",rev);
    getch();
}