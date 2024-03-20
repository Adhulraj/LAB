<!-- 
AIM
     To write a program to create an array and store 10 names in the array and 
        a. Display the contents using for each statement.
        b. Display the array in a sorted order.
        c. Display the array without the duplicate elements
        d. Remove the last element and display
        e. Display the array in reverse order
        f. Search an element in the given array
 -->

 <html>
    <head>
        <title>Array Functions</title>
    </head>
    <body>
        <h2>Array Functions in PHP</h2>
        <form action="" method="post">
            <input type="text" name="search" >
            <input type="submit" value="submit" name="submit">
        </form>
    </body>
 </html>

 <?php
if($_POST){
function display($array){
    foreach ($array as $item) {
        echo $item." ";
    }
}
$arr = array('Grapes', 'Apple', 'Orange', 'Cherry', 'Banana', 'Strawberry','Apple', 'Banana');
echo "<b> Array items: </b> <br>";
display($arr);
echo "<br><br><b> Array without duplicates </b></br>";
$unique_array = array_unique($arr);
display($unique_array);
echo "<br><br><b>Array after sorting :</b></br>";
sort($arr);
display($arr);
echo "<br><br><b>Array after reverse sorting </br></br>";
rsort($arr);
display($arr);
echo "<br><br><b>Array after deleting last element :</b></br>";
unset($arr[count($arr)-1]);
display($arr);
$search = $_POST['search'];
if(in_array($search, $arr))
echo "<br><br>$search is in the array";
else
echo "<br><br>$search is not in the array";
}
 ?>
