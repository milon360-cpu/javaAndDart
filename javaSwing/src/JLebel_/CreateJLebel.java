
package JLebel_;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateJLebel extends JFrame 
{
    CreateJLebel ()
    {
        setInfo();
    }
    public void setInfo()
    {
        Container c = new Container();
        c =this.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setBounds(50,20,150,50);
        c.add(label);
    }
    public static void main(String[] args)
    {
        CreateJLebel frame = new CreateJLebel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,400);
    }
}
