<!-- 
AIM
     To write a program to check whether a given number is perfect, abundant or deficient.
 -->

 <html>
    <head>
        <title>Perfect Abundant or Deficient</title>
    </head>
    <body>
        <h2>Perfect Abundant or Deficient</h2>
        <form action="" method="post">
            <input type="number" name="num">
            <input type="submit" value="Submit" name="submit_btn">
        </form>
    </body>
 </html>
 <?php
if(isset($_POST['submit_btn'])){
    $n = $_POST['num'];
    $sum = 0;
    for ($i=1; $i < $n; $i++) { 
        if ($n%$i==0) {
            $sum +=$i;
        }
    }
    if ($sum>$n) 
        echo $n." is Abundant Number.";
    else if($sum<$n)
        echo $n." is a Deficient Number.";
    else 
        echo $n." is a Perfect Number.";

}
 ?>