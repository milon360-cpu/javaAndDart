
package Dialog_Window;

import javax.swing.JOptionPane;

public class Show_Inout_Dialog 
{
    public static void main(String args[])
    {
        //String Name = JOptionPane.showInputDialog("Enter Your Name:\t");Paramiter-1
       // String Name = JOptionPane.showInputDialog("Enter Your Name:\t","Name"); Paramiter-2
         String First_name = JOptionPane.showInputDialog(null, "Please Enter Your First Name:\t","Form", 3);
         String Last_Name = JOptionPane.showInputDialog(null,"Enter Your Last Name:\t");
         
         String Name = First_name.concat(" "+Last_Name);
         JOptionPane.showMessageDialog(null,"Welcome "+ Name);
    }
}
