
package overridingbanka;


public class memurKredi extends bankaFaiz{
     @Override
     public double hesapYap(double anaPara){
        return anaPara*1.10;
}
     @Override
     public String hesapAd(){return "Memur Kredisi";}
     @Override
     public double YillikFaizOran(){return 1.10;}
}