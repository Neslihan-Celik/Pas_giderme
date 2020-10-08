

package sistem.kurtarma;
// canlı ders te arıadan sonra burAda devam ettimcanlı ders uygulsms 5 e
// burada da verilen cümlenin kelimelerini tersten ama cümle yapısını bozmadan yazdırdık ekrana


public class SistemKurtarma {

    public static void main(String[] args) {
      
     String cumle="bugün günlerden cuma ";
     String duz=cumle;
      String ters="";
      while(duz.length()>0){
      ters=" "+duz.substring(0,duz.indexOf(" "))+ters;
      duz=duz.substring(duz.indexOf(" ")+1);
      }
      
      System.out.println(ters);
           
    }
    
}
