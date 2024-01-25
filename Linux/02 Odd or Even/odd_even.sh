#       ODD OR EVEN
#AIM
# To write a shell script to find if given number is odd or even

#ALGORITHM


# Step 01: START 
# Step 02: Prompt the user to enter a number.
# Step 03:  Divide the number by 2 and check the remainder.
#    - If the remainder is 0, it's even.
#    - If the remainder is not 0, it's odd.
# Step 04: Display the result.
#Step 05: STOP


read -p "Enter the number: " num
if [[ $num%2 -eq 0 ]]
then 
    echo "Even Number"
else
    echo "Odd Number"
fi 

#OUTPUT
# Enter the number: 24
# Even NUmber

# Enter the number: 11
# Odd Number