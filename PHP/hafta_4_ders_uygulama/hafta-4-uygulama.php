<html>

<br><br><br><br>
<form action=" " method ="POST"><center><h3>
1.sayı :<input type="text" name="s1"><br>
2.sayı :<input type="text" name="s2"><br><br><br>
islem seçin :
<select name ="islem" size="1" >
<option value="1" >Topla</option>
<option value="2" >Carp</option>
<option value="3" >Bol</option>
<option value="4" >Cikar</option>
</select><br><br>
<input type="submit" name="Gonder">
<input type="reset" name="Temizle">
</form>
</html>
</center>
<?php
	if (isset($_POST['Gonder']))
	{
		$s1=$_POST['s1'];
		$s2=$_POST['s2'];
		$islem=$_POST['islem'];
		echo "<center><h3>";
		switch ($islem)
		{
			case '1':
			 echo "Sonuç= ".($s1+$s2);
			break;
			case '2':
			 echo "Sonuç= ".($s1*$s2);
			break;
			case '3':
			 echo "Sonuç= ".($s1/$s2);
			break;
			case '4':
			 echo "Sonuç= ".($s1-$s2);
			break;
		}
	echo "</center></h3>";
	}
?>

