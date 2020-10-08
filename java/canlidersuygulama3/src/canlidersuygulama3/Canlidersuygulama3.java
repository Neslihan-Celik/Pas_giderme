

package canlidersuygulama3;

import java.util.Scanner;

public class Canlidersuygulama3 {
   
    public static void main(String[] args) {
  /*int yas=20;
String resit="";
  
  resit=(yas>=18)?"resit":"resit degil";
  System.out.println(resit);
  
  
  String ad="tuna";
  boolean cins=true;
  int borc=500;
  
  System.out.println(((cins)?"bay":"bayan")+ad+((borc>0)?"borcunuz"+borc+"tl":"tesekkur"));
  
    String ad="ayse";
  boolean cins=false;
  int borc=300;
  
  System.out.println(((cins)?"bay ":"bayan ")+ad +((borc>0)?" borcunuz "+borc+"tl":"tesekkur"));
  
 
  random sayı ürettik ve birim çevirdik aşağıda
  
  System.out.println((int)Math.random()*100);// random 0 ile 10 arasında bir sayı verir
  

  */
  
 /*burada string içerisindeki komutlarla verilen yazıdaki her harfin 
 indis numarasına göre harfleri alıp onları bir yere kayedp sonrasında yazıyı tersten yazdırıyoruz 
 lenght yazıdaki her harfin indisini koparıp getirir karakter sayısını kopartır gertirir 
  indisler sıfırdan başlar o yüzden (-1)eksi birden başlattık
   charat da karakteri toplar getirir ve biz bu sayede yzıyı sondan yazabildik yani tersten
     String yazi;
     yazi="bugün hava güzel";
     String xyazi=" ";
    System.out.println("yazının uzunluğu "+yazi.length()+" karakterdir");
for(int i=yazi.length()-1;i>=0;i--)xyazi+=yazi.charAt(i);
 
       System.out.println(xyazi);
    

 for(int k=0;k<yazi.length();k++)xyazi+=yazi.charAt(yazi.length()-k-1);//eğer sadece k yazarsak yazıyı aynen yazaıcak
  
      System.out.println(xyazi);*/
 Scanner input = new Scanner(System.in);


    String cumle,harf;


    int harfSayisi = 0;


    


    System.out.println("Bir cümle giriniz: ");

 
 cumle = input.nextLine();


    


    System.out.println("Bir harf giriniz: ");


    harf = input.next();


    


    for(int i = 0; i < cumle.length() - 1;i++)


    {    


        if(cumle.substring(i,i+1).equals(harf))


            harfSayisi++;


    }


     System.out.println(harf + " harfi " + harfSayisi + " defa tekrar etmiştir.");
 
}

}








