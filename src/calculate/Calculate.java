
package calculate;


import Listrners.MyButtonListner;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.awt.BorderLayout;
import java.awt.*;
import static java.awt.Color.RED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;



public class Calculate {

//<editor-fold defaultstate="collapsed" desc="Переменные">
    double number;
    double number_2;
    String point;
    private MyJButton button_1;
    private MyJButton button_2;
    private MyJButton button_3;
    private MyJButton button_4;
    private MyJButton button_5;
    private MyJButton button_6;
    private MyJButton button_7;
    private MyJButton button_8;
    private MyJButton button_9;
    private MyJButton button_0;
    
    private MyJButton button_sum;
    private MyJButton button_min;
    private MyJButton button_del;
    private MyJButton button_umn;
    private MyJButton button_point;
    
    private MyJButton button_C;
    private MyJButton button_eq;
    private MyJButton button_sin;
    private MyJButton button_cos;
    private MyJButton button_ln;
             
    private MyJTextField Text_panel;
    
    private MyJPanel panel_1;
    private MyJPanel panel_2;
    private MyJPanel panel_4;
    
    private MyJFrame Frame;
    private String userName;
//</editor-fold>
 
    
    public static void main(String[] args) {
             
        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Calculate Calck = new Calculate();
        Calck.createButtons();
        Calck.createTextFields();
        Calck.createPanels();
        Calck.createFrame();
        
       
       
    }
    
//<editor-fold defaultstate="collapsed" desc="Функции создания">
    public void createButtons()
    {
        button_0 = new MyJButton("0", 5, 5);
        button_1 = new MyJButton("1", 5, 5);
        button_2 = new MyJButton("2", 5, 5);
        button_3 = new MyJButton("3", 5, 5);
        button_4 = new MyJButton("4", 5, 5);
        button_5 = new MyJButton("5", 5, 5);
        button_6 = new MyJButton("6", 5, 5);
        button_7 = new MyJButton("7", 5, 5);
        button_8 = new MyJButton("8", 5, 5);
        button_9 = new MyJButton("9", 5, 5);
        button_sin = new MyJButton("sin", 5, 5);
        button_cos = new MyJButton("cos", 5, 5);
        button_ln = new MyJButton("ln", 5, 5);
        
        button_sum = new MyJButton("+", 10, 10);
        button_sum.setBackground(Color.GRAY);
        button_min = new MyJButton("-", 10, 10);
        button_min.setBackground(Color.GRAY);
        button_del = new MyJButton("/", 10, 10);
        button_del.setBackground(Color.GRAY);
        button_umn = new MyJButton("x", 10, 10);
        button_umn.setBackground(Color.GRAY);
        button_eq = new MyJButton("=", 10, 10);
        button_eq.setBackground(Color.GRAY);
        
        
        button_point = new MyJButton(".", 5, 5);
        button_C = new MyJButton("C", 5, 5);
        addButtonLisners();
        
    }
    
    public void createTextFields()
    {
        Text_panel = new MyJTextField(14);
        
    }
    
    public void createPanels()
    {
        panel_1 = new MyJPanel(100, 100, Text_panel);
        panel_1.setPreferredSize(new Dimension(300,50));
                                                     
        panel_2 = new MyJPanel(100, 100, new GridLayout(5,3,3,3) );
        panel_2.setPreferredSize(new Dimension(250,300));
        panel_2.add(button_1);
        panel_2.add(button_2);
        panel_2.add(button_3);
        panel_2.add(button_4);
        panel_2.add(button_5);
        panel_2.add(button_6);
        panel_2.add(button_7);
        panel_2.add(button_8);
        panel_2.add(button_9);
        panel_2.add(button_C);
        panel_2.add(button_0);
        panel_2.add(button_point);
        panel_2.add(button_sin);
        panel_2.add(button_cos);
        panel_2.add(button_ln);
                
        panel_4 = new MyJPanel(10, 200, new GridLayout(5,1,3,3));
        panel_4.setPreferredSize(new Dimension(50,300));
        panel_4.add(button_sum);
        panel_4.add(button_min);
        panel_4.add(button_del);
        panel_4.add(button_umn);
        panel_4.add(button_eq);
    }
    
    public void createFrame()
    {
        userName = JOptionPane.showInputDialog("Как вас зовут?");
        JOptionPane.showMessageDialog(null, "Калькулятор запустил: " + userName);
        Frame = new MyJFrame("Калькулятор" + userName, 300, 400, new BorderLayout(5,5));
        
        Frame.getContentPane().add(panel_1, BorderLayout.NORTH);
        Frame.getContentPane().add(panel_2, BorderLayout.CENTER);
        Frame.getContentPane().add(panel_4, BorderLayout.EAST);
    }
//</editor-fold>
    
    public void addButtonLisners()
    {
        MyButtonListner b = new MyButtonListner();
        
        button_1.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_2.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_3.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_4.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_5.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_6.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_7.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_8.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_9.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_0.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_sum.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText("");
            point = "+";
        });
        button_min.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText("");
            point = "-";
        });
        button_del.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText("");
            point = "/";
        });
        button_umn.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText("");
            point = "*";
        });
        
        button_sin.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText(String.valueOf(Math.sin(number)));
        });
        button_cos.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText(String.valueOf(Math.cos(number)));
        });
        button_ln.addActionListener((ActionEvent e) -> {
            number = Double.parseDouble(Text_panel.getText());
            Text_panel.setText(String.valueOf(Math.log(number)));
        });
        button_point.addActionListener((ActionEvent e) -> {
            Text_panel.setText(Text_panel.getText()+e.getActionCommand());
        });
        button_C.addActionListener((ActionEvent e) -> {
            String str = Text_panel.getText();
            str = str.substring(0,str.length()-1);
            Text_panel.setText(str);
        });
        button_eq.addActionListener((ActionEvent e) -> {
            number_2 = Double.parseDouble(Text_panel.getText());
            Text_panel.setText(String.valueOf(operation(point, number, number_2)));
        });
        
    }
    
    public double operation(String point, double n1, double n2)
    {
        if("+".equals(point))
            return n1+n2;
        else if("-".equals(point))
            return n1-n2;
        else if("*".equals(point))
            return n1*n2;
        else if("/".equals(point))
            return n1/n2;
        return 0;
    }
}
