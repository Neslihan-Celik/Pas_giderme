
package mukemmelsayibulma;


public class MukemmelSayiBulma {

    
    public static void main(String[] args) {
      int sayi=15;
      int mukemmel=0;
      
      for(int x=1;x<sayi;x++){
          if (sayi%x==0)
             mukemmel=mukemmel+x; 
      }
      if(mukemmel==sayi)
          System.out.print("sayı mükemmel sayıdır !");
      else
            System.out.print("sayı mükemmel sayı değildir !");
    }
    
}
