#       PERIMETER OF CIRCLE
#AIM
#
#

#ALGORITHM
###
# Step 01: Start 
# Step 02: Prompt the user to enter the radius.
# Step 03: Read the entered radius value.
# Step 04: Use `bc` to determine both area (3.14 * radius * radius) and perimeter (2 * 3.14 * radius).
# Step 05: Present both the calculated area and perimeter to the user.
# Step 05: STOP

echo "Enter the Radius"
read rad
area=$( echo "3.14*$rad*$rad" |bc)
perimeter=$( echo "2*3.14*$rad" |bc)
echo "The area is $area"
echo "The perimeter is $perimeter"

# #OUTPUT
# Enter the Radius
# 10
# The area is 314.00
# The perimeter is 62.80
