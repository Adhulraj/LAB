/*
        PATTERN MATCHING ALGORITHM
    -----------------------------------------

    AIM :
        Program to impliment pattern matching algorithm

    ALGORITHM :

        
*/

#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>

int match(char [],char []);

int main(){
    char a[100],b[100];
    int position;
    printf("Enter some text: ");
    scanf("%[^\n]s",&a);
    printf("Enter the string to find: ");
    scanf("%s",&b);
    position=match(a,b);
    if(position!=-1)
        printf("Found at location %d \n",position+1);
    else
        printf("Not found \n");
    return 0;
}

int match(char text[],char pattern[]){
    int c,d,e,text_length,pattern_length,position=-1;
    text_length=strlen(text);
    pattern_length=strlen(pattern);
if(pattern_length>text_length)
    return -1;
for (c = 0; c< text_length-pattern_length+1;c++){
    position=e=c;
    for ( d = 0; d < pattern_length; d++)
    {
        if (pattern[d]==text[e])
            e++;
        else
            break;
        
    }
    if (d==pattern_length)
    {
        return position;
    }
}
return -1;
}

/*
    OUTPUT

Enter some text : hello world
Enter the string to find : world
Found at location 7

Enter some text: hello world
Enter the string to find: hai
Not found

*/