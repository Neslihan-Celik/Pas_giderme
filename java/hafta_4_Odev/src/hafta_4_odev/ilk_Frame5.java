
package hafta_4_odev;
import java.awt.*;
import javax.swing.*;
public class ilk_Frame5 {
    
     public static void main(String[] args) {
      JFrame f= new JFrame("Yonlu Butonlar");
     JButton b1=new JButton("kuzey");
     JButton b2=new JButton("Güney");
     JButton b3=new JButton("Doğu");
     JButton b4=new JButton("Batı ");
     JButton b5=new JButton("Merkez");
  
     
     f.add(b1, BorderLayout.NORTH);
     f.add(b2, BorderLayout.SOUTH);
     f.add(b3, BorderLayout.EAST);
     f.add(b4, BorderLayout.WEST);
     f.add(b5, BorderLayout.CENTER);
    
    
     f.setSize(300,350);
     f.setVisible(true);
    }
}
