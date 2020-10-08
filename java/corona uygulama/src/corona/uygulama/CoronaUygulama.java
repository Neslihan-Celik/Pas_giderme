
package corona.uygulama;


public class CoronaUygulama {
    public static class insan
    {
    private String isim;
    private boolean cins;// true =kız false=erkek
    private boolean hastalik;// true =hasta false=hasta değil
    private boolean bagisiklik; //bağışıklık =true  iptal =false

    public insan(String a,boolean c)
    {
        this.isim =a;
        this.cins= c;
        this.hastalik=false;
        this.bagisiklik=false;
     
        
    }
   public String adinNe() { return this.isim;}
    public void hastaOl() { hastalik=true; }
    public void bagisiklikAl() {  hastalik=false;}
    public void bagisiklikiptal() {  hastalik=true;}
   public String hastaMisin() {
    if(this.hastalik)
return "Hastayim";
else
return "hasta değilim";}
public void ilackullan(){hastalik=false;}
    }

    public static class Virus 
{
private String isim; 
private boolean bulas;
private boolean aktif;

public Virus(String ad, boolean b, boolean ak) 
{
this.isim = ad;
bulas = b;
aktif = ak;

}
public String virusadiNe() { return this.isim;}
public void bulasKapat() {bulas=false;}
public void bulasAc (insan yenihasta)
{ yenihasta.hastaOl(); 
};
}

    public static class ilac
    {
      private String ism;
      private boolean aktif;
     
        public ilac(String ilismi,boolean akt)
        {
           ism=ilismi; 
           aktif=akt;
          
        }
        public String ilacAdine() { return this.ism;}
        public void ilacEtkisiz(){aktif=false; }
    }
    
    public static void main(String[] args)
    {
       insan nes=new insan("nes",true);
        insan os=new insan("os",false);
        Virus corona=new Virus("corona",true,true);
        Virus coronb=new Virus("coronb",true,true);
        ilac asi=new ilac("aşı",true);
        ilac hap=new ilac("hap",true);
        System.out.println(nes.adinNe());
        System.out.println(nes.hastaMisin());
        coronb.bulasAc(nes);
        System.out.println("nes'in durumu\t"+nes.hastaMisin());
        coronb.bulasAc(os);
      System.out.println(os.hastaMisin());     
      System.out.println(coronb.virusadiNe());
   nes.ilackullan();
    System.out.println("nes'un hastalik durumu\t" + nes.hastalik);
    nes.bagisiklikAl();
    coronb.bulasKapat();
    System.out.println("nes'in durumu\t"+nes.hastaMisin());
    System.out.println("os'un durumu\t" + os.hastalik);
    os.ilackullan();
    os.bagisiklikAl();
    coronb.bulasKapat();
    System.out.println("os'un durumu\t" + os.bagisiklik);  
  corona.bulasAc(os);
  os.bagisiklikAl();
  System.out.println("os'un durumu\t"+os.hastaMisin());
  coronb.bulasAc(os);
  corona.bulasAc(os);
   System.out.println("os'un durumu\t"+os.hastaMisin());
os.ilackullan();
 System.out.println("os'un durumu\t"+os.hastaMisin());
    }
    
}
