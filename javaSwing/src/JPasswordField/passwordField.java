
package JPasswordField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class passwordField extends JFrame     
{
    passwordField()
    {
        setInfo();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
    }
    void setInfo()
    {
         Font font = new Font("Cambria",Font.BOLD,20);
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel();
        label.setText("Please Enter Your Password");
        label.setBounds(20,20,200,20);
        c.add(label);
        JPasswordField password = new JPasswordField();
        password.setBounds(20,45,180,25);
        password.setHorizontalAlignment(JPasswordField.RIGHT);
        JButton button = new JButton();    
        button.setBounds(20,75,120,30);
        button.setForeground(Color.white);
        button.setBackground(Color.gray);
        button.setFont(font);
         password.setEchoChar('?');
        button.setText("Click me");
       
        password.setFont(font);
        password.setForeground(Color.blue);
        c.add(button);
        c.add(password);
    }
    
    public static void main(String[] args) 
    {
        passwordField frame = new passwordField();
        frame.setVisible(true);
    }

    
}
