/*
		REVERSE OF A STRING USING POINTERS
	-----------------------------------------

	AIM :
		Program to reverse a string using pointers

	ALGORITHM :

		STEP 01: START
		STEP 02: Declare char str,rev,*strptr,*revptr
		STEP 03: Read str
		STEP 04: Repeat Step 5 while *strtr
		STEP 05: 	Increment strptr,i
		STEP 06: Repeat Step 7 to Step 9 while i>=0
		STEP 07:		Decrement strptr,i
		STEP 08: 	*revptr=*strptr
		STEP 09: 	increment *revptr
		STEP 10: STOP


*/


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
	while(*strptr){ //get length of str
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

/*
	---------------------------------------------------

	OUTPUT

	Enter the string : hello
	Reverse of the string is : olleh

*/