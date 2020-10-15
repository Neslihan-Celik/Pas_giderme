
package kalitim;


class Calisan {
int maas=4000;
}
public class programci extends Calisan{

    int ikramiye=1000;
    String isim="";
    
    public static void main(String[] args) {
        programci p=new programci();
        p.isim="Nes";
        System.out.println("Programcının ismi :"+p.isim+"\nProgramcının maaşı :"+p.maas+"\nProgramcının ikramiyesi :"+p.ikramiye);
    }
    
}
