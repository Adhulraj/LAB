#include <stdio.h>
#include <conio.h>
int stack[100], choice, n, top, x, i;
void push();
void pop();
void display();

void main()
{
    top = -1;
    printf("\n Enter the size of the stack:");
    scanf("%d", &n);
    printf("\n 1.Push \n 2.Pop \n 3.Display\n 4.Exit \n");
    do
    {
        printf("\n Enter the choice from menu: \n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        {
            push();
            break;
        }
        case 2:
        {
            pop();
            break;
        }
        case 3:
        {
            display();
            break;
        }
        case 4:
        {
            printf("\n Exit point...");
            break;
        }
        default:
        {
            printf("\n Please enter a valid choice(1,2,3,4):");
        }
        }

    } while (choice != 4);
    getch();
}
void push()
{
    if (top >= n - 1)
    {
        printf("\n Stack is overflow!");
    }
    else
    {
        printf("Enter the value to be pushed: ");
        scanf("%d", &x);
        top++;
        stack[top] = x;
    }
}
void pop()
{
    if (top <= -1)
    {
        printf("\n Stack is underflow!");
    }
    else
    {
        printf("\n \t Popped element is: %d", stack[top]);
        top--;
    }
}
void display()
{
    if (top >= 0)
    {
        printf("\n Elements in the stack are: \n");
        for (i = top; i >= 0; i--)
            printf("\n %d", stack[i]);
    }
    else
    {
        printf("\n Stack is empty!");
    }
}
