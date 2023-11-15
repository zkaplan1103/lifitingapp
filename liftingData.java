/**
 * @author Zack Kaplan
 */

 import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
 import java.awt.event.*;

 public class liftingData{

    private JFrame f; 
    private JPanel p;
    private JButton b1;
    private JButton b2;

    private GridBagConstraints c;

    public liftingData(){
        gui();
    }

    public void gui(){
        f = new JFrame("Lifting app Project");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel(new GridBagLayout());
        p.setBackground(Color.LIGHT_GRAY);

        b1 = new JButton("Start lifting");
        b2 = new JButton("Schedule");
        
        b1.addActionListener(new buttonListener1());
        
        b2.addActionListener(new buttonListener2());

        c = new GridBagConstraints();

        c.insets = new Insets(10,10,10,10);
        c.gridx = 0;
        c.gridy = 2;
        p.add(b1, c);
        c.gridx = 0;
        c.gridy = 1;
        p.add(b2, c);

        f.add(p);

    }

    private class buttonListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            f.setVisible(false);
            // Create and display a new JFrame with a textbox for user input
            JFrame newFrame = new JFrame("New Frame with Textbox");
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            JTextField textField = new JTextField(20);
            panel.add(textField, BorderLayout.NORTH);
            newFrame.add(panel);

            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFrame.setSize(600, 400);
            newFrame.setVisible(true);

            textField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }

                @Override 
                public void removeUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }
                @Override 
                public void changedUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }
            });
        }
    }

    private class buttonListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            f.setVisible(false);
            // Create and display a new JFrame with a textbox for user input
            JFrame newFrame = new JFrame("New Frame with Textbox");
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            JTextField textField = new JTextField(20);
            panel.add(textField, BorderLayout.NORTH);
            newFrame.add(panel);

            newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newFrame.setSize(600, 400);
            newFrame.setVisible(true);

            textField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }

                @Override 
                public void removeUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }
                @Override 
                public void changedUpdate(DocumentEvent e){
                    checkInput(textField, newFrame);
                }
            });
        }
    }

    private void checkInput(JTextField textField, JFrame frame){
        String userInput = textField.getText();

        if(userInput.equals("exit")){
            frame.setVisible(false);
            f.setVisible(true);
        }

    }


    public static void main(String[] args){

        new liftingData();

    }

 }