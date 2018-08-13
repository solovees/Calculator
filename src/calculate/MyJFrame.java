

package calculate;

import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyJFrame extends JFrame{
    MyJFrame (String name, int width, int height, LayoutManager layout)
    {
        super(name);
        super.setSize(width, height);
        super.setLayout(layout);
        super.setVisible(true);   
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);

        super.setIconImage(new ImageIcon("C:\\Users\\Владелец\\Documents\\NetBeansProjects\\Calculate\\calculator-512.png").getImage());
    }

}
