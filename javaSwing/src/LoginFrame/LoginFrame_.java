
package LoginFrame;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame_ extends JFrame
{
    private JLabel email,password;
    private JTextField emailInput;
    private JPasswordField passwordInput;
    private Container c;
    private JButton clear,submit;
    LoginFrame_()
    {
        setInfo();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,400,400);
        this.setResizable(false);
    }
    void setInfo()
    {
        // Email or UserName
        Font font = new Font("Arial",Font.BOLD,18);
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        email = new JLabel("Email or Username:");
        email.setBounds(20,20,180,40);
        email.setFont(font);
        c.add(email);
        emailInput = new JTextField();
        emailInput.setBounds(200,29,160,25);     
        c.add(emailInput);
        
        //Password
        password = new JLabel("Password:");
        password.setBounds(20,70,180,40);
        password.setFont(font);
        c.add(password);
        passwordInput = new JPasswordField();
        passwordInput.setBounds(200,80,160,25);     
        c.add(passwordInput);
        
        // Clear Button
        clear = new JButton("Clear");
        clear.setBounds(200,120,80,30);
        c.add(clear);
        
        // Submit Button
        submit = new JButton("Submit");
        submit.setBounds(290,120,80,30);
        c.add(submit);
        
        //Acction Listener Clear Button
        clear.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e)
            {
                 emailInput.setText("");
                 passwordInput.setText("");
            }
        
        });
        //Acction Listener Submit Button
        submit.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e)
            {
                 String getEmail = emailInput.getText();
                 String getPassword = passwordInput.getText();
                 
                 if(getEmail.equals("heymilon@gmail.com") && getPassword.equals("Milon123"))
                 {
                     JOptionPane.showMessageDialog(null,"Congratulation Login Succesfully");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null,"Error!! Incorect Email or Password");
                 }
            }
        
        });
    }
    public static void main(String[] args) 
    {
        LoginFrame_ frame = new LoginFrame_();
        frame.setVisible(true);
    }
}
