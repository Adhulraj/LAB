/*
            BINARY SEARCH
    -----------------------------------------

    AIM :
        Program to impliment binary search

    ALGORITHM :
*/

#include<stdio.h>
#include<conio.h>

void binary_search();

int a[50],i,n,item,loc,beg,mid,end;

void main(){
    printf("Enter the size of the arrray: ");
    scanf("%d",&n);
    printf("Enter the elements of the array: ");
    for ( i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the item to be searched: ");
    scanf("%d",&item);
    binary_search();
    getch();
}

void binary_search(){
    beg=0;
    end=n-1;
    mid=(beg+end)/2;
    while((beg<=end)&&(a[mid]!=item)){
        if (item<a[mid])
        {
            end=mid-1;
        }
        else
        {
            beg=mid+1;
 
        }
        mid = (beg + end) / 2;
    }
        if(a[mid]==item)
            printf("\nItem found at location %d",mid+1);
        else    
            printf("\nItem not found.");
    
}

/*

    OUTPUT

Enter the size of the arrray: 5
Enter the elements of the array: 1
2
3
4
5
Enter the item to be searched: 3

Item found at location 3

Enter the size of the arrray: 5
Enter the elements of the array: 1
2
3
4
5
Enter the item to be searched: 7

Item not found.
*/