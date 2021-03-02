
package oneFrameAnotherFrame;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class secondFrame extends JFrame
{
    secondFrame()
    {
        setInfo();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(20,20,400,400);
    }
    public void setInfo()
    {
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("Hey look at me,I'm second Frame");
        label.setBounds(90,40,300,20);
        c.add(label);
        
    }
    public static void main(String[] args) 
    {
        secondFrame frame = new secondFrame();
        frame.setVisible(true);
    }
}
