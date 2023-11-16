import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

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
        panel.add(new JLabel("Incline DB Press: "));
        addRow(panel);
        panel.add(new JLabel("Machine Press: "));
        addRow(panel);
        panel.add(new JLabel("Decline Cable Press: "));
        addRow(panel); 

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    // Helper method to add a row with labels and buttons
    private static void addRow(JPanel panel) {

        JTextField textField1 = new JTextField();
        panel.add(textField1);
        JLabel userInputLabel = new JLabel("");
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userInputLabel.setText(textField1.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField1);
                panel.remove(textField1); // Remove the text field from the panel
                panel.add(userInputLabel, position); // Add the label with user input to the panel
                panel.revalidate(); // Revalidat
            }
        });


        JTextField textField2 = new JTextField();
        panel.add(textField2);
        JLabel userInputLabel2 = new JLabel("");
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                userInputLabel2.setText((textField2.getText()));
                int position = Arrays.asList(panel.getComponents()).indexOf(textField2);
                panel.remove(textField2);
                panel.add(userInputLabel2, position);
                panel.revalidate();
            }
        });

        JTextField textField3 = new JTextField();
        panel.add(textField3);
        JLabel userInputLabel3 = new JLabel("");
        textField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                userInputLabel3.setText(textField3.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField3);
                panel.remove(textField3);
                panel.add(userInputLabel3, position);
                panel.revalidate();
            }
        });

        JButton button = new JButton("Edit");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                if(userInputLabel == null|| userInputLabel2 == null || userInputLabel3 == null){
                    JOptionPane.showMessageDialog(null, "Must fill out before editing!");
                    return;
                }

                
                int position = Arrays.asList(panel.getComponents()).indexOf(userInputLabel);
                int position2 = Arrays.asList(panel.getComponents()).indexOf(userInputLabel2);
                int position3 = Arrays.asList(panel.getComponents()).indexOf(userInputLabel3);

                panel.remove(userInputLabel);
                panel.remove(userInputLabel2);
                panel.remove(userInputLabel3);

                addRowPos(panel, position, position2, position3);

                panel.revalidate();
                
            }
        });


    }

    public static void addRowPos(JPanel panel, int pos, int pos2, int pos3){
        JTextField textField1 = new JTextField();
        panel.add(textField1, pos);
        JLabel userInputLabel = new JLabel("");
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userInputLabel.setText(textField1.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField1);
                panel.remove(textField1); // Remove the text field from the panel
                panel.add(userInputLabel, position); // Add the label with user input to the panel
                panel.revalidate(); // Revalidat
            }
        });

        JTextField textField2 = new JTextField();
        panel.add(textField2, pos2);
        JLabel userInputLabel2 = new JLabel("");
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                userInputLabel2.setText((textField2.getText()));
                int position = Arrays.asList(panel.getComponents()).indexOf(textField2);
                panel.remove(textField2);
                panel.add(userInputLabel2, position);
                panel.revalidate();
            }
        });

        JTextField textField3 = new JTextField();
        panel.add(textField3, pos3);
        JLabel userInputLabel3 = new JLabel("");
        textField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                userInputLabel3.setText(textField3.getText());
                int position = Arrays.asList(panel.getComponents()).indexOf(textField3);
                panel.remove(textField3);
                panel.add(userInputLabel3, position);
                panel.revalidate();
            }
        });

    }

    public static void main(String[] args) {
        new chest();
    }
}
