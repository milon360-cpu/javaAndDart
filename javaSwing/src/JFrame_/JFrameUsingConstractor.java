
package JFrame_;

import javax.swing.JFrame;

public class JFrameUsingConstractor extends JFrame
{
    JFrameUsingConstractor()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);
        setTitle("First Making Title");
    }
    
    public static void main(String[] args)
    {
        JFrameUsingConstractor Ob = new JFrameUsingConstractor();
        
        Ob.setVisible(true);
    }
}
