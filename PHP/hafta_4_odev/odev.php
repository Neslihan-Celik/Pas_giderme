<html > <head><meta charset='UTF-8'></head>
	<body  bgcolor=" #fcfff2">
		<center>

			<br><h2>Lütfen tüm alanları doldurun !</h2>
			<form action=" " method="POST" >
				<table  cellpadding="5" cellspacing="3" >
					<tr>
						<td colspan="3" align=center bgcolor="#fcff30"><h2>DGS Puanmatik</td>
					</tr>
					<tr align=center>	
						<td></td>
						<td><b>Doğru</b></td>
						<td><b>Yanlış</b></td>
					</tr>
					<tr >	
						<td><b>Sayısal test</b></td>
						<td align=center><input type="text" name="sayd" size="2"   autofocus ></br></br></td>
						<td align=center><input type="text" name="sayy" size="2"  ></br></br></td>
					</tr>
					<tr >	
						<td><b>Sözel test</b></td>
						<td align=center><input type="text" name="sozd" size="2"    ></br></br></td>
						<td align=center><input type="text" name="sozy" size="2"  ></br></br></td>
					</tr>
					<tr >	
						<td ><b>Önlisans Başarı Puanı &nbsp;(ZORUNLU)</b></td>
						<td colspan="2">&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp;<input type="text" name="obp" size="2" required   ></td>
					</tr>
					<tr >	 
						<td><b>Alan</b></td>
						<td colspan="2" align=center>
						<input type="radio" name="alan" value="say"><b>Sayısal&nbsp; &nbsp; &nbsp; &nbsp;
						<input type="radio" name="alan" value="soz"><b>Sözel&nbsp; &nbsp; &nbsp; &nbsp;
						<input type="radio" name="alan" value="esit"><b>Eşit Ağırlık&nbsp; &nbsp;</td>
					</tr>
					<tr >	
						<td>
							<b>2020 öncesi bir programa yerleştiniz mi veya tercih yaptınız mı ? </b></td>
						<td colspan="2" align=center>
							<input type="radio" name="tercih" value="1"><b>Evet&nbsp; &nbsp; &nbsp; &nbsp;
							<input type="radio" name="tercih" value="2"><b>Hayır
						</td>
					</tr>
					<tr ><h3>	
						<td colspan="3"align=center bgcolor="#fcff30">
						<input type="submit" name="gonder" value="GÖNDER">
						&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
						<input type="reset" name="sil" value="TEMİZLE"></td><h3>
					</tr>
				</table>
			</form></h3>
		</center>
	</body>
</html>



<?php
	echo "<center><h3>";
	if (isset($_POST['gonder']))
	{
		$sayd=$_POST['sayd'];
		$sayy=$_POST['sayy'];
		$sozd=$_POST['sozd'];
		$sozy=$_POST['sozy'];
		$obp=$_POST['obp'];
		$alan=$_POST['alan'];
		$tercih=$_POST['tercih'];
		if(empty($_POST['$sozy']))
			{$sozy=0;};
		if(empty($_POST['$sayy']))
			{$sayy=0;};
		$sozNet=($sozd-($sozy*0.25));
		$sayNet=($sayd-($sayy*0.25));
		
		
		if($tercih==1)
		{
			$sozPuan=(($sayNet*0.6)+($sozNet*3)+($obp*0.3)+120);
			$sayPuan=(($sayNet*3)+($sozNet*0.6)+($obp*0.3)+250);
			$esitPuan=(($sayNet*1.8)+($sozNet*1.8)+($obp*0.3)+222);
		}
		else
		{
			$sozPuan=(($sayNet*0.6)+($sozNet*3)+($obp*0.6)+120);
			$sayPuan=(($sayNet*3)+($sozNet*0.6)+($obp*0.6)+250);
			$esitPuan=(($sayNet*1.8)+($sozNet*1.8)+($obp*0.6)+222);
		};
				 

	
		
		/*
		* Eğer sözelciyse hesap yap
		* sayısalcıysa ayrı hesap
		* eşit ise farklı 
		* yanlışlar doğruları götürür
		* 4 yanlış 1 doğru onu unutma
		* tercih yapmış ise katsayı değişecek 
		* ön lisans başarı puanını unutma ona puan verilecek ek olarak
		* ek olark sonuçları da tabloda göster daha şık olur 
		* hatta netleri de göster 
		* sayfaya da renk kat çok sıkıcı duruyor böyle 
		*/
		switch ($alan)
		{
			case 'soz':
			 echo "<table  cellpadding='10' cellspacing='5' >
				<tr>
					<td colspan='3' align=center bgcolor='#fcff30'><h2>Sözel Puan </td>
				</tr>
				<tr >	
					 <td><h3>Sözel Netiniz  </h3></td>
					 <td> <h3>".$sozNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>Sayısal Netiniz  </h3></td>
					 <td> <h3>".$sayNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>ÖBP  </h3></td>
					 <td> <h3>".$obp."</h3></td>
				</tr>
				<tr  bgcolor='#fcff30'>	
					 <td><h3>Puanınız  </h3></td>
					 <td> <h3>".$sozPuan."</h3></td>
				</tr>
				<tr  bgcolor='#fcff30'>	
					<td colspan='3' > <h3>Başarı emek ister ! <br>Ama çok çalışma sonucu elde edilebiecek bir şeydir</h3></td>
				</tr>";	 
			break;
			
			case 'say':
			 echo "<table  cellpadding='10' cellspacing='5' >
				<tr>
					<td colspan='3' align=center bgcolor='#fcff30'><h2>Sayısal Puan </td>
				</tr>
				<tr >	
					 <td><h3>Sayısal Netiniz  </h3></td>
					 <td> <h3>".$sayNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>Sözel Netiniz  </h3></td>
					 <td> <h3>".$sozNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>ÖBP  </h3></td>
					 <td> <h3>".$obp."</h3></td>
				</tr>
				<tr bgcolor='#fcff30'>	
					 <td><h3>Puanınız  </h3></td>
					 <td> <h3>".$sayPuan."</h3></td>
				</tr>
				<tr align=center bgcolor='#fcff30'>	
					<td colspan='3' > <h3>Başarı emek ister ! <br>Ama çok çalışma sonucu elde edilebiecek bir şeydir</h3></td>
				</tr>";
			break;
			
			case 'esit':
			 echo "<table  cellpadding='10' cellspacing='5' >
				<tr>
					<td colspan='3' align=center bgcolor='#fcff30'><h2>Eşit Ağırlık Puanı </td>
				</tr>
				<tr >	
					 <td><h3>Sözel Netiniz  </h3></td>
					 <td> <h3>".$sozNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>Sayısal Netiniz  </h3></td>
					 <td> <h3>".$sayNet."</h3></td>
				</tr>
				<tr >	
					 <td><h3>ÖBP  </h3></td>
					 <td> <h3>".$obp."</h3></td>
				</tr>
				<tr bgcolor='#fcff30'>	
					 <td><h3>Puanınız  </h3></td>
					 <td> <h3>".$esitPuan."</h3></td>
				</tr>
				<tr  align=center bgcolor='#fcff30'>	
					<td colspan='3'> <h3>Başarı emek ister ! <br>Ama çok çalışma sonucu elde edilebiecek bir şeydir </h3></td>
				</tr>";
			break;
			
		}
		
		
		echo "</center></h3><br><br>";
	}
?>