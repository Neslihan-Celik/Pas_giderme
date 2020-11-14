
package hafta_4_odev;
import java.awt.*;
import javax.swing.*;
public class ilk_Frame7 {
    
     public static void main(String[] args) {
      JFrame f= new JFrame("Resim Sayfasi");
      ImageIcon img =new ImageIcon("C:\\Users\\Sbpc\\Desktop\\hafta_4_neslihan_celik_190111002_ntp_odev\\kitaplar.jpg");
      JScrollPane imgl=new JScrollPane(new JLabel(img));
      
      f.getContentPane().add(imgl);
      f.setSize(400,400);
      f.setLocation(500,400);
      f.setVisible(true);
    }
}
