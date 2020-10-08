
import java.util.ArrayList;


public class Hafta_10_ödev {

  public static class Insan {
    private  String ad;
     private Insan arkadas;
public Insan(String a) { ad = a;}
public String adiniSoyle() { return ad; }
public void adDegis(String a) { ad = a;}
public Insan arkadasinKim() { return arkadas; }
public void arkadasOl(Insan ins) {
// KRİTİK METOD! Neden böyle oldu? Daha iyisi olabilir mi?
if (arkadas==null) arkadas=ins; // Eğer arkadaşım yoksa verileni arkadaşım yap
if (ins.arkadasinKim()==null) ins.arkadasOl(this); // Eğer verilenin arkadaşı yoksa onun arkadaşı ben olayım
}
public void arkadaslikBitir() {
if(arkadas.arkadasinKim()==this) arkadas.arkadaslikBitir();
arkadas = null; }
public boolean arkadasMisin(Insan ins) { return (arkadas==ins);}
  
  }


/*public class SosyalMedya {
ArrayList<Insan> insanlar = new ArrayList(); //Sosyal medya üyelerinin toplamasını tutuyor.
//Aşağıdaki diziler, sınıfın veritabanı. Ad ve soyadları bu dizilerden rastgele birleştirerek türetiyor.
String adlar[] = {"Kerem", "Can", "Filiz", "Funda", "Burak", "Berrin", "Ahmet", "Nur","Eray","Sinem"};
String soyadlar[] = {"Çirkin", "Yılmaz", "Çetin", "Uzun", "Şenoğlu", "Çiçek", "Kuzgun", "Yıldız", "Bektaş", "Bulut"};}
*/
  




 

public class ArrayList<Insan> tanismaYolu(Insan ins1, Insan ins2)
 {ArrayList<Insan> yol = new ArrayList();

//BURAYA NE KOD YAZILMALI Kİ ins1'in ins2'ye erişmek için hangi insan zincirine ihtiyaç duyduğunu üretsin? Metodun dönüş değerine dikkat edin.
//Örnek: Ali'den Veli'ye ulaşmak için, Ali'nin Zeynep, Zeynep'in Mesut... Can'ın Veli ile arkadaş olması senaryosuna göre;
String adlar[] = {"Kerem", "Can", "Filiz", "Funda", "Burak", "Berrin", "Ahmet", "Nur","Eray","Sinem"};
String soyadlar[] = {"Çirkin", "Yılmaz", "Çetin", "Uzun", "Şenoğlu", "Çiçek", "Kuzgun", "Yıldız", "Bektaş", "Bulut"};

public byte kacAdim(Insan ins1, Insan ins2) {
// ins1'den ins2'ye kaç adımda ulaşılabilir? Ulaşılamıyorsa -1 döndürmeli.
 int k=0;
/* bu metodu yazmak için önce düşünelim birinin diğeriyle tanışcağını düşünüyoruz ancak aralarında herhengi bir bağ yok
 kendi tanıştıkları kişiler aracılığıyla bu bağıntıyı kurmaya çalışıyoruz öyleyse biz diyeceğiz ki herhangi biri 
 üzerinden ilerle onun arkadaşı kim diye sorucaz tabi öncesinde parametre olarak kaynak kişi ve ulaşılacak kişiyi alıcaz 
 ardından kontrol edicez ulaşılacak kişi ile aynımı sonra tekrar sorucaz bu yeni kişiye senin arkadaşın kim diye 
 onuda kontrol edicez ulaşılacak kişimi diye bu işlem devam edicek ve her sorgu 
 adımı da sayılacak taki ulaşılacak kişiye ulaşana kadar
 */ 
       

 }



}
    public static void main(String[] args) {
  
    }
    
}
