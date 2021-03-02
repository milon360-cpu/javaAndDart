
package JFrame_;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ChangeJFrameIcon extends JFrame      
{
    ChangeJFrameIcon()
    {
      setInfo();
    }
   public void setInfo()
    {
      ImageIcon icon = new ImageIcon(getClass().getResource("idea.png"));
      this.setIconImage(icon.getImage());
        
    }
    public static void main(String[] args)
    {
        ChangeJFrameIcon Ob = new ChangeJFrameIcon ();
        Ob.setVisible(true);
        Ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ob.setBounds(200,200,400,400);
        Ob.setTitle("Create Icon");
    }
}
