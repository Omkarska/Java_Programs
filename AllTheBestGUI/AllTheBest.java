import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllTheBest {
    public static void main(String args[]) {
        JFrame j = new JFrame();
        JLabel l = new JLabel();
        j.setLayout(new FlowLayout());
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("All The Best");
        b2 = new JButton("All The Best");
        b3 = new JButton("All The Best");
        b4 = new JButton("All The Best");
        b5 = new JButton("All The Best");
        l.setText("All The Best");
        b1.setForeground(new Color(210, 105, 30));
        b2.setForeground(new Color(255, 192, 203));
        b3.setForeground(new Color(238, 130, 238));
        b4.setForeground(new Color(144, 238, 144));
        b5.setForeground(new Color(173, 216, 230));
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(b5);
        j.setSize(450, 400);
        j.setVisible(true);

        // Add ActionListener to each button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b1.getForeground());
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b2.getForeground());
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b3.getForeground());
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b4.getForeground());
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b5.getForeground());
            }
        });

        j.add(l);
    }
}
