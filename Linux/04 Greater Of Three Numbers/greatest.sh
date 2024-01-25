#       GREATER OF 3 NUMBERS
#AIM
#   A shell script to find the greatest of three numbers

#ALGORITHM
#
# Step 01: START
# Step 02: Prompt the user to enter three numbers and store them in variables.
# Step 03: Compare n1 with n2 and n3
#                If n1 is greater than both n2 and n3, declare n1 as the greatest.
# Step 04: Otherwise, compare n2 with n3.
#               If n2 is greater than n3, declare n2 as the greatest.
# Step 05: If none of the above conditions are met, n3 must be the greatest.
# Step 06 :STOP

echo "Enter three numbers "
read n1
read n2
read n3
if [ $n1 -gt $n2 ] && [ $n1 -gt $n3 ]
then 
echo "$n1 is greater"
elif [ $n2 -gt $n3 ]
then
echo "$n2 is greater"
else
echo "$n3 is graeter"
fi 


# OUTPUT

# Enter three numbers
# 2
# 8
# 4
# 8 is greater