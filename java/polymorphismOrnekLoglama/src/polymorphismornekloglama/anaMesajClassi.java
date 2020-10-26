
package polymorphismornekloglama;

public class anaMesajClassi {
    public void mesaj(String mesaj){System.out.println("Ana class mesajı :"+mesaj);}

 public static void main(String[] args) {
       
       anaMesajClassi ana=new anaMesajClassi();
       ana.mesaj("Ana class");
       
    }
   } 