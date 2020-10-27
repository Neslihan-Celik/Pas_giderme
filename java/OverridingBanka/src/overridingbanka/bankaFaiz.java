
package overridingbanka;


public class bankaFaiz {
    public double hesapYap(double anaPara){
        return  anaPara*1.15;
    }
    public String hesapAd(){return "Banka Faiz hesapları ";}
    public double YillikFaizOran(){return 1.15;}
}
