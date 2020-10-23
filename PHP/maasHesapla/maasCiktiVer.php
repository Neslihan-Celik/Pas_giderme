<?php 

 
echo '<html><head><meta charset="UTF-8">';

$isim=$_POST['isim'];
$soyisim=$_POST['soyisim'];
$cocuk=$_POST['cocuk'];
$maas=$_POST['maas'];		
							
echo "<h3><center><br><br><h3><b><u>Maaş Hesaplama Ekranı </b></h3></u><b><br>";



if ($cocuk==1){
$maas=($maas+($maas*0.05));
echo "Sayın ".$isim." ".$soyisim."<br>Çocuk sayınız : ".$cocuk."<br> Zamlı maaşınız : ".$maas."TL<br>";}
else if ($cocuk==2){
$maas=($maas+($maas*0.10));
echo "<center>Sayın ".$isim." ".$soyisim."<br>Çocuk sayınız :".$cocuk." <br>Zamlı maaşınız : ".$maas."TL<br>";}
else if ($cocuk>=3){
$maas=($maas+($maas*0.15));
echo "<center>Sayın ".$isim." ".$soyisim."<br>Çocuk sayınız :".$cocuk." <br>Zamlı maaşınız : ".$maas."TL<br>";}
else if  ($cocuk==0)
echo "<center>Sayın ".$isim." ".$soyisim."<br>Çocuk sayınız : 0 <br>Zam alamıyorsunuz <br>Maaşınız : ".$maas."TL<br>";
echo "</head></html>";
?>