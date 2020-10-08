
package vizeoncesisonodev;

import java.util.ArrayList;

public class Vizeoncesisonodev {

    public static class insan{
    private String ad;
 private String dil;
    
   public insan(String a,String d ){this.ad=a;dil=d;}
    public void soyle(String x){System.out.println(x);}
      public void selamVer(insan i){;}

        private void selamVer(insan i,String dil) {this.selamVer(i, dil); ;}
             private final ArrayList<String> selam= new ArrayList(); {selam.add("privet");}
         
    
    }
    
    public static void main(String[] args) {
      insan can=new insan("can","türkçe");
      insan john=new insan("john","ingilizce");
      insan carine=new insan("carine","fransızca");
      insan yuliia=new insan("yuliia","rusça");
      insan pamela=new insan("pamela","almanca");
      insan baran=new insan("baran","kürtçe");
      insan jackie=new insan("jackie","çince");
      
    
     
        
    
         ArrayList<String> diller= new ArrayList();{
        diller.add("rusça");
        diller.add("kürtçe"); // selam.add("merhebba");// kürtçe
        diller.add("türkçe");//selam.add("merhaba");// türkçe 
        diller.add("almanca");//selam.add("hallo");//almanca
        diller.add("fransızca");// selam.add("bonjour");//fransızca
        diller.add("çince");     //selam.add("Nihao");//çince
        diller.add("ingilizce");}  // selam.add("hello");//ingilizce
         
    
     
        
 
   
 
            
        System.out.println(diller);    
                        
                        
                        
    }   
    } 
    

