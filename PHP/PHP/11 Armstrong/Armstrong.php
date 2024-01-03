<!-- 
AIM
    To write a program to check whether a given number is armstrong or not
 -->

 <html>
    <head>
        <title>Armstrong Number</title>
    </head>
    <body>
        <h2>Armstrong Number</h2>
        <form action="" method="post">
            <input type="number" name="num" >
            <input type="submit" value="Submit" name="submit">
        </form>
    </body>
</html>
<?php
if(isset($_POST['submit'])){
    $num = $_POST['num'];
    $digits = strlen((string)$num);

    for($n = $num, $sum =0; $n>0; $n/=10){
        $rem = (int)$n%10;
        $sum += pow($rem, $digits);
    }

    if($num==$sum)
        echo $num." is an Armstrong Number.";
    else 
        echo $num." is not an Armstrong Number.";

}
?>