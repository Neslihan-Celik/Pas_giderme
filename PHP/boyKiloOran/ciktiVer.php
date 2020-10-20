<?php 

$isim=$_POST['isim'];
$soyisim=$_POST['soyisim'];
$cins=$_POST['cins'];
$date=$_POST['date'];
$boy=$_POST['boy'];
$kilo=$_POST['kilo'];
$vEndex=$kilo/($boy*$boy)*10000;
$dTarih=2020-$date;
settype($vEndex,"int");									
echo "<h3><center><br><br><h3><b><u>Çıktı Ekranı </b></h3></u>\n<b><br>";
echo "Sayın ".$isim." ".$soyisim."<br>";
echo "Yaşınız : ".$dTarih."<br>";
echo "Cinsiyetiniz : ".$cins."<br>";
echo "Boyunuz : ".$boy." <br>";
echo "Kilonuz : ".$kilo." <br>";
echo "Vücut Kitle endeksiniz : ".$vEndex."<br></h3>";


?>