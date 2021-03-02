
package JFrame_;

import javax.swing.JFrame;

public class CrearteJFrame 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setBounds(200,200,400,400);
        
    }
}
