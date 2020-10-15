
package kalitim;

class Hayvan{
    void Beslenir(){System.out.println("Hayvanlar beslenir !\n");}
}

class Kopek extends Hayvan{
    void Havlar(){System.out.println("Köpekler  birer hayvandır ve onlar havlarlar !\n");}
}
class yavruKopek extends Kopek{
    void Aglar(){System.out.println("Yavru köpekler  birer köpektir ve onlar ağlarlar !\n");}
}
public class CokSeviyeliKalitim {
  
    public  static  void main(String[] args){
    yavruKopek altin=new yavruKopek();
    altin.Aglar();
    altin.Beslenir();
    }
}
