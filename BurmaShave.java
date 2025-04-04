import javax.swing.JOptionPane;

public class BurmaShave {
    public static void main(String[] args) {
    
        String[] sloganLines = {
            "Shaving brushes",
            "You'll soon see 'em",
            "On a shelf",
            "In some museum"
        };
        
        // Display each line in a separate dialog box
        for (String line : sloganLines) {
            JOptionPane.showMessageDialog(null, 
                line, 
                "Burma-Shave", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
