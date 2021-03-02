
package JFrame_;

import javax.swing.JFrame;

public class Part_1
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400,400);
//        frame.setLocationRelativeTo(null);
    
//          frame.setLocation(400,300);

        frame.setBounds(400, 200, 400, 400);
        frame.setTitle("First Freme Creating");
        frame.setResizable(false);
        
    }
}
