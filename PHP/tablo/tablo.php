<br><br>
<form action=" " method="POST" >
<center>
<b>Satır sayısı<br><br>
	<input type="text" name="satir" size="30" required  autofocus ><br><br>
	<b>Sütun sayısı :<br><br>
	<input type="text" name="sutun" size="30" required><br><br>
	<b>Tablo rengi :<br><br>
	<br>
    <input type="color"  name="renk" /><br><br>
	  <input type="submit" name="gonder" value="Gonder">
     <input type="reset" name="sil" value="Temizle">
</form>

<?php
	echo "<h3>";
	if (isset($_POST['gonder']))
	{
		$satir=$_POST['satir'];
		$sutun=$_POST['sutun'];
		$renk=$_POST['renk'];
		
		echo "<table  border='5'bordercolor='blue' bgcolor='$renk'>";
		for($i=0;$i<$satir;$i++)
		{
			echo "<tr> </tr>";
			for($j=0;$j<$sutun;$j++)
			{
				echo "<td>$j.Sütun  $i.satır </td>";
			}
			echo "</h3>";
		}
	}
?>