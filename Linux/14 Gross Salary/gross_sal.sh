#       GROSS SALARY
#AIM
#   To write a program to calculate gross salary

#ALGORITHM

# Step 01: START
# Step 02: Ask for your base salary basal.
# Step 03: Calculate grosal = basal + (basal*0.2)+(basal*.4)
# Step 04: Display grosal
# Step 05: STOP

echo "Enter the base salary : "
read basal
grosal=$( echo "scale=2;$basal+(( 40/100)*$basal)+((20/100)*$basal)"|bc -l)
echo "The gross salary : $grosal"

#OUTPUT
#
# Enter the base salary :
# 10245
# The gross salary : 16392.00