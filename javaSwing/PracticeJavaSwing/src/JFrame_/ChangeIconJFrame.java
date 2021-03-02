
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChangeIconJFrame extends JFrame
{
    ChangeIconJFrame()
    {
        setInfo();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,600);
        setResizable(false);
        
    }
    public void setInfo()
    {
      ImageIcon img = new ImageIcon(getClass().getResource("milon.png"));
      this.setIconImage(img.getImage());
      Container c = new Container();
      c = this.getContentPane();
      c.setBackground(Color.cyan);
      c.setLayout(null);
      
      
      ImageIcon img1 = new ImageIcon(getClass().getResource("milon.png"));
      JLabel label = new JLabel(img1);
      c.add(label);
      label.setBounds(5,5,img1.getIconHeight(),img1.getIconWidth());
    }
    public static void main(String[] args)
    {
        ChangeIconJFrame frame = new ChangeIconJFrame ();
        frame.setVisible(true);
    }
}
