// Sort a given list of Strings
#include<stdio.h>
#include<conio.h>
void main()
{
    char city[5][20];
    int i,j;
    // clrscr();
    printf("Enter the Names to Sort: \n");
    for(i=0; i<5; i++)
        scanf("%s",&city[i]);
    printf("Sorted list of Names are: \n");
    for(i=65; i<122; i++)
    {
        for(j=0; j<5; j++)
        {
            if(city[j][0]==i)
                printf("\n%s",city[j]);
        }
    }
}


// OUTPUT
// Enter the Names to Sort:

// Computer
// Bees
// Eclipse
// Apple
// Zoo
// Sorted list of Names are:


// Apple
// Bees
// Computer
// Eclipse
// Zoo

