#   GREETINGS BASED ON TIME 

#AIM
#   Shell script which when executed displays the message Good Morning/Good aftemoon /Good Evening depending on the time it gets executed

#ALGORITHM

# Step 01: START
# Step 02: Check the time hour, min and am/pm
# Step 03: if ampm=am print Good Morning
# Step 04: else if hour=12 or hour <4 print Good Afternoon
# Step 05: else if hour>=4 and hour<8 print Good Evening
# Step 06: STOP 

hour=$( date +%I)
min=$( date +%M)
ampm=$( date +%P)
echo "$hour : $min $ampm"
if [ $ampm == 'am' ]
then
    echo "Good Morning"
else
    if [[ $hour -eq 12 || $hour -lt 4 ]]
    then    
        echo "Good Afternoon"
    elif [[ $hour -ge 4 && $hour -le 8 ]]
    then
        echo "Good Evening"
    fi
fi

#OUTPUT

# 12 : 11 pm
# Good Afternoon