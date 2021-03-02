
package Dialog_Window;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Show_Messeg_Dialog
{
    public static void main(String[] args) 
    {
      //  JOptionPane.showMessageDialog(null,"Incorect Password");   //Default  Icone and Title
        // Value -1 for no icon
        // Value 0 for Error Massage
        // Value 1 for Information Message
        // Value 2 for Warning Message
        // Value 3 for Question Message      
        //JOptionPane.showMessageDialog(null, "Incorect Password", "Warinng", 2);
        ImageIcon icon = new ImageIcon("happy1.png");
        JOptionPane.showMessageDialog(null, "Incorect Password","Warning",-1,icon);
    }
}

