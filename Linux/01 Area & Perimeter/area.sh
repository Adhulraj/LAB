
#AIM
#
#

#ALGORITHM
###
# 1. Prompt the user to enter the radius.
# 2. Read the entered radius value.
# 3. Use `bc` to determine both area (3.14 * radius * radius) and perimeter (2 * 3.14 * radius).
# 4. Present both the calculated area and perimeter to the user.


echo "Enter the Radius"
read rad
area=$( echo "3.14*$rad*$rad" |bc)
perimeter=$( echo "2*3.14*$rad" |bc)
echo "The area is $area"
echo "The perimeter is $perimeter"
