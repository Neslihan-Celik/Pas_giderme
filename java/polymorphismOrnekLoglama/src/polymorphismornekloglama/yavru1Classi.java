
package polymorphismornekloglama;


public class yavru1Classi extends anaMesajClassi{
    @Override
    public void mesaj(String mesaj){System.out.println("Yavru 1 mesajı :"+mesaj);}
    public static void main(String[] args) {
     
      yavru1Classi yavru1=new yavru1Classi();
      yavru1.mesaj("Yavru 1 ");     
       
    }
}
