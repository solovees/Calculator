

package calculate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class MyJButton extends JButton{

    MyJButton(String text, int width, int height )
    {
        super.setText(text);
        
        super.setSize(width,height);
        Font font = new Font("cursor",Font.BOLD, 18);
        super.setFont(font);
        super.setBorder(new LineBorder(Color.LIGHT_GRAY, 8));
        super.setActionCommand(text);
    }

}
