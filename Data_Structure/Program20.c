// Linear Search


#include <stdio.h>
int main()
{
    int array[100], search, c, number;
    printf("Enter the number of elements in array: ");
    scanf("%d",&number);
    printf("Enter %d numbers\n", number);
    for ( c = 0 ; c < number ; c++ )
        scanf("%d",&array[c]);
    printf("Enter the number to search\n");
    scanf("%d",&search);
    for ( c = 0 ; c < number ; c++ )
    {
        if ( array[c] == search )   /* if required element found */
        {
            printf("%d is present at location %d.\n", search, c+1);
            break;
        }
    }
    if ( c == number )
        printf("%d is not present in array.\n", search);
    return 0;
}

// OUTPUT
// Enter the number of elements in array
// 5
// Enter 5 numbers
// 12
// 23
// 22
// 10
// 45
// Enter the number to search
// 22
// 22 is present at location 3.

