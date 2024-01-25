#AIM
#   Shell script to find n Fibonacci numbers

#ALGORITHM

# Step 01: START
# Step 02: Ask how many terms the user wants in the Fibonacci series.
# Step 03: Begin with 0 and 1 as the first two numbers.
# Step 04: Repeat the following steps for each remaining term:
#     - Add the last two numbers together to get the new term.
#     - Display the new number as part of the series.
#     - Move the last two numbers forward, preparing for the next calculation.
# Step 05: STOP

read -p "Enter the number: " num
echo -n "Fibonacci Series are : "
f=0
s=1
echo -n "$f $s"
for (( i=2;i<$num;i++))
do
    t=$(( $f+$s))
    echo -n " $t "
    f=$s
    s=$t
done
echo ""

#OUTPUT

# Enter the number: 10
# Fibonacci Series are : 0 1 1  2  3  5  8  13  21  34