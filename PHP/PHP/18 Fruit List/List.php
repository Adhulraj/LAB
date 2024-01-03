<!-- 
AIM
    To write a php program to display the selected fruits in a webpage.
 -->

<html>
    <head>
        <title>Select Fruits</title>
    </head>
    <body>
        <h2>Select the fruit</h2>
        <form action="" method="post">
            <select name="fruit" >
                <option>Apple</option>
                <option>Banana</option>
                <option>Orange</option>
                <option>Mango</option>
                <option>Pineapple</option>
            </select>
            <input type="submit" value="Submit" name="submit">
        </form>
    </body>
</html>
<?php
if(isset($_POST['submit'])){
    echo "The selected item is ".$_POST['fruit'];
}
?>