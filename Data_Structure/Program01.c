#include<stdio.h>
#include<conio.h>
void main()
{
	int i=-1;
	char str[200],rev[200];
	char *strptr = str;
	char *revptr = rev;
	printf("Enter the string : ");
	scanf("%s",&str);
	while(*strptr){
		strptr++;
		i++;
	}
	while(i>=0){
		strptr--;
		*revptr = *strptr;
		*revptr++;
		--i;
	}
	printf("Reverse of the string is : %s",rev);
	getch();
}