

package cümle.çözümleme.odev.ve.ders.uygulama;

import java.util.Scanner;
import java.util.HashMap;

public class CümleÇözümlemeOdevVeDersUygulama {

   
    public static void main(String[] args) {
 
 /* 
        ilk önce yazıyı dışardan almamızı istediğinizi sandım o yüzden burası böyle kaldı  


int sayac=0;
int sayacx=0;
String metin;
String sesliler="aeıioöuü";
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen metni giriniz ");
metin = scan.nextLine();


 
for(int i = 0 ; i<=metin.length()-1;i++)
{ 
   for(int j= 0 ; j<=metin.length()-1;j++)
  {
   if(metin.charAt(i)==sesliler.charAt(j))
    {
      sayac++;
      System.out.println("sesli="+sesliler.charAt(j));

    }
  }
}

   for (int x=0;x<=metin.length()-1;x++)
   {
      if(metin.charAt(x)==' ')
      {
      sayacx++;
      }
   }


System.out.println("sesli harf  sayisi" + sayac);
System.out.println("sessiz harf sayisi:" +( metin.length()-sayac));
System.out.println("tüm cümledeki harf sayisi:" +( metin.length()-sayacx));
System.out.println("cümledeki kelime sayisi:" + sayac+1); 
 */
      /*ağlaclar ve, de, da, ki, ile 
  
  HashMap<String > baglaclar = new HashMap <String >();
  baglaclar.put("ve");
  baglaclar.put("de");
  baglaclar.put("da");
  baglaclar.put("ile");
  baglaclar.put("ki");*/
      
 int sayacz=0; 
 int sayac=0;
int sayacx=0;
String baglaclar;
 baglaclar= " ve de da ki ile ";
 String metin;
metin="bugün hava güzel değil  ve çok soğuk";
String sesliler="aeıioöuü";
 
 
 
 for(int i = 0 ; i<=metin.length()-1;i++)
{ 
   for(int j= 0 ; j<=7;j++)
  {
   if(metin.charAt(i)==sesliler.charAt(j))
    {
      sayac++;
      System.out.println("sesli="+sesliler.charAt(j));

    }
  }
}

 for(int i = 0 ; i<=metin.length()-1;i++)
{ 
   for(int j= 0 ; j<=metin.length()-1;j++)
  {
   if(metin.charAt(i)== baglaclar.indexOf(j))
    {
      sayacz++;
      System.out.println("bağlaclar:"+baglaclar.indexOf(j));

    }
  }
}

 
   for (int x=0;x<=metin.length()-1;x++)
   {
      if(metin.charAt(x)==' ')
      {
      sayacx++;
      }
   }


System.out.println("sesli harf  sayisi" + sayac);
System.out.println("sessiz harf sayisi:" +( metin.length()-sayac));
System.out.println("tüm cümledeki harf sayisi:" +( metin.length()-sayacx));
System.out.println("cümledeki kelime sayisi:"+( sayacx +1)); 
System.out.println("bağlaclar:"+(baglaclar.indexOf(sayacz)));
 
 
 
 
 
 
 
    }
}
