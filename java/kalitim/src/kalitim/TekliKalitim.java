
package kalitim;

class hayvan{
    void beslenir(){System.out.println("Hayvanlar beslenir !");}
}

class kopek extends hayvan{
    void havlar(){System.out.println("köpekler  birer hayvandır ve onlar havlarlar !");}
}
public class TekliKalitim {
    
    public  static  void main(String[] args){
    kopek kangal=new kopek();
    kangal.beslenir();
    kangal.havlar();
    }
}