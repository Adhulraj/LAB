/*
 * Delete node from Singly Linked List
 */

#include <stdio.h>
#include <stdlib.h>
    struct node
{
    int val;
    struct node *next;
};
void print_list(struct node *head)
{
    printf("H->");
    while (head)
    {
        printf("%d->", head->val);
        head = head->next;
    }
    printf("|||\n");
}
void insert_front(struct node **head, int value)
{
    struct node *new_node = NULL;
    new_node = (struct node *)malloc(sizeof(struct node));
    if (new_node == NULL)
    {
        printf("Failed to insert element. Out of memory");
    }
    new_node->val = value;
    new_node->next = *head;
    *head = new_node;
}
void delete_node(struct node **head, int val)
{
    struct node *tmp = NULL;
    struct node *tmp1 = NULL;
    if (head == NULL || *head == NULL)
        return;
    if ((*head)->val == val)
    {
        /*Delete the head node*/
        tmp = *head;
        *head = (*head)->next;
        free(tmp);
        return;
    }
    tmp = *head;
    while (tmp->next && tmp->next->val != val)
        tmp = tmp->next;
    if (tmp->next)
    {
        tmp1 = tmp->next;
        tmp->next = tmp1->next;
        free(tmp1);
    }
    else
    {
        printf("%d not found in the list.\n", val);
    }
}
void main()
{
    int count = 0, i, val;
    struct node *head = NULL;
    printf("Enter number of elements: ");
    scanf("%d", &count);

    for (i = 0; i < count; i++)
    {
        printf("Enter %dth element: ", i);
        scanf("%d", &val);
        insert_front(&head, val);
    }
    printf("Initial List: ");
    print_list(head);
    printf("Enter a value to delete from the list: ");
    scanf("%d", &val);
    delete_node(&head, val);
    printf("List after deletion: ");
    print_list(head);
}
