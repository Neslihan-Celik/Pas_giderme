
package viseoncesi.uygulama;


public class ViseoncesiUygulama {

    public class insan{
    private String ad;
    private int yas;
    private insan arkadas;
     public insan(String a)
     {
         this.ad=a ;yas=0;
     }
             
     private boolean istiyorMusun(){ return ((int)(Math.random()*5))>2?true:false;}
     public String adinNe(){return (istiyorMusun()?ad:"sana ne");}
     public void soyle(String x){ System.out.println(x);}
      public int yasinNe(){return yas;}  
      public int yasDegis(int x){return yas+=x;}
      public void soyle(int x){yas+=x;}
      public void arkadasOl(insan x){arkadas=x;}
      public boolean arkadasinVarmi(){return (arkadas!=null)?true:false;}
    }
   
    public static void main(String[] args) {
   insan ali=new insan("ali");
    }
    
}
