
package overridingbanka;


public class OverridingBanka {


    public static void main(String[] args) {
        bankaFaiz[] faizHesaplari=new bankaFaiz[]{ new tarimKredi(), new memurKredi(),new ogrenciKredi()};
    
        for(bankaFaiz hesap:faizHesaplari){
   
        System.out.println("\nKredi türü : "+hesap.hesapAd()+
                           "\nYıllık faiz oranı : "+hesap.YillikFaizOran()+
                           "\nGirilen miktar için hesaplanan faiz : "+ hesap.hesapYap(100)+"\n");
    }
    
}}
        