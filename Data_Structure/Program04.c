/*
            APPEND TWO ARRAYS
    -----------------------------------------

    AIM :
        Program to append two arrays

    ALGORITHM :
*/

#include<stdio.h>
#include<conio.h>

void main(){
    int n1,n2,i,j,a[20],b[10],k;
    printf("Enter the size of the first array :");
    scanf("%d",&n1);
    printf("Enter the size of the second array :");
    scanf("%d",&n2);
    printf("Enter the lements of the first array: \n");
    for ( i = 0; i < n1; i++)
        scanf("%d",&a[i]);
    printf("Enter the elements of the second array: \n");
    for ( j = 0; j < n2; j++)
        scanf("%d",&b[j]);
    for ( k=i,j=0; k < n1+n2; k++)
    {
        a[k]=b[j];
        j++;
    }
    printf("The Appended array is :\n");
    for ( i = 0; i < n1+n2; i++)
    {
        printf("%d ",a[i]);
    }
}

/*

    OUTPUT

Enter the size of the first array :3
Enter the size of the second array :3
Enter the lements of the first array:
1
2
3
Enter the elements of the second array:
4
5
6
The Appended array is :
1 2 3 4 5 6

*/