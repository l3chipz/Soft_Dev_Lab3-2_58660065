import javax.swing.*;

public class Main {
    public static void main(String args[])
    {
        //String input = JOptionPane.showInputDialog("input number","0");
        //JOptionPane.showMessageDialog(null,input, "title",JOptionPane.INFORMATION_MESSAGE);

        int ans = JOptionPane.showConfirmDialog(null,"Did you love me?",
                "Ask you.",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Love you too.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"I still love you.");
        }
    }
}
