#       FACTORIAL 
#AIM
#   Shell script find the factorial of a given number

#ALGORITHM

# Step 01: START
# Step 02: ask the user for a number.
# Step 03: set a result to 1
# Step 04: Counts down from the given number to 1:
#    - Multiplies the result by the current number
# Step 05: Show the Factorial
# Step 06: STOP



read -p "Enter the number: " num
fact=1
for (( i=$num;i>=1;i--)); do    
    fact=$(( $fact*i))
done
echo "The factorial is $fact"

#OUTPUT
#Enter the number: 5
# The factorial is 120
