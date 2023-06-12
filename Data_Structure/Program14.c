// Implement Queue Using Linked list

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void enq();
void deq();
void display();
void main()
{
    int n;
    printf("\tMenu\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
    do
    {
        printf("Enter your Choice: ");
        scanf("%d", &n);
        switch(n)
        {
            case 1:
            enq();
            break;

            case 2:
            deq();
            break;
            
            case 3:
            display();
            break;
            
            case 4:
            printf("\nExit:");
            break;
        }
    }
    while(n!=4);
    getch();
}

typedef struct node
{
    int data;
    struct node *link;
}n;
n*front=NULL;
n*rear=NULL;

void enq()
{
    int item;
    n *temp;
    printf("Enter the item: ");
    scanf("%d", &item);
    temp=(n*)malloc(sizeof(n));
    temp->data=item;
    temp->link=NULL;
    if(rear==NULL)
    {
        front=temp;
        rear=temp;
    }
    else
    {
        rear->link=temp;
        rear=temp;
    }
}

void deq()
{
    int item;
    if(front==NULL)
    printf("Queue is Empty!\n");
    else
    {
        item=front->data;
        printf("The element deleted is: %d\n", item);
    }
    if(front==rear)
    {
        front=NULL;
        rear=NULL;
    }
    else
    front=front->link;
}

void display()
{
    n*ptr;
    if(front==NULL){
        printf("Queue is Empty!\n");
        return;
    }
    else
    ptr=front;
    printf("The elements of the Queue are: ");
    while(ptr!=NULL)
    {
        printf("%d  ", ptr->data);
        ptr=ptr->link;
    }
    printf("\n");
}

// Output
// Menu
// 1.Enqueue
// 2.Dequeue
// 3.Display
// 4.Exit

// Enter your Choice:
// 1
// Enter the item:
// 2

// Enter your Choice:
// 1
// Enter the item:
// 3

// Enter your Choice:
// 1
// Enter the item:
// 5

// Enter your Choice:
// 3
// The elements of the Queue are: 2        3       5
// Enter your Choice:
// 2
// The element deleted is: 2

// Enter your Choice:
// 3
// The elements of the Queue are: 3        5
// Enter your Choice:
// 4

// Exit:

