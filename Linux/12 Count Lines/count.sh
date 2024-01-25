#       NUMBER OF LINES , WORDS AND CHARACTERS IN A FILE
#AIM
#   Shell Script to count number of lines , words and characters in an input file

#ALGORITHM

# Step 01: START
# Step 02: Prompt the user to enter the filename they want to analyze.
# Step 03: Use a `wc` command to count characters, words, and lines simultaneously:
# Step 04: Display all counts (characters, words, and lines) to the user
# Step 05: STOP


read -p "Enter the filename: " file

chars=$( cat $file | wc -c)
words=$( cat $file | wc -w)
lines=$( cat $file | wc -l)

echo "The number of characters in $file is $chars"
echo "The number of words in $file is $words"
echo "The number of lines in $file is $lines"

#OUPUT
# Enter the filename: hello.txt
# The number of characters in hello.txt is 48
# The number of words in hello.txt is 11
# The number of lines in hello.txt is 3

# ....file....hello.txt
# Hello World
# This is line 2
# This is a third line
