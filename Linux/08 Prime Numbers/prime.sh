#AIM
#   Shell script to find prime numbers up to a given number 

#ALGORITHM
#
# Step 01: START
# Step 02: Prompt the user for the limit and store it in `limit`.
# Step 03: Use a `for` loop iterating from num=2 to the limit:
#            - set isPrime=1
#            - use a for loop iterating from i=2 to num/2:
#               - if num%i =0 increment isPrime and break
#            - if isPrime =1 print num
# Step 04: STOP



read -p "Enter the limit : " limit
echo "The prime numbers upto the limit are : "
for (( num=2; num<=$limit;num++ )); do
    isPrime=1
    for (( i=2; i<=$(( $num/2)); i++)); do
        if [[ $num%$i -eq 0 ]]; then
            ((isPrime++))
            break
        fi
    done
    if [ $isPrime -eq 1 ] ; then
        echo "$num"
    fi
done

#OUTPUT
# Enter the limit : 10
# The prime numbers upto the limit are :
# 2
# 3
# 5
# 7
