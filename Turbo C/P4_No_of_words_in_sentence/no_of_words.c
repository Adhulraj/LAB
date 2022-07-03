#include<stdio.h>
#include<conio.h>
#include<string.h>

void main(){
    char s[100];
    int i,count=1;
    // clrscr();
    printf("Enter the string: \n");
    gets(s);
    for(i=1;(s[i])!="\0";i++){
        if(s[i]==' '){
            count = count + 1;
        }
    }
    printf("\n the number of words in the sentence is %d",count);
    getch();
}