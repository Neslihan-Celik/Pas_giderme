
package geometrikSekil;

class geometriksekil{
    void cizim(){System.out.println("GEOMETRİK ÇİZİM ...");}
}

class dikdortgen extends geometriksekil{
    @Override
    void cizim(){System.out.println("DİKDÖRTGEN ÇİZİM ...");}
}

class daire extends geometriksekil{
    @Override
    void cizim(){System.out.println("DAİRE ÇİZİM ...");}
}

class ucgen extends geometriksekil{
    @Override
    void cizim(){System.out.println("ÜÇGEN ÇİZİM ...");}
}

public class polymorphism {
    public static void main(String[] args) {
 geometriksekil g =new geometriksekil();
 dikdortgen d =new dikdortgen();
 daire o =new daire();
 ucgen u=new ucgen();
 g.cizim();
 d.cizim();
 o.cizim();
 u.cizim();
 
    }
    
}
