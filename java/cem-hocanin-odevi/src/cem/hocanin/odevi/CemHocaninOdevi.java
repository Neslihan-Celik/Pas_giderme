
public static class Virus {
private String ad; // Virüsün özellikleri
private boolean bulasici;
private boolean aktif;

public Virus(String ad, boolean b, boolean ak) { // Virüs sınıfının yapılandırıcı metodu
this.ad = ad;
bulasici = b;
aktif = ak;
}

public String adinNe() { return this.ad;}
public void bulas(Insan ins) { ins.hastaOl(); } //Gizli Sahiplik (Virüs insana sahip oluyor)
}


public static class Insan {
private String ad; // İnsan sınıfının özellikleri
private int yas;
private boolean cins; // true: erkek, false: kadın
private boolean hasta; //true: hasta, false: sağlıklı

public Insan(String a) { //constructor, yapılandırıcı
ad = a;
yas = 0;
cins = true;
hasta = false;
}

public Insan(String a, int y, boolean c, boolean h) {
ad = a;
yas = y;
cins = c;
hasta = h;
}

public String adinNe() { return ad;}
public void adinBuOlsun(String a) { ad=a;}
public String hastaMisin() { if(hasta) return "Hastayım"; else return "İyiyim"; }
public void hastaOl() { hasta=true; }
public void iyiles() { hasta = false; }
//... getter, setter
}

public static void main(String[] args) {
Insan arda = new Insan("Arda Büyükkaya", 18, true, false);
Insan ece = new Insan("Ece Büyüksöyler", 19, false, false);

Virus corona = new Virus("Corona C-19", true, true);

System.out.println(ece.hastaMisin());

corona.bulas(ece); // Virüs Ece'ye bulaştı...

System.out.println(ece.hastaMisin());
}


-----------------------------------------------------------------------------------------
AYNI KODUN İKİNCİ BİR VERSİYONU
-----------------------------------------------------------------------------------------

public static class Virus {
private String ad;

public Virus(String x) { this.ad = x;}

public String adinNe() { return this.ad;}

public void bulas(Insan kurban) {
kurban.hastaOl();
kurban.hastalikTur = this;
};

}

public static class Insan {
private String ad;
private int yas;
private boolean cins; //true: kız, false: erkek
private boolean hastalik; //true: hasta, false: sağlıklı
private Virus hastalikTur;


public Insan() { //constructor
ad = "";
yas = 0;
cins = true;
hastalik = false;
}

public Insan(String a, int y, boolean c) {
this.ad = a;
this.yas = y;
this.cins = c;
this.hastalik = false;
}

public String adinNe() { return this.ad;}
public void adinBuolsun(String ad) { this.ad = ad;}
public void hastaOl() { this.hastalik = true;}
public void iyiles() { this.hastalik = false;}
public String hastaMisin() {
if(this.hastalik)
return "Hastayım";
else
return "İyiyim";
}
public String hastaliginNe() { return this.hastalikTur.adinNe();}
public Virus virusunNe() { return this.hastalikTur;}
}

public static void main(String[] args) {
Insan ali = new Insan("Ali",18,false);
Insan elif = new Insan("Elif",30,true);

Virus corona = new Virus("Corona C-19");

System.out.println(corona.adinNe());
System.out.println("Alinin sağlık durumu: "+ali.hastaMisin());
corona.bulas(ali);
System.out.println("Alinin sağlık durumu: "+ali.hastaMisin());
System.out.println("Alinin hastalığı: "+ali.hastaliginNe());

}

