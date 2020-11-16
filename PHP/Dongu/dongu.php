<html>
<br><center>
<form name "formum" action=" " method="post">
	<b>1. parametre :</b><br>
	<input type="text" name="1par" size="30"    ><br><br>
		<b>ikinci parametre :</b><br>
	<input type="text" name="2par" size="30" ><br><br>
	<select name="tercih"  >
	<option value="1" >dikdortgen yap</option>
	<option value="2">sayılar arasında 75 bulma hesapla</option>
	</select><br>
	<input type="submit" name="gonder" value="GÖNDER">
	<br><br><br>
	
</html>
<?php
if (isset($_POST['gonder']))
	{
		$par1=$_POST['1par'];
		$par2=$_POST['2par'];
		$tercih=$_POST['tercih'];
		$randSonuc=0;
		$dikdortgen=0;
		$say=0;
		if($tercih=="1")
		{
			for($i=0;$i<$par1;$i++)
			{
				for($j=0;$j<$par2;$j++)	
				{
					echo "x";
				}
			echo "<br>";
			}
		}
		if($tercih=="2")
		{
			while($randSonuc<75)
			{
				$randSonuc=rand($par1,$par2);
				echo "tahminler".$randSonuc."<br>";
				$say++;
				
			}
			echo"<br> tahmin sayısı ". $say;
		}
	}
?>