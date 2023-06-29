<html>
    <body>
        <form action="" method="POST" name="f">
            NAME:<input type="text" name="n">
            ADDRESS: <input type="text" name="a">
            DOB: <input type="text" name="d">
            GENDER: <input type="radio" name="g" value="male">male 
            <input type="radio" name="g" value="female">Female

            <input type="submit" value="Submit" name="s">
        </form>
        <?php
            if (isset($_POSTPOST['s'])) {
                $n=$_POST['n'];
                $a=$_POST['a'];
                $d=$_POST['d'];
                $g=$_POST['g'];

            
            echo "<table><tr><td>Name:</td><td>$n</td></tr></table>";
        
        }
        ?>
    </body>
</html>
