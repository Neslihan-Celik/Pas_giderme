
package odev_vize_oncesi;

import java.util.ArrayList;


public class Odev_vize_oncesi {
    
public static class insan{
  private   String ad;
  public String dil;
    public insan(String a,String x){this.ad=a;this.dil=x;}
    ArrayList<String>selam =new ArrayList();
    public void selamlama(String i){selam.add(i);}
    public void soyle(String x){System.out.println(x);}
       
}
    
    public static void main(String[] args) {
 
        insan can=new insan("can","türkçe");
        insan jhon=new insan("jhon","ingilizce");
        insan pamela=new insan("pamela","alamnca");
        insan Neslihan=new insan("Neslihan","türkçe-kürtçe");
        insan Yuliia=new insan("Yuliia","ukraynaca");
        insan jackie=new insan("jackie","çince");
        insan carine=new insan("carine","fransızca");
       
       
       can.selamlama("merhaba");
       Neslihan.selamlama("merhebba");
       jackie.selamlama("nihao");
       Yuliia.selamlama("Dobry den");
       carine.selamlama("bonjour");
       pamela.selamlama("hallo");
       jhon.selamlama("hello");
 
 
       System.out.println("can selam ver yuliaya "+Yuliia.selam);
       can.soyle("merhaba "+Yuliia.selam);
       carine.soyle("merhaba "+jackie.selam);
       Yuliia.soyle("merhaba "+pamela.selam);
       jackie.soyle("jackie'nin dili " +jackie.dil+" ama o arkadaşına "+carine.selam+" diyebilir");
       jackie.soyle("Yuliia'nın dili " +Yuliia.dil+" ama o arkadaşına "+jackie.selam+" diyebilir");
       Neslihan.soyle("Neslihan'ın dili  "+Neslihan.dil+" ama o arkadaşına "+Yuliia.selam+" diyebilir");
               }
    
}
