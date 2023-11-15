/**
 * @author Zack Kaplan
 */

 import javax.swing.*;
 import java.awt.*;

 public class liftingData{

    private JFrame f; 
    private JPanel p;
    private JButton b1;
    private JLabel lab;

    public liftingData(){
        gui();
    }

    public void gui(){
        f = new JFrame("Creativity tuts");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel(new GridBagLayout());
        p.setBackground(Color.BLUE);

        b1 = new JButton("Start lifting");
        b2 = new JButton("Schedule");

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(10,10,10,10);
        c.gridx = 0;
        c.gridy = 2;
        p.add(b1, c);
        c.gridx = 0;
        c.gridy = 1;
        p.add(b2, c);

        f.add(p);

    }

    public static void main(String[] args){

        new liftingData();

    }

 }