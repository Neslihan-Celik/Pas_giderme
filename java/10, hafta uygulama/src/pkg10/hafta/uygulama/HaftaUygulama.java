
package pkg10.hafta.uygulama;

import java.util.ArrayList;

public class HaftaUygulama {
// cem hocanın kodları
    
    
   // Üyeleri temsilen Insan sınıfı...
public static class Insan {
private String ad;
private Insan arkadas;
public Insan(String a) { ad = a;}
public String adiniSoyle() { return ad; }
public void adDegis(String a) { ad = a;}
public Insan arkadasinKim() { return arkadas; }
public void arkadasOl(Insan ins) {
// KRİTİK METOD! Neden böyle oldu? Daha iyisi olabilir mi?
if (arkadas==null) arkadas=ins; // Eğer arkadaşım yoksa verileni arkadaşım yap
if (ins.arkadasinKim()==null) ins.arkadasOl(this); // Eğer verilenin arkadaşı yoksa onun arkadaşı ben olayım
}
public void arkadaslikBitir() {
if(arkadas.arkadasinKim()==this) arkadas.arkadaslikBitir();
arkadas = null; }
public boolean arkadasMisin(Insan ins) { return (arkadas==ins);}




}   
 // SosyalMedya sınıfı, kişilere evsahipliği yapan, ve kişilerin toplamasından oluşan bir sınıftır.

public static class SosyalMedya {
ArrayList<Insan> insanlar = new ArrayList(); //Sosyal medya üyelerinin toplamasını tutuyor.
//Aşağıdaki diziler, sınıfın veritabanı. Ad ve soyadları bu dizilerden rastgele birleştirerek türetiyor.
String adlar[] = {"Kerem", "Can", "Filiz", "Funda", "Burak", "Berrin", "Ahmet", "Nur","Eray","Sinem"};
String soyadlar[] = {"Çirkin", "Yılmaz", "Çetin", "Uzun", "Şenoğlu", "Çiçek", "Kuzgun", "Yıldız", "Bektaş", "Bulut"};
public  SosyalMedya(int kisi) {
// Yapılandırıcımız
uyeUret(kisi);
}
public void uyeUret(int kisi) {
insanlar.clear(); // Üyelerini temizliyor
// İnsan nesneleri üretiliyor... "kisi" parametresi, kaç kişilik bir toplulluk oluşturulacağını belirler.
// Kodlarda sabit değerler yerine dizilerin dinamik veri uzunlukları kullanılmalıdır ki veri sayısı değiştiğinde kodda bir değişiklik olmasın.
for (int i=0; i<kisi; i++)
insanlar.add(new Insan(adlar[(int)(Math.random()*adlar.length)] + " " + soyadlar[(int)(Math.random()*soyadlar.length)]));
}

public void eslestir() {
// Arkadaş atamaları yapılıyor... ÇOK KRİTİK METOD!! Anlamaya çalışın, daha iyisi olabilir mi?
// Eğer tek sayıda insanımız varsa biri mecburen arkadaşsız kalacak
// Arkadaşlık, çif taraflı sahiplik olacaksa; kişi sayısının yarısı kadar işlem yapmamız yeterli çünkü arkadasOl() metodu çift taraflı arkadaşlığı garantiliyor.
byte baglanti = (byte)(insanlar.size()/2); // Kaç tane kişi için arkadaş eşlemesi yapılacak
int yer; // Arkadaş bulunacak kişinin indisini tutmak için geçici değişken
for (int i=0; i<baglanti; i++) {
    yer = 0;
while (insanlar.get(yer).arkadasinKim()!=null) // Arkadaş bulunmaya uygun kişinin yerini bulmak
yer++;
// Şimdi "yer" indisli arkadaşsız kişi için rastgele bir arkadaşı olmayan arkadaş bulalım.
Insan x=insanlar.get((int)(Math.random()*insanlar.size()));
while ((x.arkadasinKim()!=null) || (x==insanlar.get(yer)))
x = insanlar.get((int)(Math.random()*insanlar.size()));
insanlar.get(yer).arkadasOl(x);
}
}
public void uyeleriGoster() {
//Sosyal medya üyelerini gösteriyoruz
for (int k=0; k<insanlar.size(); k++)
System.out.println((k+1)+". Üye: "+ insanlar.get(k).adiniSoyle().toUpperCase()+" Arkadaşı: "+((insanlar.get(k).arkadasinKim()!=null)?insanlar.get(k).arkadasinKim().adiniSoyle().toUpperCase():" yok"));
}
// Benim geliştirdiğim kod kısmı birincci kısım
public boolean tanısabilirMi(Insan ins1, Insan ins2) { 
// ins1 ve ins2'nin tanışması mümkünse true, aksi halde false dönmeli
// eğer ins1 ile ins2'nin ortak arkadaşı varsa tanışabilirler
   return  ((ins1.arkadasinKim()==ins2.arkadasinKim()))?true:false;}

/* burada uygulanacak kod adımlarını tasarlayalım ilk önce birinci parametreye sor arakadasin kim diye ardından 
 onu ArrayListe at daha sonrasında arrayliste atılan kişiye sorarkadaşin kim diye onuda at array liste bu adımları 
 sürekli tekrar et ve her defasında da kontrol et gelen kişi ikinci parametreyle eşitmi diye yaptığın her adımı say 
 sayaç değişkeninde */
 
     

public ArrayList tanismaYolu(Insan ins1, Insan ins2) {
 ArrayList<Insan> yol = new ArrayList();
int say = 0;
yol.add(ins1.arkadasinKim());
 for(int k=0;k<10;k++)
while(yol.get(k).arkadasinKim()!=ins2){
  yol.add(yol.get(k).arkadasinKim());
  say++;
}
// public byte kacAdim (Insan ins1, Insan ins2){(ins1.arkadasinKim()==ins2)? return say:return-1;
}


}
 
    public static void main(String[] args) {
      SosyalMedya medya = new SosyalMedya(10);
medya.eslestir();
medya.uyeleriGoster();
System.out.println(medya.insanlar.size());
   
    }
    
}
