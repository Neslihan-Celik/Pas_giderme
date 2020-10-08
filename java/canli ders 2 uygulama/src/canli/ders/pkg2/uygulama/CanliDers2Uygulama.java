
package canli.ders.pkg2.uygulama;


public class CanliDers2Uygulama {

  public static class insan{ 
String ad;
int yas;
int para;
boolean cins;//true = kadın ,false = erkek
 
public insan(){// yapılandırıcı fonksiyon 
ad="isimsiz";
yas=0;
para=0;
cins=true;
    
}  
public insan(String a, int y,boolean c){/*ikinci konstraktır (constractor ) sınıf için önemli 
    sınıfın nesne üretebilmesi için kullanılır 
    ve bir methottur nesnenin özellik ve ilk değerlerini verir*/
  ad=a;
  yas=y;
  cins=c;
  para=0;
  }

public insan (String a){
 ad=a;
  yas=0;
  cins=true;
  para=0;
}
public String adinisoyle(){return ad;}
public void buyu(){ yas++;}
public void paraKazan(int p){para+=p;}/*methotlarla ya bir şey alınır yada dışarı verilir bir işi için tabir yerindeyse el kol üretilirmethotlar ikiye ayrılır getter değer almak içinkullanılır setter ise nesnede değşiklik yapmak için kullanılırvoid setter dir getterise String olanlardır */
private boolean paramVarmi(int p){ return (para>=p);}/*boolean verdik çünkü evet ve ya hayır diye cevap alacağız ve bu methot getter dir*/
// burası private çünkü dışarı ya bilgi vermek istemiyoruz  bu gizli bir bilgi
public int kacParanVar(){return para;}
public void paraVer(int p,insan i){if (paramVarmi(p)) para-=p; /* p yi alıp kendi paramızla karşılaştırıpona göre  işlem başlatacağız bu yüzden de if kullandık*/ 
// burada yeni bir varlik oluşturduk ve insana para kzandırdık 
i.paraKazan(p);// gizli sahiplik denir buna yani methot aslında buna da sahip olmuş oluyor 
}

  }
          
    public static void main(String[] args) {/*burası perdenin önü yani ekran
        buranın yukarısı ise arkasında yaptığımız sahne arkası*/
        
      insan v1=new insan("ahmet ",17,false);
     insan v2=new insan("yesim ",25,true);  
     
     
        System.out.println(v1.adinisoyle());
       System.out.println(v1.adinisoyle()+"para miktarı"+v1.kacParanVar());
       System.out.println(v1.adinisoyle()+"para miktarı"+v2.kacParanVar());
       v1.paraKazan(500);
        v2.paraKazan(234);
         System.out.println(v1.adinisoyle()+"para miktarı"+v1.kacParanVar());
       System.out.println(v1.adinisoyle()+"para miktarı"+v2.kacParanVar());
    }
    
}
