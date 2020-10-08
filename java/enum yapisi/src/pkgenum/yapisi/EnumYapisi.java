
package pkgenum.yapisi;


public class EnumYapisi {
    
    public enum dil{
        türkçe,
        ingilizce,
        almanca;
    }
    
    public enum sehirler{
    
    istanbul("34","212","evet",10000,100,dil.ingilizce),
    adana("01","123","heyav",300,50,dil.türkçe),
    urfa("63","556","he",100,30,dil.almanca),
    tekirdağ("59","456","heye",377,12,dil.ingilizce),
    malatya("44","422","nasi",140,12,dil.türkçe),
    sivas("58","678","hi",230,55,dil.almanca),
    yozgat("66","987","ho",150,34,dil.türkçe);// sondakine noktalı virgül gelmek zorunda yoksa tüm sistemi bozar
    
    private final String trafikKod;
    private final String telefonKod;
    private final String evet;
    private final int nufus;
    private final int yuzolcum;
    private final dil yabanciDil;
    
    private sehirler(String p1,String t1,String e1,int n1,int y1,dil y2){
        this.trafikKod=p1;
        this.telefonKod=t1;
        this.evet=e1;
        this.nufus=n1;
        this.yuzolcum=y1;
        this.yabanciDil=y2;
        
    }
    public String trafikKoduNe(){return this.trafikKod;}  
     public String telefonKodNe(){return this.telefonKod;}
     public String evetDe(){return this.evet;}
     public int nufusKac(){return this.nufus;}
     public int yuzolcumKac(){return this.yuzolcum;}
     public double nufusYogunluk(){return (int)(this.nufus/this.yuzolcum);}
     public dil dilNe(){return this.yabanciDil;}
    }
/* yeni sınıf yapısı enum  düzenli seçenekler grubu c deki struct gibi
 sistematik bir şekilde veri tutup çekmek için kullanılabilir
    özel veri tipleri tanımlamammızı sağlar kendi 
    kütüphanemizi oluşturmamızı sağlar*/
    public static void main(String[] args) {
        System.out.println(sehirler.istanbul+"'da"+" "+sehirler.istanbul.evetDe()+" "+sehirler.istanbul.dilNe());
        
       for (int i=0;i<sehirler.values().length;i++)
     System.out.println(sehirler.values()[i]+" "
             +sehirler.values()[i].trafikKoduNe()+" "+"telefon kodu " +" "
             +sehirler.values()[i].telefonKod+" evet deme şekli:" +" "
             +sehirler.values()[i].evetDe()+" "+"nüfusu:"+
             +sehirler.values()[i].nufusKac()+" "+" yüzölçümü:"+" "+
             +sehirler.values()[i].yuzolcumKac()+" "+"nüfus yaoğunluğu"+" "+ 
             +sehirler.values()[i].nufusYogunluk()+" "+"konuşulan dil: "
             +sehirler.values()[i].dilNe());
    
       
        
    }
    
}
