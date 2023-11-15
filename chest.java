import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class chest {

    public chest(){
        createAndShowGUI();
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2)); // 6 rows, 2 columns

        // Add components for each row
        panel.add(new JLabel("Exercises"));
        panel.add(new JButton("Edit"));
        panel.add(new JLabel("x"));
        panel.add(new JButton("Edit"));
        panel.add(new JLabel("y"));
        panel.add(new JButton("Edit"));
        panel.add(new JLabel("z"));
        panel.add(new JButton("Edit"));
        panel.add(new JLabel("w"));
        panel.add(new JButton("Edit"));
        panel.add(new JLabel("q"));
        panel.add(new JButton("Edit"));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new chest();
    }
}
