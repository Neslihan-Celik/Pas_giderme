
package overridingbanka;


public class tarimKredi extends bankaFaiz{
     @Override
     public double hesapYap(double anaPara){
        return anaPara*1.15;
}
     @Override
     public String hesapAd(){return "Tarım Kredisi";}
     @Override
     public double YillikFaizOran(){return 1.15;}
}