
package DialogWindow;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowDialogMsg
{
    public static void main(String[] args) 
    {      
         // 2 Peramiter
         //JOptionPane.showMessageDialog(null,"PLease Enter Your Name:\t");
        // 4 Peramiter
       // JOptionPane.showMessageDialog(null, "Please Enter Your Name", "Input Name", 3);
        // 5 Peraminter
        ImageIcon icon = new ImageIcon("happy1.png");
        JOptionPane.showMessageDialog(null,"Please Enter Your Name:\t","InoutName",-1,icon);
    }
}
