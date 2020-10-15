
package kalitim;

class HAYVAN{
     String isim="";
    void Beslen(){System.out.println("\nHayvanlar beslenir !");}
}

class KOPEK extends HAYVAN{
    void Havla(String isim){System.out.println("\nKöpekler  birer hayvandır ve onlar havlarlar !\n"
                            +isim+": Hav hav havhaaavv havvv \n");}
}
class  KEDİ extends HAYVAN{
    void Miyavla(String isim){System.out.println("Kediler birer hayvandır ve onlar miyavlarlar !\n"
                                                  +isim+": Miyaaaavvvvv\n");}
}

public class Hiyearsik {
    
       public  static  void main(String[] args){
           KOPEK asil = new KOPEK();
           KEDİ prenses= new KEDİ();
           asil.Beslen();
           
           asil.Havla("Asil");
           prenses.Miyavla("Prenses");
}
}
