
package JTexrFild_;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CreateJLabelTextFild extends JFrame
{
    CreateJLabelTextFild()
    {
        setInfo();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,100,400,400);
       setResizable(false);
        
    }
    public void setInfo()
    {
        Container c = new Container();
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        Font font = new Font("Arial",Font.BOLD,18);
        
        JTextField field  = new JTextField("Input Your name");
        field.setBounds(20,20,200,50);
        field.setFont(font);
        field.setBackground(Color.GRAY);
        field.setForeground(Color.WHITE);
        c.add(field);
        
        JTextField field1  = new JTextField();
        field1.setText("Enter Password");
        field1.setBounds(20,90,200,50);
        field1.setBackground(Color.CYAN);
        field1.setForeground(Color.BLACK);
        field1.setFont(font);
        c.add(field1);

    }
    public static void main(String[] args) 
    {
        CreateJLabelTextFild  frame = new CreateJLabelTextFild ();
        frame.setVisible(true);
    }
}
