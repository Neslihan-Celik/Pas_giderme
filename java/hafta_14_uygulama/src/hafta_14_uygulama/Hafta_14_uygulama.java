
package hafta_14_uygulama;

import java.util.ArrayList;


public class Hafta_14_uygulama {
    
  public enum isimler{
  Emre,
  Oya,
  Anıl,
  Sefa,
  Arda,
  Mehmet,
  Özge,
  Nur,
  Yunus,
  Yusuf,
  Gökay;
  }
    
    public enum hobiler{
      tiyatro,
      dağcılık,
      yüzme,
      tenis,
      fotoğrafçılık;
    }
    
    public static class sosyalAg{
 ArrayList<insan>insanlar=new ArrayList();
       public sosyalAg(){}
       public sosyalAg(int sayi){
           int yer;
           String isim;
        for(int i=0;i<sayi;i++){
            yer=(int)(Math.random()*isimler.values().length);
            isim=isimler.values()[yer].toString();
           insanlar.add(new insan(isim));
        }
       for(int i=0;i<insanlar.size();i++)
           insanlar.get(i).rastgeleHobiKazan(3); 
        }
       public void hobiListele(){
       for(insan ins:insanlar)
           ins.hobiSoyle();
       }
      public insan arkadasOner(){
    return insanlar.get((int)(Math.random()*insanlar.size()));
      } 
     }
    public static class insan{
    String ad;
    ArrayList<hobiler> hobi= new ArrayList();
    Arraylist<insan> arkadaslar =new Arraylist();
    
    
    public insan(String a){this.ad=a; }
    public void hobiKazan(hobiler h){ if(!hobi.contains(h))hobi.add(h);}
  
    public void rastgeleHobiKazan(){
      int yer=(int)(Math.random()*hobiler.values().length);
      hobiKazan(hobiler.values()[yer]); 
    }
    public void rastgeleHobiKazan(int sayi){
        if(sayi<=hobiler.values().length)
          for(int i=0;i<sayi;i++)
            rastgeleHobiKazan();
        }
   
    public String kim(){return ad;}
    
    public void hobiSoyle(){
        System.out.println((kim()+" dedi ki benim hobilerim şunlardır; ").toUpperCase());
        for(hobiler h:hobi)
        System.out.println(h);
        System.out.println("---------------------------------------");
        }
    
    public ArrayList<hobiler>hobiGetir(){return hobi; }
    
    public void arkadasEkle(insan ins){
     if((!arkadaslar.contains(ins)&&(ins!this))
        arkadaslar.add(ins);
    }
    public void arkadasEkle(int adet){
        insan a;
        a= arkadasEkle(sosyalAg.arkadasOner());  
        if((a!=this)&&(arkadasMisin(a)))
        
    }
    
    public boolean arkadasMisin(insan ins){
        return arkadaslar.contains(ad);
        }
   
  }
    
    
    
    
    public static void main(String[] args) {
      
        sosyalAg bilisimciler =new sosyalAg(4);
        bilisimciler.hobiListele();
    }
    
}
