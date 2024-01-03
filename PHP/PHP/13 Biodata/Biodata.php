<!-- 
AIM
 to create program to display the bio data of a person.
 -->

 <html>
    <head>
        <title>Biodata</title>
    </head>
    <body>
        <form action="" method="post">
            NAME : <input type="text" name="n" ><br><br>
            ADDRESS : <input type="text" name="a"><br><br>
            DOB : <input type="date" name="d"><br><br>
            GENDER : <input type="radio" name="g" value="male">Male 
                     <input type="radio" name="g" value="female">Female <br><br>
            <input type="submit" value="Submit" name="s"><br><br>
        </form>
    </body>
 </html>
 <?php
if(isset($_POST['s'])){
    $n = $_POST['n'];
    $a = $_POST['a'];
    $d = $_POST['d'];
    $g = $_POST['g'];

    
echo " <table border='1'>
    <tr>
        <td>Name : </td>
        <td>$n</td>
    </tr>
        <tr>
        <td>Address : </td>
        <td>$a</td>
    </tr>
        <tr>
        <td>DOB : </td>
        <td>$d</td>
    </tr>
        <tr>
        <td>Gender : </td>
        <td>$g</td>
    </tr>
 </table>";
}


 ?>

