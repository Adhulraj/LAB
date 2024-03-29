// Stack using Linked list

#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct node
{ int data;
struct node *link;
};
void main()
{
    struct node *p, *x, *head, *top;
    int choice, item, ditem;
    x=(struct node*)malloc(sizeof (struct node));
    x->data=-1;
    x->link=NULL;
    top=x;
    head=x;
    p=x;
    printf("\n1.Push\n2.Pop\n3.Display\n4.Exit");
    do
    {
        printf("\n Enter the choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                printf("Enter the data: ");
                scanf("%d",&item);
                x=(struct node*)malloc(sizeof(struct node));
                x->data=item;
                x->link=NULL;
                p->link=x;
                p=x;
                top=x;
                break;
            
            case 2:
                if(top->data==-1)
                {
                    printf("Stack is empty!");
                }
                else
                {
                    p=head;
                    while(p->link!=top)
                    {
                        p=p->link;
                    }
                    ditem=top->data;
                    top=p;
                    top->link=NULL;
                    free(p->link);
                    printf("Popped item is: %d", ditem);
                }
                break;
            
            case 3:
                if(top->data==-1)
                {
                    printf("\n Stack is Empty!");
                }
                else
                {
                    printf("Stack Listed is: ");
                    p=head;
                    p=p->link;
                    while(p->link!=NULL)
                    {
                        printf("%d ", p->data);
                        p=p->link;
                    }
                    printf("%d ", p->data);
                }
                break;
            
            case 4:
                printf("Exit...");
        }
    }
            while(choice<4);
            getch();
        
}

// OUTPUT


// 1.Push
// 2.Pop
// 3.Display
// 4.Exit
//  Enter the choice: 1
// Enter the above: 2

//  Enter the choice: 1
// Enter the above: 3

//  Enter the choice: 1
// Enter the above: 5

//  Enter the choice: 3
// Stack Listed is: 235
//  Enter the choice: 2
// Popped item is: 5
//  Enter the choice: 3
// Stack Listed is: 23
//  Enter the choice: 4

//  Exit...
