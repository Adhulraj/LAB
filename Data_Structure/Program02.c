/*
        REVERSE OF A STRING USING POINTERS
    -----------------------------------------

    AIM :
        Program to reverse a string using pointers

    ALGORITHM :

        STEP 01: START
        STEP 02: Declare a[20][20],i,j,r,c,item,flag=0
        STEP 03: Read r,c
        STEP 04: Repeat Step 5 for i=0 to i<r
        STEP 05:    Repeat Step 6 for j=0 to j<c
        STEP 06:        Read a[i][j]
        STEP 07: Read item
        STEP 08: Repeat Step 9 for i=0 to i<r
        STEP 09:    Repeat Step 10 for j=0 to j<c
        STEP 10:        if a[i][j]==item set flag=1 Display Item found at i,j goto Step 11
        STEP 11: If flag==0 Display Not Found
        STEP 12: STOP


*/

#include<stdio.h>
#include<conio.h>

void main(){
    int a[20][20], i, j, r, c, item, flag = 0;
    printf("Enter the size of the row: ");
    scanf("%d",&r);
    printf("Enter the size of the column: ");
    scanf("%d", &c);
    printf("Enter the elements:\n");
    for(i=0;i<r;i++)
        for(j=0;j<c;j++)
            scanf("%d",&a[i][j]);
    printf("Enter the item to search: ");
    scanf("%d",&item);
    for(i=0;i<r;i++)
        for(j=0;j<c;j++)
            if(a[i][j]==item){
                printf("\nItem found at %d row %d column",i,j);
                flag=1;
                break;
            }
    
    if(flag==0)
        printf("Item Not Found");
    getch();
    

}

/*
----------------------------------------------------------

    OUTPUT

    Enter the size of the row: 2
    Enter the size of the column: 2
    Enter the elements:
    1
    2
    3
    4
    Enter the item to search: 4
    
    Item found at 1 row 1 column

*/