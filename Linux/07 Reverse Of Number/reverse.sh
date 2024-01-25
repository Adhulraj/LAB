#AIM
#   Shell script to find reverse of a number

#ALGORITHM
# 
# Step 01: START
# Step 02: Prompt the user to enter a number and store it in num.
# Step 03: Set rev to an empty string to build the reversed number.
# Step 04: Use a while loop as long as num is greater than 0:
#           Extract the last digit 
#           Prepend the digit to `rev` 
#           Remove the last digit from ‘num‘`.
# Step 05: Display rev
# Step 06: STOP

read -p "Enter the number: " num
rev=0
while [ $num -gt 0 ]; do
    dig=$(( $num%10))
    num=$(( $num/10))
    rev=$(( ($rev*10)+$dig))
done
echo "The reverse of the number is $rev"

#OUTPUT
# Enter the number: 1254
# The reverse of the number is 4521