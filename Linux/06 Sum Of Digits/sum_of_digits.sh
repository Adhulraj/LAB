#               SUM OF DIGITS
# AIM
#    Shell script to find sum of all digits from a given number


#ALGORITHM

# Step 01: START
# Step 02: Prompt the user to enter a number and store it in `num`.
# Step 03: Set `sum` to 0.
# Step 04: Iterate and Extract:
#    - Use a `while` loop to process digits as long as `num` is greater than 0:
#      - Extract and add the last digit to `sum` in a single expression:
#        - `sum=$((sum + num % 10))`
#      - Remove the last digit from `num` using division:
#        - `num=$((num / 10))`
# Step 05: Display the final `sum` as the sum of digits.
# Step 06: STOP



read -p "Enter the number : " num
sum=0
while [ $num -gt 0 ]
do
    dig=$(( $num%10))
    num=$(( $num/10))
    sum=$(( $sum+$dig))
done
echo "The sum of digits is $sum"

#OUTPUT
# Enter the number : 1254
# The sum of digits is 12