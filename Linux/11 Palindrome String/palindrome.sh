#       PALINDROME STRING
#AIM
# Shell script to reverse a string and check whether a given string is palindrome or not

#ALGORITHM

# Step 01: START
# Step 02: Request a word or phrase from the user.
# Step 03: Create a new string by reversing the order of letters in the original string.
# Step 04:  Check if the reversed string is identical to the original string.
# Step 05: Declare whether the string is a palindrome (reads the same backward and forward) or not.
# Step 06: STOP

read -p "Enter the string : " str
len=$( echo -n "$str" |wc -c)
for (( i=len-1;i>=0;i--)); do   
    rev+="${str:i:1}"
done
echo "The reverse of the string is $rev"
if [[ $str == $rev ]]; then
    echo "The string is Palindrome"
else    
    echo "The string is not palindrome"
fi

#OUTPUT
#
# Enter the string : hello
# The reverse of the string is olleh
# The string is not palindrome

# Enter the string : mam
# The reverse of the string is mam
# The string is Palindrome
