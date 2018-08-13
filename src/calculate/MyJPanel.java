

package calculate;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{
    public JPanel grid;
    MyJPanel (int width, int height, Component comp)
    {
        super.setSize(width, height);
        super.add(comp);// добавляет компонент
        super.setBorder(BorderFactory.createEtchedBorder()); // добавляет границу к панели
    }
    MyJPanel (int width, int height)
    {
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder()); // добавляет границу к панели
        grid = new JPanel(new GridLayout(3, 3, 5, 0) );
    }
    MyJPanel (int width, int height, LayoutManager layout)
    {
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder()); // добавляет границу к панели
        super.setLayout(layout);
    }
    

}
