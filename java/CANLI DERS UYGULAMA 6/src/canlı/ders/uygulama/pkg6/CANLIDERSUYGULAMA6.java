
package canlı.ders.uygulama.pkg6;

import java.util.ArrayList;// bu kütüphane olmak zorunda 


public class CANLIDERSUYGULAMA6 {

    public static void main(String[] args) {
      
        ArrayList<String>ad= new ArrayList();//liste oluşturduk uzunluğu bize bağlı
        
        ad.add("feyza");
        ad.add("isa");
        ad.add("nes");
        ad.add("can");
        ad.add("beyza");
        ad.add("cemil");
        
      for(int k =0; k<ad.size();k++)
        System.out.println(k+" daire sakini "+ad.get(k));
       /* for(String kiraci: ad)// yeni for yapısı 
         System.out.println(ad.indexOf(kiraci) + kiraci );*/
       System.out.println(" uzunluk = "+ad.size());
        ad.remove("beyza");
        
        System.out.println("taşınmadan sonra = ");
         for(String kiraci: ad)// yeni for yapısı 
         System.out.println(ad.indexOf(kiraci) + kiraci );
       System.out.println(" uzunluk = "+ad.size());
       
    }
    
}
