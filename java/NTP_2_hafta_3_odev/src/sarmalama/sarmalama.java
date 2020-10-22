
package sarmalama;


public class sarmalama {
private String ad="" ;
private int yas=0;
private String idNumara ="";    

    public int getYas(){return yas;}
    public String getAd(){return ad;}
    public String getIdNumara(){return idNumara;}

    public void tanit(){System.out.println("\nSayın "+getAd()+"\nYaşınız : "+getYas()+"\nİd Numaranız : "+getIdNumara());}

    public void setAd(String ad) {this.ad = ad;}
    public void setYas(int yas) {this.yas = yas;}
    public void setIdNumara(String idNumara) { this.idNumara = idNumara;}
 
    public static void main(String[] args) {
        sarmalama s= new sarmalama();
        s.ad="Nes. ÇELİK";
        s.yas=24;
        s.idNumara="A12";
        s.tanit();
    }
    
}
