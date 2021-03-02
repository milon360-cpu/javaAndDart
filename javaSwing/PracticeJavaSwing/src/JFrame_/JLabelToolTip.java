
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelToolTip extends JFrame
{
    JLabelToolTip ()
    {
        setInfo();
    }
    public void setInfo()
    {
        Container c = new Container(); 
        c = getContentPane();
         c.setLayout(null);
        JLabel label  = new JLabel();
        label.setText("Please Enter Your Name");
       
        label.setBounds(20,20,250,20);
        c.add(label);
        label.setOpaque(true);
        label.setBackground(Color.yellow);
        label.setToolTipText("MMT");
        System.out.println(""+label.getToolTipText());
        System.out.println(""+label.getText());
    }
    public static void main(String[] args)
    {
        JLabelToolTip frame = new JLabelToolTip();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,400,400);
    }
}
