

package canli.ders.uygulama.pkg4;


public class CanliDersUygulama4 {

    
    public static void main(String[] args) {
       
        
        String cumle ="bilgisayar bölümünde bazen mantıksız şeyler olur";/*birden fazla karakteri bir arada tuttan şey ve bir sınıftır 
NTP de string de bir varlıktır burada*/
       int bosluk=0;
       int seslisayac=0;
        for(int k=0;k<cumle.length();k++) 
          //  if(cumle.charAt(k)==' ') bosluk++;  
       bosluk+=(cumle.charAt(k)==' ')?1:0; /* ternary operator  javadaki kısa if yapısı çok
        eğlenceli bence bu yap ben bu yapıyı sevdim ama umarım unutmam ? sonrası if : dan sonrası
        ise else if oluyor  burada sorunun cevabına sayısal değer verip sayaçta 
        int tipinde toplama yaptık  bu yapı çok dah basit aslında*/
        bosluk++;
        
        String sesliler="aeıioöuüAEIİOÖUÜ";// Sesli harfleri buluyoruz şu an burada
        System.out.println("kelime sayısı:"+bosluk);
        int sesli=0;
        for(int i=0;i<cumle.length();i++)
         for(int k=0;k<sesliler.length();k++)       
             if(cumle.charAt(i)==sesliler.charAt(k)) seslisayac++;
        /* for(int i=0;i<cumle.length();i++){
             if(sesliler.contains(cumle.substring(i,1))) seslisayac++;}   // contains soru sorar bu yapı sen bunu içeriyormusun diye sorar  dönüş tipi  boolean
       // substring ise istenen değerden sonrasını istenen kadarını getiriyor*/
        System.out.println("sesli harfler"+seslisayac);
        // en çok tekrarlanan harf bulduğumuz kısım
        
        // cümlemiz buydu >> String cumle ="bilgisayar bölümünde bazen mantıksız şeyler olur";//97-122 arası
     
        
    }  
}
