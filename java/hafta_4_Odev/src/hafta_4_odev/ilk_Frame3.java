
package hafta_4_odev;
import java.awt.*;
import javax.swing.*;
public class ilk_Frame3 {
    
     public static void main(String[] args) {
      JFrame f= new JFrame("İlk Frame");
      f.setSize(500,500);
      f.setLocation(500,400);
      Container content =f.getContentPane();
      content.add(new JTextField("Merhabalar bu benim sayfam =)"));
      f.setVisible(true);
    }
}
