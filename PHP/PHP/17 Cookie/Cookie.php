<!-- 
AIM
To write a program to store current date-time in a cookie and display the Last visited date-time on the web page.
 -->

<html>
    <head>
        <title>Cookie</title>
    </head>
    <?php 
        setcookie("time", date("h:i:s"), time()+7200);
        setcookie("date", date("d/m/y"), time()+7200);

        echo "Last visited on ".$_COOKIE['date']." At ".$_COOKIE['time'];
    ?>
</html>