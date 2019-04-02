import javax.swing.*;

public class EvenOdd {

    public static void main(String[] args){
        String stringNum = JOptionPane.showInputDialog("Enter a number: ");
        int num = Integer.parseInt(stringNum);
        if(num%2 == 0)
            JOptionPane.showMessageDialog(null, num + " is even.");
        else
            JOptionPane.showMessageDialog(null, num + " is odd.");
    }
}
