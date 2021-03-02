
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class setImageJLabel extends JFrame
{
    setImageJLabel()
    {
        setInfo();
    }
    public void setInfo()
    {
        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        ImageIcon icon  = new ImageIcon(getClass().getResource("milon.png"));
        JLabel label = new JLabel(icon);
        label.setBounds(10,10,icon.getIconWidth(),icon.getIconWidth());
        c.add(label);
    }
    public static void main(String[] args) 
    {
        setImageJLabel frame = new setImageJLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,600);
        frame.setResizable(false);
    }
}
