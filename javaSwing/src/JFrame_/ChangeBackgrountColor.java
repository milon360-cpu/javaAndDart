
package JFrame_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ChangeBackgrountColor extends JFrame
{
    ChangeBackgrountColor()
    {
        setCOlor();
    }
    void  setCOlor()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("idea.png"));
        this.setIconImage(icon.getImage());
        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.gray);
    }
    public static void main(String[] args) 
    {
        ChangeBackgrountColor Ob = new ChangeBackgrountColor();
        Ob.setVisible(true);
        Ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ob.setBounds(200,200,300,300);
        Ob.setTitle("Change BacGround COlor");
    }
}
