
package DialogWindow;

import javax.swing.JOptionPane;

public class ShowConfirmAndOption
{
    public static void main(String[] args) 
    {
//        JOptionPane.showConfirmDialog(null,"Please Enter","Please Enfirm",JOptionPane.CANCEL_OPTION);
     int A = JOptionPane.showConfirmDialog(null,"Please Enter","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
        if(A==0)
        {
            JOptionPane.showMessageDialog(null,"Thank you For Your Confarmition");
        }
        else if(A==1)
        {
         JOptionPane.showMessageDialog(null,"Thank you");
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Ok");
        }
    }
}
