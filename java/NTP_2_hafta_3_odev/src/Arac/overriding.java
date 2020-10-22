
package Arac;


class Arac{
void calistir(){System.out.println("Araç çalışıyor !");}
}

class bisiklet extends Arac{
@Override
void calistir(){System.out.println("Bisiklet bir araç nesnesidir ana sınıftan türemiştir !\n");}
}
public class overriding {

    
    public static void main(String[] args) {
        Arac a=new Arac();
        a.calistir();
        bisiklet b=new bisiklet();
        b.calistir();
        
    }
    
}
