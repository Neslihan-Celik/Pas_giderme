
package ntp.dönem.ödevi.pkg2_otel;

import java.util.ArrayList;


public class NTPDönemÖdevi2_otel {

    public enum odaTip{
   
    TekStandart(100),
    ÇiftStandart(200),
    ÇiftSuit(500);  
    private final int tipi;
    private odaTip(int t){this.tipi=t;}
    public int tipFiyatSoyle(){return this.tipi;}  
    }
 
    public enum yon{
    Güney(50),
    Kuzey(0),
    Doğu(20),
    Batı(10);
    private final int yonu;
    private yon(int y){this.yonu=y;}
    public int yonFiyatNe(){return this.yonu;}
    }
    
    public enum durum {
    Boş,
    Dolu,
    Kirli,
    Bakımda;    
    }
    
    public enum yapiTip{
    Klasik(0),
    Bungalov(50),
    Ağaç(90);
    private final int yapisi;
    private yapiTip(int y){this.yapisi=y;}
    public int yapiFiyatNe(){return this.yapisi;}
    }
    public static class oda{
    odaTip tipi=null;
    yon yonu=null;
    durum  durumu=null;
    yapiTip yapisi=null;
    int fiyat=0;
    int odaNo=0;
    
        public oda(int n){this.odaNo=n;}
        public odaTip TipiNe() {return tipi;}
        public void TipiNe(odaTip t) {this.tipi = t;}
        public yon YonuNe() {return yonu; }
        public void YonuNe(yon y1) {this.yonu = y1; }
        public durum DurumuNe() { return durumu;}
        public void DurumuNe(durum d) {this.durumu = d;}
        public yapiTip YapisiNasil() {return yapisi;}
        public void YapisiNasil(yapiTip y2) {this.yapisi = y2; }
        public int FiyatKac() {return fiyat;}
        public void FiyatKac(int f,oda o) {
            this.fiyat =o.TipiNe().tipFiyatSoyle()+
                        o.YapisiNasil().yapiFiyatNe()+
                        o.YonuNe().yonFiyatNe() ;}
        public int OdaNo() {return odaNo;}
        public void OdaNo(int oNo) {this.odaNo = oNo;}
        public void soyle(){
        System.out.println("Odanın numarası:"+oda.this.odaNo+
                           "\nDurumu:"+this.DurumuNe()+
                           "\nYapısı:"+this.YapisiNasil()+
                           "\nTipi:"+this.TipiNe()+
                           "\nYönü :"+this.YonuNe()+
                           "\nFiyatı:"+this.FiyatKac()+" TL");
       }
        public void yaz(String y){System.out.println(y);}
        public void odaYap(){
            oda o = null  ;
           o.tipi=odaTip.values()[(int)(Math.random()*odaTip.values().length)];
           o.durumu=durum.values()[(int)(Math.random()*durum.values().length)];
           o.yapisi=yapiTip.values()[(int)(Math.random()*yapiTip.values().length)];
           o.yonu=yon.values()[(int)(Math.random()*yon.values().length)];    
              }
           }  
   
            public static class otel{
        String ad;
        oda o;
        int OdaSayisi;
        int kasa;
        ArrayList<oda> odaListe = new ArrayList();

        public otel(String a) {this.ad=a; }
        public String AdNe() {return ad;}
        public void AdDegis(String ad) {this.ad = ad;}
        public void dagit(){
             for(int i=0;i<10;i++){
                 o.odaYap();
              odaListe.add(o);
             }
        }
            public void  odemeAl(int p) {kasa+=p; }
            public void  odemeYap(int p) {kasa-=p; }
            public int KasaDurum() {return kasa;}
            public void Kasa(int k) { this.kasa = k;}
    }
     
      public static class insan{
        String ad;
        oda barinak;
        int para;
        
            public insan(String a){this.ad=a;}
            public String AdSoyle() { return ad;}
            public void AdDegis(String a) {this.ad = a; }
            public oda odaDurum() {return barinak;}
            public void odaTut(oda b) { this.barinak = b;}
            public  boolean paramVarMi(int p) { return (para>p)?true:false; }
            public void odemeYap(int p,otel o) {
                if(paramVarMi(p)==true)
                    para-=p;
           o.odemeAl(p);
            }
            
            public static class musteri extends insan{
             int p;
             oda o;
             otel isyeri;
            public musteri(String a) {super(a);}
            public oda odaGetir(String durum,String tur,String yapi,String tip){
                 return null;
          }
            public oda odaCik(){return  super.barinak=null;}
            public oda odaTut(){return super.barinak=o;}
         
            public static class otelPersonel extends insan{
            
            public otelPersonel(String a) {super(a);}
            public void maasAl(int p){
                super.para+=p;  }
             //  isyeri.odemeYap(p); }
            public durum  odaTemizle(){return super.barinak.durumu=barinak.durumu.Boş;}
            }
        }
  }
 
  
    public static void main(String[] args) {
        oda yeni =new oda(22);
         otel z = new otel("zerrin otel");
         musteri a=new musteri("a");
         yeni.FiyatKac();          
         yeni.odaYap();
         yeni.soyle();
         z.dagit();
         a.odaTut();
  
    }
}
