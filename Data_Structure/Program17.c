// Implement selection sort.


#include<stdio.h>
#include<conio.h>
int main()
{
int a[100], n, i, j, position, swap;
printf("Enter number of elements: \n");
scanf("%d", &n);
printf("Enter %d Numbers: \n", n);
for (i = 0; i < n; i++)
scanf("%d", &a[i]);
for(i = 0; i < n - 1; i++)
{
    position=i;
    for(j = i + 1; j < n; j++)
    {
        if(a[position] > a[j])
        position=j;
    }
    if(position != i)
    {
        swap=a[i];
        a[i]=a[position];
        a[position]=swap;
    }
}
printf("Sorted Array: \n");
for(i = 0; i < n; i++)
printf("%d\n", a[i]);
return 0;
}

// OUTPUT
// Enter number of elements: 
// 4
// Enter 4 Numbers: 
// 6
// 1
// 4
// 3
// Sorted Array: 
// 1
// 3
// 4
// 6
