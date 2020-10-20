<?php 

$isim=$_POST['isim'];
$soyisim=$_POST['soyisim'];
$TC=$_POST['TC'];
$cocuk=$_POST['cocuk'];
$sifre=$_POST['sifre'];
$cins=$_POST['cins'];
$tarih=$_POST['tarih'];
$sehir=$_POST['sehir'];


											
echo "<br><br><h3><b><u>Kayıt bilgileri </b></h3></u>\n<b><br>";
echo "İsim : ".$isim."<br>";
echo "Soyisim : ".$soyisim."<br>";
echo "TC Kimlik No : ".$TC."<br>";
echo " Çocuk sayısı : ".$cocuk."<br>";
echo "Cinsiyet : ".$cins. "<br>";
echo "Doğum Tarihi : ".$tarih."<br>";
echo "Yaşadığı şehir : ".$sehir."<br></b>";


?>
