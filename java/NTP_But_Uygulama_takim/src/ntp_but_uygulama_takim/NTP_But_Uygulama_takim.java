package ntp_but_uygulama_takim;

import java.util.ArrayList;
import ntp_but_uygulama_takim.NTP_But_Uygulama_takim.oyuncu.hakem;
// Bunlar?n tam olarak ne olduklar?n? bilmiyorum ancak kodlardaki hatalar?n giderilmesini sa?lad?lar
import ntp_but_uygulama_takim.NTP_But_Uygulama_takim.oyuncu.takim;
import ntp_but_uygulama_takim.NTP_But_Uygulama_takim.oyuncu.top;

public class NTP_But_Uygulama_takim {
    
    public static class insan{//Temel insan s?n?f? tan?mland? ve metodlar? olu?turuldu, 
        String ad="isim yok";
        String uyruk="TC";
        int yas=0;
        int boy=0;
        int kilo=0;
        public insan(String isim){this.ad = isim;}// insan yap?land?r?c?s?
        public insan(String isim,String uyruk,int yas,int boy,int kilo){
        this.ad=isim;
        this.boy=boy;
        this.kilo=kilo;
        this.uyruk=uyruk;
        this.yas=yas;
       
        }
        public String AdNe() {return ad;}
        public void AdDegis(String ad) { this.ad = ad;}
        public String UyrukNe() {return uyruk;}
        public void UyrukDegis(String uyruk) {this.uyruk = uyruk;}
        public int YasKac() { return yas;}
        public void Yasdegis(int yas) { this.yas = yas; }
        public int BoyKac() { return boy;}
        public void BoyDegis(int boy) { this.boy = boy;}
        public int KiloKac() {return kilo;}
        public void KiloDegis(int kilo) {this.kilo = kilo;}
    
        public void tanit() {
        System.out.println("Ad?m "+AdNe()+", ya??m "+YasKac()+", boyum "+BoyKac()+",kilom  "+KiloKac());}
        }

   public static class oyuncu extends insan {//?nsan s?n?f?ndan t�retilen Oyuncu s?n?f? ?nsan s?n?f? ile ayn? bir �ok �zeli?iyle beraber kendine has �zellikleri de bulunmaktad?r
        String pozisyon="pivot";
        int faul=0;//  oyuncunun kendi yapt??? hatalar- bizim ligimizde oyuncu faul s?n?r? 5'tir
        int macSayisi=0; // �?kt??? ma� say?s?
        int MBD=0; //Ma� Ba??na Oynad??? dakika
        int numara=0; // s?rt numaras?
        float puan=0; // sezon boyunca ba?ar? daha sonras?na hesaplanacakt?r ba?ar? puan?
        int sayi=0; // att??? say?lar
        int deger=0; // oyuncunun �creti
        int kasa=0;
        int ceza=0;
       takim takim;
        boolean daimiCeza=false; // Spordan men edilip edilmeme durumu false=spor yapabilir / true=�m�r boyu cezal?
        top t; // oyuncu topa sahiptir ki kullanabilsin top oyuncuda bir �zellik olarak bulunuyor
        public oyuncu(String ad,int sirtno,int yas,int b, int k,String mevki) { // Yap?land?r?c? ile oyuncunun ilk bilgilerini atamas?n?n yap?lmas? sa?land?
            super(ad);  //Ana s?n?f?n yani insan?n Ad �zelli?i al?nd? ve kullan?ld?
            this.numara=sirtno;
            this.yas=yas;
            this.boy=b;
            this.pozisyon=mevki;
            this.kilo=k;
        }
        
        public String PozisyonNe() {return pozisyon;}
        public void PozisyonDegis(String pozisyon) {this.pozisyon = pozisyon;}
        public int FaulKac() {return faul;}
        public void FaulDegis(int faul) { this.faul = faul; }
        public int MacSayisiNe() { return macSayisi;}
        public void MacSayisiDegis(int macSayisi) {this.macSayisi = macSayisi; }
        public int MBDKac() {return MBD;}
        public void MBDDegis(int MBD) { this.MBD = MBD;}
        public int NumaraKac() {return numara; }
        public void NumaraDegis(int numara) {this.numara = numara;}
        public float PuanKac() {return puan;}
        public void PuanDegis(float puan) {  //Bir oyuncunun puan? �?kt??? ma� say?s? ,att??? basket say?s? ve ma� ba??na oyunda kalma s�resinin toplan?p toplam faul yani hatal? hareketlere b�l�nmesiyle bulunur 
            this.puan = (this.macSayisi+this.sayi+this.MBD)/this.faul; }
        public int SayiKac() {return sayi;}
        public void SayiDegis(int sayi) {this.sayi = sayi;}  
        public void paraAl(int i){this.kasa+=i;}
        public int kasaDurum(){return this.kasa;}
        public void cezaAl(){this.ceza+=ceza;}
        public void cezaAl(oyuncu o, top t){
            if(o.faul>5)    // bir oyuncu be? faulden fazla faul yapm??sa ceza al?r
             this.ceza+=ceza;
            else if(t.sure>4)  // bir oyuncu topu d�rt saniyeden fazla s�re elinde tutmu?sa ceza al?r
              this.ceza+=ceza;
        }
        public int cezaNekadar(){return ceza;}
        public void topAl(top t){t.TopSahipDegis(this);}
        public takim HangiTakimdasin(){return takim;}// oyuncu tak?ma sahip ve onun     bilgilerini payla?abilir 
        public void TakimDegis(takim t){this.takim=t;}
        @Override
        public void tanit(){   //?nsan s?n?f?n?n tan?t metodu override edildi ve oyuncunun kendisine g�re baz? eklentiler yap?ld?
            super.tanit();
            System.out.println("\nGenel bilgilerim "+
                                "\nS?rt numaram "+NumaraKac()+
                               "\npozisyonum "+PozisyonNe()+
                                "\nfaul say?m "+FaulKac()+
                                "\ntoplam ma� say?m "+MacSayisiNe()+
                                "\nMa� Ba??na Oyunda kalma s�rem "+MBDKac()+
                                "\npuan?m "+PuanKac()+
                                "\nsezon boyunca att???m toplam say? "+SayiKac());
        }
        
    public static class top{  // top s?n?f? olu?turuldu 
        String ad="null";
        byte agirlik=0;
        byte sure=0;  // saniye cinsinden topun elde tutulma s�resi
        boolean topkullan=true;   // topun kullan?labilirli?i e?er oyun durmu?sa top kullan?lamaz true kullan?labilir false kullan?lamaz
        oyuncu o;   // oyuncu nas?l topa sahipse topda oyuncuya sahip b�ylece birbirleri hakk?nda bilgi sahibi olup birbirlerinin metodlar?na ula?abilecekler
        
            public top(String ad) {this.ad = ad;}
            public double AgirlikNeKadar() { return agirlik;}
            public void AgirlikDegis(byte agirlik) { this.agirlik = agirlik; }
            public oyuncu TopKimde() {return o;}
            public void TopSahipDegis(oyuncu o) {this.o = o; }
            public boolean TopDurumNe(){return this.topkullan;}
            
      }    
    public static class hakem extends insan {  //insan s?n?f?ndan hakem t�retildi hakem oyuncunun teknik olarak karde?i say?l?yor bir �ok y�nden benzer olsalar da farkl? g�rev ve yetileri vard?r
        String G�revAlan=" ";
        top t; // oyuncu ile beraber hakem de topa sahiptir ��nk� oyunu durdurmak i�in topu sahadan �eker veya s�rer
        public hakem(String isim) {super(isim);}
        public String G�revAlaniNe() {return G�revAlan;}
        public void G�revAlaniDegis(String G�revAlan) {this.G�revAlan = G�revAlan;}
        public void DudukCal(top t) {t.topkullan=false;}// hakem oyunu durdurur topun kullan?labilirlik �zelli?ini de?i?tirerek
        public void oyunBaslat(top t) {t.topkullan=true;}   // hakem oyunu ba?lat?r 
        public void cezaVer(oyuncu o,top t){   // hakem ceza verirken oyunu durdurur ard?ndan oyuncuya ceza verir ve topun sahibini de?i?tirir sonras?nda ise oyunu tekrardan ba?lat?r
            t.topkullan=false; // DudukCal(t);
            o.cezaAl();
            t.TopSahipDegis(o);
            t.topkullan=true; //oyunBaslat(t);
        }
        public void oyunDurumNe(top t){  //Oyun durumu sorgulanabilir
        if(t.TopDurumNe()==true)
          System.out.println("Oyun devam ediyor");
        else 
           System.out.println("Oyun durmu?");   
            }   
       }
      
      public static class Antrenor extends insan {   // ?nsandan antren�r t�retildi her tak?m?n bir antren�r� vard?r oyuncular? y�nlendiren
            takim t;    //antren�r tak?ma sahiptir ve onun metodlar?n? kullan?r y�nlendirir
            int para=0;
            public Antrenor(String isim) {super(isim);}
            public int ParaDurum() {return para;}
            public void ParaAl(int para) {  this.para += para; }
            public void molaAl(hakem h, top t){ h.DudukCal(t);}
            public void oyuncuDegis(oyuncu o,takim t){  // antren�r istedi?i kadar oyuncu de?i?ikli?i yapabilir istedi?i ki?iyi as?l listeden al?p yede?e alabilir
                t.asil.remove(o);
                t.yedek.add(o);
            }
       
       }
    public static class takim {  // tak?m s?n?f? olu?turuldu
        String ad="";
        int kasa = 0;
        int takimCezalari=0;
        ArrayList<oyuncu> oyuncular =new ArrayList();   //T�m oyuncular listesi
        ArrayList<oyuncu> asil = new ArrayList();  // as?l oyuncu listesi 5 ki?ilik
        ArrayList<oyuncu> yedek= new ArrayList();  // yedek oyuncu listesi
        public takim(String a) {
        this.ad = a;
        asil.clear();
        yedek.clear();
        oyuncular.clear();
        }

        public String AdSoyle() {return ad;}
        public void AdDegistir(String ad) {this.ad = ad;}
        public void odemeYap(int i){this.kasa-=i;}
        public int KasaDurum() { return kasa;}
        public void KasaGuncelle(int k) { this.kasa +=k;}
        public void transferVer(oyuncu o , takim t) {     //transfer yapma metodu transfer      yap?ld?  
            this.oyuncular.remove(o);  //oyuncu kendi listesinden silindi
            t.oyuncular.add(o);  //di?er tak?m?n listesine eklendi
            t.odemeYap(o.deger);  //kar?? tak?m oyuncunun �cretini �dedi
            o.paraAl(o.deger);  //oyuncuya paras? �dendi
             o.takim=t;   //Oyuncunun tak?m bilgisi de?i?tireildi
        }
        public void transferAl(oyuncu o) {   // transfer al?nd? kontroller yap?ld? oyuncunun de?eri ile kasa aras?nda
            if(kasa>o.deger) {
                o.kasa+=o.deger;   //oyuncuya de?eri kadar para �dendi
                odemeYap(o.deger);
                this.oyuncular.add(o);   // oyuncu kadroya al?nd?
                o.takim=this;
            }
        }
        public int TakimCezaSoyle(oyuncu o){   // tak?m?n oyuncular?n?n cezalar? topland? ve tak?m?n cezalar? bulundu
           int say=0;
           int k=0;
           while(k<oyuncular.size()){
            say+= o.cezaNekadar();
           k++;}
           takimCezalari=say; 
           return takimCezalari;
        }
        public void tanit(){
        System.out.println("Tak?m?m?z "+AdSoyle()+
                          " kasam?zda "+KasaDurum()+" TL var."+
                          " Oyuncu say?m?z "+(asil.size()+yedek.size()+oyuncular.size()));
        }
 
        }
    }
    
     
     public static class federasyon{   // t�m sistemi y�neten s?n?f federasyon i�erisinde t�m s?n?flar? kontrol ediyor neredeyse t�m s?n?flara ve metodlara sahip sahip
        String ad;
        ArrayList<takim> list = new ArrayList();

        public federasyon(String a) { this.ad = a;}
        public String AdGoster() {return ad;}
        public void AdGuncelle(String ad) {this.ad = ad;}
        public void TakimEkle(takim t) { list.add(t);}
        public void TakimCikar(takim t) { list.remove(t);}
        public void odulVer(oyuncu o){  // federasyon oyunculara �zel �d�l verebilir
          int �d�l =9000;
         o.paraAl(�d�l);
        }
        public void SpordanMenEt(oyuncu o,takim t){   // Federasyon e?er isterse herhangi bir oyuncuyu spordan men edebilir
        t.oyuncular.remove(o);
        o.daimiCeza=true;
        }
        public void takimListele(){
         for(int k =0; k<list.size();k++)
        System.out.println(k+" Tak?mlar?m?z "+list.get(k));
        }
        public void tanit(){System.out.println( " Federasyonumuza �ye olan tak?m say?m?z "+AdGoster()+ list.size()); }
        public int ToplamPara(){   // federasyona �ye t�m tak?mlar?n toplam mal varl???
            int mal=0;
            for(int k =0; k<list.size();k++)
           mal+=(list.get(k).KasaDurum()); 
            System.out.println(" Federasyonumuzda bulunan tak?mlar?n toplam mal varl???:"+mal);
            return mal;  
        }                       
        public void EniyiOyuncu(takim t){   // En iyi oyuncu metodu oyuncunun puan?na g�re en iyiyi buluyor
           float en=0; 
         oyuncu best = null;
          for(int i=0;i<t.oyuncular.size();i++){
          if(t.oyuncular.get(i).puan > t.oyuncular.get(i+1).puan){
              en=t.oyuncular.get(i).puan;
              best=t.oyuncular.get(i);         
          }
            else{
                en=t.oyuncular.get(i+1).puan;
                best=t.oyuncular.get(i+1);
                }
          }
           System.out.println("En ba?ar?l? oyuncu "+best+" Puan? "+en);
        }
         public void OyuncuDurumBildir(oyuncu o){ // federasyon oyuncunun durumunu sorgulayabilir ve denetleyebilir
           System.out.println(" Ad?m "+o.AdNe()+" puan?m "+o.PuanKac()+"  mal varl???m "+ o.kasaDurum()+" tak?m?m "+o.HangiTakimdasin().AdSoyle());
        }
        public void enCokCezaliOyuncu(takim t){   // en �ok ceza alan oyuncu metodu 
               int eb=0; 
               oyuncu cezali = null;
          for(int i=0;i<t.oyuncular.size();i++){
          if(t.oyuncular.get(i).ceza > t.oyuncular.get(i+1).ceza){
              eb=t.oyuncular.get(i).ceza;
              cezali=t.oyuncular.get(i);         
          }
          else{
              eb=t.oyuncular.get(i+1).ceza;
              cezali=t.oyuncular.get(i+1);
              }
          } 
          System.out.println("En �ok ceza alan oyuncu "+cezali+" cezas? "+eb);
                    
        }
        
 }
 
      
    public static void main(String[] args) {//perde �n� �?kt?lar? 
// oyuncular tan?mland? ve de?er atamalar? yap?ld?
        oyuncu ali=new oyuncu ("Ali demir",22,25,152,55,"pivot");
        oyuncu nes=new oyuncu ("Nes �elik",23,23,163,49,"K?sa_Forvet");
        oyuncu suat =new oyuncu ("Suat ay",25,20,180,72,"oyun kurucu");
        oyuncu ayda =new oyuncu ("Ayda ayla",10,26,190,82,"Uzun_forvet");
        oyuncu Deha =new oyuncu ("Deha kul",15,19,185,79,"pivot");
        ayda.macSayisi=25;
        Deha.macSayisi=56;
        suat.macSayisi=99;
        ali.tanit();
        nes.tanit();
        ali.deger=5;
        ali.faul=3;
        ali.macSayisi=15;
        ali.deger=15000;
        ali.puan=(float)3.55;
        ali.sayi=55;
        ali.MBD=22;
        ali.tanit();
        nes.deger=7;
        nes.faul=9;
        nes.macSayisi=10;
        nes.deger=20000;
        nes.puan=(float)4.15;
        nes.sayi=46;
        nes.MBD=19;
        nes.tanit();
        
        hakem h1=new hakem("ayla �ak?r");
        takim takim = new takim ("NBI");  
        takim takim1 = new takim ("TBF");  
        takim takim2 = new takim ("HTS");  
        h1.tanit(); 
         takim.tanit();
         takim.transferAl(nes);// tak?mlar transfer al?p verebilir
         takim.transferAl(ali);
         takim.transferAl(ayda);
         takim.transferAl(suat);
         takim.transferAl(Deha);
         takim.tanit();
         takim.transferVer(nes,takim2);
         takim2.tanit();
         System.out.println(nes.kasaDurum());
         nes.tanit();
         federasyon f=new federasyon("Basketbol federasyonu");//federasyon �retildi ve  isim verildi
         f.tanit();
         f.TakimEkle(takim);// tak?mlar eklendi
         f.TakimEkle(takim1);
         f.TakimEkle(takim2);
         f.tanit();
         top basket = new top ("basketbol topu");
         System.out.println(basket.topkullan);
         basket.topkullan=true;
         System.out.println(basket.TopKimde());// top  o an hangi oyuncuda oldu?unu bildirebilir
         nes.topAl(basket);
         System.out.println(basket.TopKimde().AdNe());
         System.out.println(f.list.get(0).AdSoyle());// federasyon listesindeki birinci s?radaki �yenin ad?n? g�steriyor
         System.out.println(f.list.get(0).KasaDurum());
         takim.KasaGuncelle(10000);
         takim1.KasaGuncelle(150000);
         takim2.KasaGuncelle(400000);
         System.out.println(takim.KasaDurum()+takim1.KasaDurum()+takim2.KasaDurum());
         takim1.KasaDurum();
         f.ToplamPara();// federasyon t�m �yelerin toplam mal varl???n? bildirebiliyor
        // f.enCokCezaliOyuncu();
System.out.println(" Federasyona �ye olan ben "+f.list.get(0).AdSoyle()+" cezam "+f.list.get(0).takimCezalari);
         f.enCokCezaliOyuncu(takim1);//En iyi ve en �ok cezal? oyuncuyu bulan metodlar?n �?kt?lar?
         f.EniyiOyuncu(takim);
          takim1.tanit();
         takim.tanit();
         takim.transferAl(nes);
         System.out.println(takim1.oyuncular.size());
         takim.tanit();
         takim1.transferAl(ali);// takim 1 taransfer al?yor oyuncular?n �cretleri de kasas?ndan d�?�yor
         takim1.transferAl(Deha);
         takim1.transferAl(ayda);
         takim1.transferAl(nes);
         System.out.println(" Ad?m "+nes.AdNe()+" puan?m "+nes.PuanKac()+"  mal varl???m "+ nes.kasaDurum());
         takim1.tanit();
         f.OyuncuDurumBildir(nes);
         f.enCokCezaliOyuncu(takim);   
    }
}
