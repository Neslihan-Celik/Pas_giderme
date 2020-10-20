	</b></br></br></br>
	<center>
	<b><h2>Bilgi kayıt sayfasına hoşgeldiniz !<br>Lütfen bilgilerinizi giriniz .</b>
	</h2></b></br></br></br>
	<form name "formum" action="alici_sayfa.php" method="post">
	
	<b>Kullanıcı Adınız:</b></br>
	<input type="text" name="isim" size="30" required  autofocus ></br></br>
	<b>Kullanıcı Soyadınız :</b></br>
	<input type="text" name="soyisim" size="30" required></br></br>
	<b>TC Numaranız :</b></br>
	<input type="text" name="TC" size="11" required></br></br>
	<b>Çocuk sayısı :</b></br>
	<input type="text" name="cocuk" size="19" required></br></br>
	<b>Şifreniz:</b><br />
    <input type="password" name="sifre" size="8" required><br /><br/><br /><br />
	<input type="radio" name="cins" value="erkek"><b>Erkek
	<input type="radio" name="cins" value="kadin">Kadın</b></br></br>
	<b>Doğum Tarihi</b><br>
	<input type="date" name="tarih" ></br></br>
	<br /><br/><b>
	<select name="sehir" size="3" required>
	<option value="sanliurfa" selected >ŞANLIURFA</option>
	<option value="ankara">ANKARA</option>
	<option value="istanbul">İSTANBUL</option>
	<option value="izmir">İZMİR</option>
	<option value="antalya">ANTALYA</option>
	<option value="mardin">MARDİN</option>
	<option value="samsun">SAMSUN</option>
	<option value="edirne">EDİRNE</option>
	</select></b>
	<br /><br/><br /><br />
    <input type="submit" name="gonder" value="Gönder">
     <input type="reset" name="sil" value="Temizle"><br /><br />
	
	</form>

