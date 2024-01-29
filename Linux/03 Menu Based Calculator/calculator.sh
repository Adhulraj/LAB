#       MENU BASED CALCULATOR

#AIM
#   To make a menu driven calculator using case

#ALGORITHM

# Step 01: START
# Step 02: Begin a loop that continues until the user decides to stop.
# Step 03: Prompt the user for two numbers and their desired operation (addition, subtraction, multiplication, or division).
# Step 04: Perform the chosen calculation based on the provided numbers.

# Step 05: Display the calculated result to the user.
# Step 06: Ask if the user wants to perform another calculation.
#    - If yes, repeat the loop.
#    - If no, end the loop.
# Step 07: STOP


#!/bin/bash

while
    read -p "Enter number 1: " num1
    read -p "Enter number 2: " num2

    echo -e "\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division"
    read -p "Enter your Choice>> " choice

    case $choice in
        1)
            echo -e "\nThe result is $(( $num1 + $num2))"
        ;;
        2)
            echo -e "\nThe result is $(( $num1 - $num2))"
        ;;
        3)
            echo -e "\nThe result is $(( $num1 * $num2))"
        ;;
        4)
            result=$( echo "scale=2; $num1 / $num2" |bc)
            echo -e "\nThe result is $result"
        ;;
        *)
            echo -e "\nInvalid Option"
    esac
    read -p "Do you wish to continue? (Y/N): " cont
    [[ $cont == 'y' || $cont == 'Y' ]]
do :
done

#OUTPUT
# Enter number 1: 10
# Enter number 2: 11

# 1.Addition
# 2.Subtraction
# 3.Multiplication
# 4.Division
# Enter your Choice>> 1

# The result is 21
# Do you wish to continue? (Y/N): y
# Enter number 1: 12
# Enter number 2: 13

# 1.Addition
# 2.Subtraction
# 3.Multiplication
# 4.Division
# Enter your Choice>> 2

# The result is -1
# Do you wish to continue? (Y/N): y
# Enter number 1: 2
# Enter number 2: 3

# 1.Addition
# 2.Subtraction
# 3.Multiplication
# 4.Division
# Enter your Choice>> 3

# The result is 6
# Do you wish to continue? (Y/N): y
# Enter number 1: 32
# Enter number 2: 2

# 1.Addition
# 2.Subtraction
# 3.Multiplication
# 4.Division
# Enter your Choice>> 4

# The result is 16
# Do you wish to continue? (Y/N): y
# Enter number 1: 100
# Enter number 2: 1

# 1.Addition
# 2.Subtraction
# 3.Multiplication
# 4.Division
# Enter your Choice>> 5

# Invalid Option
# Do you wish to continue? (Y/N): n
    