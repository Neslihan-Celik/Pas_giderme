
package Mutable;


public class mutable {
private String dersAdi="";
mutable(String dersAdi){
this.dersAdi=dersAdi;}
   
   
public String getAd(){return dersAdi;}
public void  setAd(String dersAdi){this.dersAdi= dersAdi;}


    public static void main(String[] args) {
    mutable a=new mutable("Makine öğrenmesi");
    System.out.println(a.getAd());
    a.setAd("Makine öğrenmesi uzmanları \n");
    System.out.println(a.getAd());
    
    }
    
}


    