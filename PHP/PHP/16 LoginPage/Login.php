<!-- 
AIm
    To create a login page using database.
 -->

<html>
<head> <title>Login</title></head>
<body>
<form action=" " method="post">
username: <input type= "text" name = "usr"><br>
password:  <input type= "password" name = "pass"><br>
<input type= "submit"  value = "login"><br>
</form>
</body></html>


<?php
if($_POST)
{
$usrl=$_POST['usr'];
$paswd=$_POST['pass'];

$con=pg_connect("host=localhost dbname=mes user=postgres password=pass123") ;

if($con)
{
echo "Successfully connected....";
$query="SELECT username,password FROM login  WHERE username='$usrl' and password='$paswd'";
$result=pg_query($con,$query);
$nos=pg_num_rows($result);
if ($nos)
echo "<br> $usrl, YOU are succesfully logged";
else
echo " Login failed" ;
}
}
?>