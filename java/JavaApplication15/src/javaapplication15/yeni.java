
package javaapplication15;
import java.awt.*;
import javax.swing.*;


public class yeni {

    
    public static void main(String[] args) {
        JFrame f= new JFrame("frame");
f.setSize(500, 500);
f.setLocation(300, 200);
Container content =f.getContentPane();
content.setBackground(Color.blue);
content.add(new JButton("Merhaba bu benim javadaki ilk GUI çalışmam =)"));
f.setVisible(true);
    }
    
}
