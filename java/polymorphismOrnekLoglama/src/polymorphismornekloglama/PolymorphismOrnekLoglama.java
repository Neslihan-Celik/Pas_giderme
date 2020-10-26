
package polymorphismornekloglama;


public class PolymorphismOrnekLoglama {
    
   
    public static void main(String[] args) {
        anaMesajClassi[] anamesaj =new anaMesajClassi[]{new anaMesajClassi(), new yavru1Classi() , new yavru2Classi()};
      
    for(anaMesajClassi mesaj:anamesaj){
   
        mesaj.mesaj("Log mesajı ");
    }
  
       
    }
    
}
