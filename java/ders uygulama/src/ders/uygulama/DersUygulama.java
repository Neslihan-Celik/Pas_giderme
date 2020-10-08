
package ders.uygulama;


public class DersUygulama {

   public static class insan {
       private String ad;
       private int para;
       
    public insan() {
    ad="isimsiz";
    para=0;
    
    }
    
    public insan(String isim,int money){
        ad=isim;
        para=money;
    }
    public boolean paramVarmi(int p){return(para>=p); }
    public void paraAl(int p){ para+=p;}
    public void paraVer(int p,insan i){
        if(paramVarmi(p)){
        para-=p;
        i.paraAl(p);
        }
        }
    public int kacParanVar(){return para;
    
    }
}
   
    public static void main(String[] args) {
       
      insan baba=new insan("kemal",234);
  insan cocuk=new insan("ayse",123);
  System.out.println("babanın parası="+baba.kacParanVar());
   System.out.println("cocuğun parası="+cocuk.kacParanVar());
      baba.paraVer(100,cocuk);
      System.out.println("babanın parası="+baba.kacParanVar());
   System.out.println("cocuğun parası="+cocuk.kacParanVar());
  cocuk.paraVer(1,baba);
  System.out.println("babanın parası="+baba.kacParanVar());
   System.out.println("cocuğun parası="+cocuk.kacParanVar());
}
}






