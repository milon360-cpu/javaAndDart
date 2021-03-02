
package Dialog_Window;

import javax.swing.JOptionPane;

public class ShowOption_ShowCOnfirm {

    public static void main(String[] args) 
    {
        int A = JOptionPane.showConfirmDialog(null, "Are you sure?", "Waring", JOptionPane.YES_NO_OPTION);
        if (A == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank Your Confirmation");
        } else {
            JOptionPane.showMessageDialog(null, "Delet Every Think of Your Compputere ");
        }
//        int N=5;
//        for(int i=1; i<=N; i++)
//        {
//            for(int j=1; j<=N-i; j++)
//                System.out.print(" ");
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
//        
    }
}
