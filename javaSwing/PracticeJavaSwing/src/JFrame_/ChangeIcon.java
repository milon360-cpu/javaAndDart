
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ChangeIcon extends JFrame
{
    
    ChangeIcon()
    {
        setIcon_();
    }
    public void setIcon_()
    {
       ImageIcon icon = new ImageIcon(getClass().getResource(" "));
       this.setIconImage(icon.getImage());
       Container c = new Container();
       c.setBackground(Color.GRAY);
    }
    public static void main(String[] args)
    {
        ChangeIcon ob = new ChangeIcon();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100,100,400,400);
    }
}
