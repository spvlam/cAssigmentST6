package JavaBasic.src;
import javax.swing.JOptionPane;
 class choosingOption {
    public static void main(String[] args) {
        int option =JOptionPane.showConfirmDialog(null,
         "Do you want to change to first class tiket","comfirmation",
         JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         JOptionPane.showMessageDialog(null, 
         "you have chosen  " + (option==JOptionPane.YES_OPTION?"YES":"NO"));
         System.exit(0);
    }
}
