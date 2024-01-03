<!-- 
AIM
    To write a program to reverse a string
 -->

 <html>
    <head>
        <title>String Reverse</title>
    </head>
    <body>
        <h2>Reverse of a String</h2>
        <form action="" method="post">
            <input type="text" name="str" >
            <input type="submit" value="Submit" name="submit">
        </form>
    </body>
 </html>
 <?php
    if(isset($_POST['submit'])){
        $str = $_POST['str'];
        echo " The reverse of string is ".strrev($str);
    }
 ?>