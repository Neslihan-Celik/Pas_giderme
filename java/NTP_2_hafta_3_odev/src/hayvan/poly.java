
package hayvan;

class hayvan {
    void beslenir(){System.out.println("Hayvanlar beslenirler !");}
}
class kopek extends hayvan {
    @Override
    void beslenir(){System.out.println("Köpek ürkünç bir hayvan kemik yer !");}
}
class kedi extends hayvan {
    @Override
    void beslenir(){System.out.println("Kedi sevimli bir hayvan ama midesiz fare yer !");}
}
class aslan extends hayvan {
    @Override
    void beslenir(){System.out.println("Aslanı Allah bildiği gibi yapsın katliam yapıyor !");}
}

public class poly {
    public static void main(String[] args) {
        hayvan hayvan=new hayvan();
        kopek lulu=new kopek();
        kedi lala=new kedi();
        aslan lili =new aslan();
        hayvan.beslenir();
        lulu.beslenir();
        lala.beslenir();
        lili.beslenir();
    }
    
}
