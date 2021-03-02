
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLable extends JFrame
{
    private Container c;
    private JLabel label;
    JLable()
    {
        setJLabel_();
    }
  
    public void setJLabel_()
    {
        
        c = new Container();
        c = this.getContentPane();
        label = new JLabel();
        c.setLayout(null);
        Font font = new Font("Arial",Font.BOLD,15);
        label.setOpaque(true);
        label.setFont(font);
        label.setForeground(Color.red);
        label.setText("Please Enter Your Name:\t");
        label.setBounds(100,100,250,50);
        label.setBackground(Color.yellow);
        c.add(label);
      
    }
    public static void main(String[] args)
    {
        JLable frame = new JLable();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(200,200,400,400);
    }
}
