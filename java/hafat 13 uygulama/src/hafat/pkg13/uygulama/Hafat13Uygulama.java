/*---NOTLAR----
1- çerçeveni çiz 
kuralları ortaya koy oyunu tarif et
2 -varlıkları gör, ilişkileri belirle 
 */
package hafat.pkg13.uygulama;


public class Hafat13Uygulama  {
   
    public enum Gorev{
    saldırı,savunma,lojistik
    }
    public enum Tasit{
    fırkateyn(10),
    ucakgemisi(20),
    denizalti(8),
    bot(5),
    kayik(2);
    private final int puan;
    
    private Tasit(int p){this.puan=p;} 
    public int puanSoyle(){return this.puan;}
    
    }
    public static class DenizAraci{
    String  kod;
    Tasit tur;
    Gorev gorevi=Gorev.lojistik;
    
    public DenizAraci(){this.kod= "N/A";}
    public DenizAraci(String k,Tasit t){this.kod= k; this.tur=t;}
    public DenizAraci(String kod){ this.tur=Tasit.bot; }
   // getterde void olmaz dönüş değeri olur
   // getterde return olmak zorunda
   public String kodunNe(){return this.kod;} 
   public void koduDegis(String k){this.kod=k;}// dönüş değeri yoksa void olur özellik değişimi yapacağız çünkü
   public String turunNe(){return this.tur.toString();}
   public void turDegis(Tasit t){this.tur=t;}
   public Gorev getGorevi() {return gorevi;}
   public void setGorevi(Gorev gorevi) {this.gorevi = gorevi;}
   

   /* public static class fikateyn extends DenizAraci{
    @Override
    public String turunNe(){return "Ben bir"+this.tur.toString()+"aracıyım";}
    }*/
    
    public static class Oyuncu{
      String ad="isimsiz";
      int puan=0; 
       ArrayList<DenizAraci> donanma = new ArrayList(); 

            public Oyuncu(String a) {this.ad=a;}
            public String getAd() {return ad;}
            public void setAd(String ad) {this.ad = ad;}
            public int getPuan() { return puan;  }
            public void setPuan(int puan) {this.puan = puan;}
            public void aracAl(DenizAraci t){this.donanma.add(t);}
    }  
   }
    
    public static void main(String[] args) {
    DenizAraci d1=new DenizAraci("A101",Tasit.kayik);
    DenizAraci d2=new DenizAraci("a099",Tasit.fırkateyn);
  DenizAraci d3=new DenizAraci("b121",Tasit.ucakgemisi);
  
   yuncu bilal=new Oyuncu ("Bilal");

    System.out.println(arac.kodunNe()+arac.turunNe().puanSoyle());   
 

    }
    
}
