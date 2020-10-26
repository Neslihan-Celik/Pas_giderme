
package polymorphismornekloglama;


public class yavru2Classi extends anaMesajClassi
{
    @Override
    public void mesaj(String mesaj){System.out.println("Yavru 2 mesajı :"+mesaj);}
     public static void main(String[] args) {
      yavru2Classi yavru2=new yavru2Classi();
      yavru2.mesaj("Yavru 2 ");
              
       
    }
    
}
