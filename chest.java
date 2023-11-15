import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class chest {

    public chest(){
        createAndShowGUI();
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Chest Day");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5)); // 4 rows, 5 columns

        // Add column titles
        panel.add(new JLabel("Exercises"));
        panel.add(new JLabel("Sets"));
        panel.add(new JLabel("Reps"));
        panel.add(new JLabel("Weight"));
        panel.add(new JLabel("Update?"));

        // Add components for each row
        addRow(panel, "Incline DB Press");
        addRow(panel, "Machine Press");
        addRow(panel, "Decline Cable Press");

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    // Helper method to add a row with labels and buttons
    private static void addRow(JPanel panel, String title) {

        panel.add(new JLabel(title));

        JTextField textField1 = new JTextField();
        panel.add(textField1);
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel userInputLabel = new JLabel(textField1.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField1);
                panel.remove(textField1); // Remove the text field from the panel
                panel.add(userInputLabel, position); // Add the label with user input to the panel
                panel.revalidate(); // Revalidat
            }
        });


        JTextField textField2 = new JTextField();
        panel.add(textField2);
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JLabel userInputLabel = new JLabel(textField2.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField1);
                panel.remove(textField2);
                panel.add(userInputLabel, position);
                panel.revalidate();
            }
        });

        JTextField textField3 = new JTextField();
        panel.add(textField3);
        textField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JLabel userInputLabel = new JLabel(textField3.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField1);
                panel.remove(textField3);
                panel.add(userInputLabel, position);
                panel.revalidate();
            }
        });

        panel.add(new JButton("Edit"));
    }


    public static void main(String[] args) {
        new chest();
    }
}
