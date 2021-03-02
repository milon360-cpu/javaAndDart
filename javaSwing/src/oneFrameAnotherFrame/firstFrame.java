
package oneFrameAnotherFrame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class firstFrame extends JFrame
{
    firstFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,400);
        setInfo();
    }
    void setInfo()
    {
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("I'm first Frame");
        label.setBounds(20,20,200,50);
        c.add(label);
        JButton button = new JButton();
        button.setText("click me");
        button.setBounds(20,80,100,50);
        c.add(button);
        
        button.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e)
        {
//            dispose();
            secondFrame frame = new secondFrame();
            frame.setVisible(true);
          
        }   
        });
        
        
    }
    public static void main(String[] args) 
    {
        firstFrame frame_ = new firstFrame();
        frame_.setVisible(true);
    }
}
