
package canlı.ders.uygulama.pkg5;


public class CanlıDersUygulama5 {

   
    public static void main(String[] args) {
             /* String cumle="bugün günlerden cuma";
 System.out.println(cumle.substring(2 ,016));
       for(int i=0;i<=cumle.length();i++)
         System.out.println(cumle.substring(0, i));*//* substring belirlweenen indisten itibaren cümleden 
o kadar şey kopartır getirir ve burada döngü içerisinde bütün kelimenin üçgenini oluştuurduk*/
             

/*for(int i=cumle.length();i>=0;i--)     // burada  cümleyi tersten yazdık
         System.out.println(cumle.substring(0, i));

         for(int i=cumle.length();i>=0;i--)    // farklı bir yapıda tekrar düz yadık ve taekrar ettirdik yazdık 
         System.out.println(cumle.substring(0, cumle.length()-i));*/

         // String cumle="bugün günlerden cuma şifreli uygulama her harf kendinden üç harf sonrasını yazıcak
      /*   String sifreli="";
         
         for(int k=0;k<cumle.length();k++)
             sifreli+=((char)(cumle.charAt(k)+2));
         System.out.println(sifreli);
         //buradan sonra büyük harfleri küçük büyük harfleride büyük yapıcaz
         // A dan Z ye 65-90 a-z ye 97-122 sıraları
        char harf;
         String negatif="";*/
     
    /*  for(int k=0;k<cumle.length();k++) 
     {    harf =cumle.charAt(k);
    { if((cumle.charAt(k)>=65)||(cumle.charAt(k)<=90))
           negatif+=(char)(cumle.charAt(k)+32);
     else
           negatif+=(char)(cumle.charAt(k)-32);
           System.out.println(negatif);}   // burayı yapamdım ama ekran fotosu çektim bak oraya
   //  if(harf>=65&& harf<=90)?(char)
           //System.out.println(negatif);*/
    
     String cumle="bugün günlerden cuma";
     String duz=cumle;
      String ters="";
      while(duz.length()>0){
      ters=duz.substring(0,duz.indexOf(" "))+ters;
      
      }
      
      System.out.println(ters);
           
           
    
    }
    
}







