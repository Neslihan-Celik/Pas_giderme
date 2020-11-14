
package hafta_4_odev;
import java.awt.*;
import javax.swing.*;
public class ilk_Frame2 {
    
     public static void main(String[] args) {
      JFrame f= new JFrame("İlk Frame");
      f.setSize(500,500);
      f.setLocation(500,350);
      Container content =f.getContentPane();
      content.setBackground(Color.blue);
      content.add(new JButton("Merhabalar Bu bir buton =)"));
      f.setVisible(true);
    }
}
