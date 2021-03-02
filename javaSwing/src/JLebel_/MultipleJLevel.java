
package JLebel_;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MultipleJLevel extends JFrame
{
    private JLabel label1,label2;
    private Container c;
    MultipleJLevel()
    {
        setInfo();
    }
    public void setInfo()
    {
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        label1 = new JLabel("PLease Enter Your Name:\t");
        c.add(label1);
        label1.setBounds(20,20,150,50);
        label2 = new JLabel("PLease Enter Your Password:\t");
        c.add(label2);
        label2.setBounds(20,65,200,50);
        
    }
    public static void main(String[] args)
    {
        MultipleJLevel frame = new MultipleJLevel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,400);
    }
}
