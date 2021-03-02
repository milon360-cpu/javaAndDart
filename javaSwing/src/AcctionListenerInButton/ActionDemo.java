
package AcctionListenerInButton;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionDemo extends JFrame
{
    ActionDemo()
    {
        setInfo();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,400,400);
    }
    public void setInfo()
    {
        Container c = new Container();
        c = this.getContentPane();    
        c.setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20,20,200,30);
        c.add(field);
        JButton button = new JButton();
        button.setText("Clear");
        button.setBounds(223,20,80,30);
        c.add(button);
        
     button.addActionListener(new ActionListener(){
     
     @Override
     public void actionPerformed(ActionEvent e)
     {
         field.setText("");
     }
     
     } );
    }
    public static void main(String[] args) 
    {
        ActionDemo frame = new ActionDemo();
        frame.setVisible(true);
    }
}
