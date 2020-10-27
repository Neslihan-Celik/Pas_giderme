
package overridingbanka;

public class ogrenciKredi extends bankaFaiz{
        @Override
        public double hesapYap(double anaPara){
        return  anaPara*1.05;
    }
        @Override
        public String hesapAd(){return "Öğrenci Kredisi";}
        @Override
        public double YillikFaizOran(){return 1.05;}
}
