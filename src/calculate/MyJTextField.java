

package calculate;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class MyJTextField extends JTextField {
    MyJTextField( int colums)
    {
        super.setColumns(colums);
        Font font = new Font("cursor",Font.ITALIC, 22);
        super.setFont(font);
        super.setForeground(Color.WHITE);
        super.setHorizontalAlignment(MyJTextField.RIGHT);
        
        
    }
    

}
