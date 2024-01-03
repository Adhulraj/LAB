
<!-- 
AIM
    To display the Fibonacci series up to a given number.

 -->
<html>
    <head>
        <title>Fibonacci Series</title>
    </head>
    <body>
        <h2>Fibonacci Series</h2>
        <form action="" method="post">
            <input type="number" name="num" >
            <input type="submit" value="Submit" name="submit_btn">
        </form>
    </body>
</html>
<?php
    if(isset($_POST['num'])){
        $n = $_POST['num'];
        echo "Fibonacci Numbers ";
        $f = 0; $s=1;
        echo $f." ".$s;
        for ($i=2; $i < $n; $i++) { 
            $t = $f +$s;
            echo " ".$t;
            $f = $s;
            $s = $t;
        }
    }
?>

