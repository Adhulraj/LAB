// Implement exchange sort


#include<stdio.h>
#include<conio.h>
void main()
{
    int array[5];
    int i, j, temp, n;
    printf("Enter the limit: \n");
    scanf("%d", &n);
    printf("Enter the Elements: \n");
    for(i=0;i<n;i++)
    {
        scanf("%d", &array[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(array[i]>array[j])
            {
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
    printf("\n Sorted Array is: \n");
    for(i=0;i<n;i++)
    {
        printf("%d\n", array[i]);
    }
    getch();
}

// OUTPUT

// Enter the limit:
// 5
// Enter the Elements: 
// 6
// 2
// 8
// 3
// 7

//  Sorted Array is: 
// 2
// 3
// 6
// 7
// 8
