
package enflasyonuygulama;

import java.util.Scanner;


public class EnflasyonUygulama {

    
    public static void main(String[] args) {
 double artis=0;
        
        int sayac;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        int yil = input.nextInt();
        System.out.print("Fiyat  giriniz: ");
        float fiyat = input.nextInt();
        System.out.println("\tYil\t\tArtis\t\tFiyat");
        for (sayac=1; sayac<=18; sayac++) {
            artis = fiyat * 0.15;
            fiyat += artis;
            yil++;
            System.out.println("\t"+yil+"\t"+artis+"\t"+fiyat);
    }    }
    
}
