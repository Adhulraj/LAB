#           MEAN AND STANDARD DEVIATION
#AIM
#   A shell script to compute mean and standard deviation of three numbers

#ALGORITHM
#
# Step 01: START
# Step 02: Prompt the user to enter three numbers and store them.
# Step 03: Calculate mean
# Step 04: Calculate x, y, z using (x-mean)**2
# Step 05: Find Standard deviation by sqrt((x+y+z)/3)
# Step 04: Display the output
# Step 05: STOP

echo "Enter the numbers"
read n1
read n2
read n3
mean=$(( ($n1+$n2+$n3)/3))
x=$(( ($n1-$mean)**2))
y=$(( ($n2-$mean)**2))
z=$(( ($n3-$mean)**2))
sd=$( echo "scale=2;sqrt(( $x+$y+$z)/3)" |bc )
echo "Mean is $mean"
echo "Standard Deviation is $sd"


#OUTPUT
# Enter the numbers
# 12
# 13
# 14
# Mean is 13
# Standard Deviation is .81