
package textArea;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class textArea_ extends JFrame
{
    textArea_()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(20,20,400,400);
        this.setResizable(false);
        setInfo();
    }
    void setInfo()
    {
        Font font = new Font("Arial",Font.ITALIC,14);
        Container c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        JTextArea area = new JTextArea("write anythis if you want");
        area.setFont(font);
        area.setBounds(20,20,250,200);
        area.setBackground(Color.CYAN);
        area.setForeground(Color.gray);
       
        c.add(area);
        
    }
    public static void main(String[] args)
    {
        textArea_ frame = new textArea_();
        frame.setVisible(true);
    }
}
