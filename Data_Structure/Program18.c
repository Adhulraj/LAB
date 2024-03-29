// Implement Insertion sort


#include<stdio.h>
#include<conio.h>
void InsertionSort(int a[], int n)
{
    int j, p;
    int tmp;
    for(p = 1; p < n; p++)
    {
        tmp = a[p];
        for(j = p; j > 0 && a[j-1] > tmp; j--)
        a[j] = a[j-1];
        a[j] = tmp;
    }
}
 
int main()
{
    int i, n, a[10];
    printf("Enter the number of elements :: ");
    scanf("%d",&n);
    printf("Enter the elements :: \n");
    for(i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    InsertionSort(a,n);
    printf("The sorted elements are ::  ");
    for(i = 0; i < n; i++)
    printf("%d  ",a[i]);
    printf("\n");
    return 0;
}
// OUTPUT
// Enter the number of elements :: 3
// Enter the elements :: 
// 6
// 4
// 8
// The sorted elements are ::  4  6  8  
