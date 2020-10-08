

package takım.oyunu;

import java.util.ArrayList;
public class TakımOyunu {

 public static class Insan {
 String ad;
 int yas = 0;
 public Insan(String ad) {
 this.ad = ad;
 }
 public String getAd() {
 return ad;
 }
 public void setAd(String ad) {
 this.ad = ad;
 }
 public int getYas() {
 return yas;
 }
 public void setYas(int yas) {
 this.yas = yas;
 }

 public void tanit() {
 System.out.println("Adım "+getAd()+", yaşım "+getYas());
 }
 

 public static class Oyuncu extends Insan {
 int sirtNo;
 String mevki = "Orta";
 int sariKart = 0;
 int kirmiziKart = 0;
    int fiyat =0;
 Takim t;

 public Oyuncu(String ad, int no) {
 super(ad);
 this.sirtNo = no;
 }
 public int getSirtNo() {
 return sirtNo;
 }
 public void setSirtNo(int sirtNo) {
 this.sirtNo = sirtNo;
 }
 public String getMevki() {
 return mevki;
 }
 public void setMevki(String mevki) {
 this.mevki = mevki;
 }
 public int getSariKart() {
 return sariKart;
 }
 public void setSariKart(int sariKart) {
 this.sariKart = sariKart;
 }
 public int getKirmiziKart() {
 return kirmiziKart;
 }
 public void setKirmiziKart(int kirmiziKart) {
 this.kirmiziKart = kirmiziKart;
 }
 public int getFiyat() {
 return fiyat;
 }
 public void setFiyat(int fiyat) {
 this.fiyat = fiyat;
 }
 public Takim getTakim() {
 return t;
 }
 public void setTakim(Takim t) {
 this.t = t;
 }

 @Override
 public void tanit() {
 super.tanit();
 System.out.println("Sırt numaram "+getSirtNo()+", mevkim "+getMevki());
 System.out.println("Kırmızı kartlarım "+getKirmiziKart()+", sarı kartlarım "+getSariKart()+" adettir.");
 }
 }

 public static class Hakem extends Insan {
 String konum = "Orta";
 int sariKart = 0;
 int kirmiziKart = 0;
 public Hakem(String ad) {
 super(ad);
 }
 public String getKonum() {
 return konum;
 }
 public void setKonum(String konum) {
 this.konum = konum;
 }
 public int getSariKart() {
 return sariKart;
 }
 public void setSariKart(int sariKart) {
 this.sariKart = sariKart;
 }
 public int getKirmiziKart() {
 return kirmiziKart;
 }
 public void setKirmiziKart(int kirmiziKart) {
 this.kirmiziKart = kirmiziKart;
 }

 public void kirmiziKartGoster(Oyuncu o) {
 setKirmiziKart(getKirmiziKart()+1); //this.kirmiziKart += 1;
 o.setKirmiziKart(o.getKirmiziKart()+1); // o.kirmiziKart ++;
 }

 public void sariKartGoster(Oyuncu o) {
 setSariKart(getSariKart()+1);
 o.setSariKart(o.getSariKart()+1);
 }

 @Override
 public void tanit() {
 super.tanit();/*
 System.out.println(getKonum()+" hakemim. Gösterdiğim kırmızı kart "+getKirmiziKart()+", sarı kart
"+getSariKart());*/

 }}

 public static class Takim {
 String ad;
 int kasa = 0;
 ArrayList<Oyuncu> liste = new ArrayList();

 public Takim(String a) {
 this.ad = a;
 liste.clear();
 }

 public void bagisAl(int b) { this.kasa += b;}
 public String getAd() {
 return ad;
 }
 public void setAd(String ad) {
 this.ad = ad;
 }
 public int getKasa() {
 return kasa;
 }
 public void setKasa(int kasa) {
 this.kasa = kasa;
 }

 public void transferAl(Oyuncu o) {
   if(this.kasa>=o.getFiyat()) {
 liste.add(o);
 if (o.getTakim()!=null) {
 this.kasa -= o.getFiyat();
 o.getTakim().bagisAl(o.getFiyat());
 o.getTakim().transferVer(o);
 }
 o.setTakim(this);
 }
 }

 public void transferVer(Oyuncu o) {
 liste.remove(o);
 }

 public void tanit(){
 System.out.println("Takımımız "+getAd()+ " kasamızda "+getKasa()+" TL var. Oyuncu sayımız"+
liste.size());
 System.out.println("Toplam oyuncu varlığımız "+oyuncuDegerToplami()+" TL kırmız kartlarımız"+
kirmiziKartSayisi()+" sarı kartlarımız "+sariKartSayisi());     
 }

       
 
 public int kirmiziKartSayisi() {
 int top = 0;
 for(Oyuncu o: liste)
 top += o.getKirmiziKart();
 return top;
 }

 public int sariKartSayisi() {
 int top = 0;
 for(Oyuncu o: liste)
 top += o.getSariKart();
 return top;
 }

 public int oyuncuDegerToplami() {
   int top = 0;
 for(Oyuncu o: liste)
 top += o.getFiyat();
 return top;
 }
 }

 public static class Lig {
 String ad;
 ArrayList<Takim> liste = new ArrayList();
 
 public Lig(String a) { this.ad = a;}
 public String getAd() {return ad;}
 public void setAd(String ad) {this.ad = ad;}
 public void ekle(Takim t) { liste.add(t);}
 public void cikar(Takim t) { liste.remove(t);}
 
 public int oyuncuSayisi(Takim t){
     int sayi;
     sayi=t.liste.size();
 return sayi;}
 }
 

 public static void main(String[] args) {

 Oyuncu kerem = new Oyuncu("Kerem", 10);
 Oyuncu yigit = new Oyuncu("Yiğit", 11);
 Oyuncu filiz = new Oyuncu("Filiz",5);

 kerem.setYas(19);

 Hakem helin = new Hakem("Helin");
 helin.sariKartGoster(kerem);
 helin.sariKartGoster(kerem);

 helin.kirmiziKartGoster(filiz);
 helin.sariKartGoster(yigit);
 Takim bjk = new Takim("Beşiktaş");
 Takim gs = new Takim ("Galatasaray");
 Lig pro = new Lig("Profesyonel Lig");
 pro.ekle(gs);
 pro.ekle(bjk);

 bjk.bagisAl(100000);
 gs.bagisAl(20000);

 kerem.setFiyat(20000);
 yigit.setFiyat(20000);
 filiz.setFiyat(50000);

 gs.transferAl(kerem);
 bjk.transferAl(filiz);
 bjk.transferAl(yigit);
 bjk.transferAl(kerem);

 gs.transferAl(filiz);
 kerem.tanit();

 helin.tanit();

 bjk.tanit();
 gs.tanit();
 /*
 Soru: Lig sınıfında nasıl bir eklenti yapılmalıki, bu sınıftan üretilen pro nesnesinin,
 System.out.println(pro.oyuncuSayisi(bjk)); şeklinde kullanımıyla bir çıktı alınsın?
 */
 }
 }  
 
    
  