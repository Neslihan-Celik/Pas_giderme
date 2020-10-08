// maç yönetim sistemi
package deneme;

import java.util.ArrayList;

public class Deneme {
  public static class Top{
  double agirlik;
  String tur;
  
  public Top (){
  this.agirlik=1;
  this.tur="Futbol";
  Oyuncu sahip;
  }

        public Top(String tur) {this.tur = tur;}
  
  
  
  public double agirlikNe(){return this.agirlik;}
   public void agirliginBu(double x){ this.agirlik=x;}

    public String getTur() { return tur;}
    public void setTur(String tur) { this.tur = tur;}
  }

  public  static class Insan{
  String ad;
  int yas;
  
  public Insan(){  }
    public Insan(String ad){this.ad=ad;}
    
    public String getAd() {return ad;}
    
    public void setAd(String ad) {this.ad = ad;}

    public int getYas() {return yas;}
    
    public void setYas(int yas) {this.yas = yas;}
  } 

  
  
  
  //  oyuncu sınıfı oyuncu insanın çocuğu olucak insan sınıfından türedi
  public static class Oyuncu extends Insan{
  byte sirtNo=0;
  String mevki="orta";
   byte sari =0;
   byte kirmizi=0;
   
        public Oyuncu(){  }
        public Oyuncu(byte sn){ this.sirtNo=sn;}
        public Oyuncu(String isim) { super(isim);}

        public byte getSirtNo() { return sirtNo; }
        public String getMevki() { return mevki;}

        public void setSirtNo(byte sirtNo) { this.sirtNo = sirtNo; }
        public void setMevki(String mevki) {this.mevki = mevki; }
 
  public void sariKartAl(){this.sari+=1;}
  public void kirmiziKartAl(){this.kirmizi+=1;}
  
  
  }
  
  
  // hakem sınıfı
  public static class Hakem extends Insan{
  byte kirmizi=0;
  byte sari=0;

       
        public Hakem(String ad) { super(ad); }

        public byte getKirmizi() {return kirmizi; }
        public byte getSari() {return sari;}
        public void setKirmizi(byte kirmizi) {this.kirmizi = kirmizi;}
        public void setSari(byte sari) {this.sari = sari;}
  
      // public void sariKartGoster(Oyuncu o){ this.sari+=1;};
      public void sariKartGoster(Oyuncu o){this.sari+=1; o.sariKartAl();}
      public void kirmiziKartGoster(Oyuncu o){ this.kirmizi+=1;o.kirmiziKartAl(); }
  }
 
  public static class Takim{
   String ad;
 
   ArrayList<Oyuncu> liste=new ArrayList();
 
   public void tranferAl(Oyuncu o){ liste.add(o);}
  public void tranferGonder(Oyuncu o){ liste.remove(o);}
  
  topaHakimOlmaSuren();
  KAcKirmiziKartAldın();
  KacSariKart();
  
  ...
  }
  

  
  
    public static void main(String[] args) {
     
        Oyuncu okan=new Oyuncu("okan");
    }
    
}
