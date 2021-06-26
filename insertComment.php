<?php 
require 'dbConnect.php';

$gopY = $_POST['gopY'];
$sDT = $_POST['sDT'];
$email = $_POST['email'];
$sex = $_POST['sex'];

$sql = "INSERT INTO tblcomment VALUES (null,'$gopY','$sDT','$email','$sex')";

if($con->query($sql) == TRUE) {
	echo "Success";

}else{
	echo"Error";
}

$con->close();
 ?>