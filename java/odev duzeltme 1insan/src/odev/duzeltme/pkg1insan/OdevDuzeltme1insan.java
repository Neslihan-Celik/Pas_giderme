
package odev.duzeltme.pkg1insan;

public class OdevDuzeltme1insan {

   
  public static class insan
{
      String isim;
      int yas;
      float para;
      boolean cinsiyet;// true kadın false erkek
      boolean engel;// true engelli false engelsiz
      public insan(String a,int y,float p,boolean c,boolean e )
      {
       isim=a;
       yas=y;
       para=p;
       cinsiyet=c;
       engel=e;
      }
    
 
    
 public String adinNe() { return isim; }
 public int yasinKac(){return yas;}
 public int birYasart(){return yas++;} 
 public void yasDegis(int x) { yas=x; }
 public String resitmi (){return (yas>=18)?"reşitsin":"reşit değisin";}
 public void  paraKazan(int p) { para+=p; }
 private String paramVarmi(float p) { return (para>=p)?"yeteri kadar param var":"yeteri kadar param yok"; }
 boolean paraVarMi(int p) { return (para>p)?true:false; }
 public float kacParamVar() { return  para; }
 public String adDegis(String x){ return isim=x;}   
public String engelDurumu(){return (engel==true)?"engelli":"sağlıklı";} 
public boolean engelliOl(){return engel=true;}
public boolean cinsNe(){return cinsiyet;}
public boolean cinsDegis(){return !(cinsiyet=true);}
public void paraHarca(int p){para=para-p;}
public boolean paraVermekİstermisin(){ return ((int)(1+Math.random()*9)>6);}
//public void borcVer(int p, insan i) {(paramVarmi(p)=true)?para-=p:i.paraKazan(p); }  burasını halledemedim =(
 
  
    
         
  
  }
    
    public static void main(String[] args) {
    insan ins =new insan("nes",12,634,true,false);
    insan ins2 =new insan("os",20,334,false,false);
     insan ins3 =new insan("dilo",22,134,true,false);
    System.out.println("isim="+" "+ins.adinNe());
     System.out.println("yaşın="+" "+ins.yasinKac());
   ins.adDegis("neslihan");
     System.out.println(ins.adinNe());   
     ins.yasDegis(24);
      System.out.println("yeni yaşın="+" "+ins.yasinKac());
     System.out.println(ins.paramVarmi(10));
     System.out.println(ins.resitmi());
     System.out.println(ins.engelDurumu());
    ins.engelliOl();
       System.out.println("yeni sağlık durumu"+ins.engelDurumu());
      System.out.println((ins.cinsNe()==true)?"kadın":"erkek");
      System.out.println( "yeni cinsiyet="+((ins.cinsDegis()==true)?"kadın":"erkek"));
      System.out.println((ins.paraVermekİstermisin()==true)?"canım para vermek istiyor mu: "+"evet":"canım para vermek istiyor mu :"+"hayır");
 ins2.paraKazan(50);
 System.out.println((int)ins2.kacParamVar()+" tl");
 //ins.borcVer(570, ins2);   
    }

   
    

}
