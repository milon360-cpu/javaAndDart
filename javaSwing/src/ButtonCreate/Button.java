
package ButtonCreate;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame
{
    Button()
    {
       setAll();
    }
    public void setAll()
    {
        Font font = new Font("Arial",Font.BOLD,14);
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        JButton button = new JButton("click me");
        button.setBounds(20,20,100,30);
        button.setCursor(cursor);
        button.setFont(font);
        button.setBackground(Color.GREEN);
        c.add(button);
    }
    public static void main(String[] args) 
    {
        Button frame = new Button();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,20,380,400);
        
    }
}
