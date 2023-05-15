// example 5 : ShowTowNumbers.java
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = " you have just entered : ";
        strNum1 = JOptionPane.showInputDialog(null,
         "Please input the first string", "Nguyen Van Lam input the first time",JOptionPane.INFORMATION_MESSAGE);
         strNotification += strNum1 + " and ";
         strNum2 = JOptionPane.showInputDialog(null,
         "Please input the second string", "Nguyen Van Lam input the second time",JOptionPane.INFORMATION_MESSAGE);
         strNotification += strNum2;
         JOptionPane.showMessageDialog(null, strNotification, "Show tow numbers ", JOptionPane.INFORMATION_MESSAGE);
         System.exit(0);
        }
    
}
