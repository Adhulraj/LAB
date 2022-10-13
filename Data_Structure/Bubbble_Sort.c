// Bubble Sort

#include<stdio.h>
#include<conio.h>
void main(){

   int count, temp, i, j, number[30];

   printf("How many numbers are u going to enter?: ");
   scanf("%d",&count);
   printf("Enter %d numbers: ",count);
   for(i=0;i<count;i++)
   scanf("%d",&number[i]);

  
   for(i=count-2;i>=0;i--)
{
      for(j=0;j<=i;j++)
{
        if(number[j]>number[j+1])
{
           temp=number[j];
           number[j]=number[j+1];
           number[j+1]=temp;
        }
      }
   }

   printf("Sorted elements: ");
   for(i=0;i<count;i++)
      printf(" %d",number[i]);
}

// OUTPUT
// How many numbers are u going to enter?: 5
// Enter 5 numbers: 8
// 6
// 9
// 1
// 2
// Sorted elements:  1 2 6 8 9

