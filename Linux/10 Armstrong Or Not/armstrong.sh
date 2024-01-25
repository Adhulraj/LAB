#       ARMSTRONG OR NOT
#AIM
#   Shell script to check whether a given number is Armstrong or not

#ALGORITHM
#
# Step 01: START
# Step 02: Ask the user for a number to check.

# Step 03:  Repeat these steps for each digit in the number:
#     - Extract the last digit.
#     - Cube that digit 
#     - Add the cubed digit to a running total.

# Step 04: If the final total of cubed digits exactly equals the original number, it's an Armstrong number!
# - If not, it's not an Armstrong number.

# Step 05: Display the result
# Step 06: STOP


echo "Enter the number: "
read c
x=$c
sum=0
r=0
n=0
while [[ $x -gt 0 ]]
do 
    r=$( expr $x % 10)
    n=$( expr $r \* $r \* $r)
    sum=$( expr $sum+$n)
    x=$( expr $x / 10)
done
if [[ $sum -eq $c ]]
then 
    echo "It is an Armstrong Number"
else
    echo "It is not an Armstrong Number"
fi

#OUTPUT

# Enter the number:
# 153
# It is an Armstrong Number

# Enter the number:
# 10
# It is not an Armstrong Number