<!-- 

AIM
 To write a PHP program to display the mark list of a
student by accepting the register no of the student.
 -->

 <html>
<head>Marklist</head>
<body>
<form  method="post" action=" ">
<label> Regno:</label> <input type= "text" name = "txtreg"><br>
<input type= "submit"  value = "show"><br>
</form>
</body>
</html>

<?php
if($_POST)
{
$rg=$_POST['txtreg'];
$con=pg_connect("host=localhost dbname=mes user=postgres password=4351") ;

if($con)
{
echo "Successfully connected....";
$query="SELECT * FROM student  WHERE rollno='$rg'";
$result=pg_query($con,$query);
$nos=pg_num_rows($result);
while($row=pg_fetch_row($result))
{
echo "<br/>\n";
echo "rollno: $row[0]  name: $row[1]  mark: $row[2]  grade:$row[3]";
}
}
}