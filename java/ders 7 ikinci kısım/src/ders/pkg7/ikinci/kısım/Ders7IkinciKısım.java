
package ders.pkg7.ikinci.kısım;

import java.util.ArrayList;




public class Ders7IkinciKısım {
public static class insan {
    private String ad="";
    private String tel="";
    private boolean cins=false;// false kadın true erkek
    private int boy=0;
    private int yas=0;
    private ArrayList<String> hobi= new ArrayList();
    
    public insan(String a){this.ad=a;}
    public void yasDegis(int x){this.yas=x;}// void geri dönüş değeri vermez
    public int yasinKac(){return this.yas;}// this bu ortamdaki olanları demek
    public void buyu(int x) {this.yas+=x;}/// setter cevap yok işlem yok yani bunlara da setter denir diğerlerine de getter debir
public void hobiKazan(String h){hobi.add(h);}
public String hobileriniSoyle(){
String h="";
for(String hob: hobi) h+=hob+"";
return h;
}

//poblic void hobiUnut(String h){hobi.remove(h); }
  public boolean severMisin(String h){ return (hobi.indexOf(h)==-1)?false:true;} 
public void soyle(String x){ System.out.println(x);}

public boolean sanaUygunmu(insan karsi){ 
int say=0;
    for(String h:hobi)
        if (karsi.severMisin(h))say++;
 //   return((say/hobi.size()) > 0,5)?true:false;
        

 }


  }
    
    public static void main(String[] args) {
    insan ali =new insan("ali");
    insan ceren =new insan("ceren");
    insan veli =new insan ("veli");
    
    ali.yasDegis(15);
    ceren.buyu(20);
    ali.hobiKazan("kitap okumak");
    ali.hobiKazan("keman dinlemek");
    ali.hobiKazan("yürüyüş yapmak");
      
       ali.hobiKazan("yürüyüş yapmak");
          ali.hobiKazan("yakın dövüş");
             ali.hobiKazan("voleybol ");
             
      ceren.hobiKazan("kitap okumak");
      ceren.hobiKazan("kod yazmak");
      ceren.hobiKazan("voleybol");
      
    System.out.println("alinin hobileri\n: "+ali.hobileriniSoyle());
      System.out.println("\ncerenin hobileri\n: "+ceren.hobileriniSoyle());
       // ali.hobiUnut("yürüyüş yapmak");
         System.out.println("alinin hobileri\n: "+ali.hobileriniSoyle());
         if(ali.severMisin("fotoğrafçılık"))ali.soyle("severim");else ali.soyle("sevmem");
         ceren.sanaUygunmu(ali);
           ali.sanaUygunmu(veli);
             System.out.println("ali ile velinin uyumu "+ali.sanaUygunmu(ali));
                System.out.println("ali ile cerenin uyumu "+ali.sanaUygunmu(ceren));
                       System.out.println("ali ile  veli uyumu "+ali.sanaUygunmu(veli));
    }
    
}
