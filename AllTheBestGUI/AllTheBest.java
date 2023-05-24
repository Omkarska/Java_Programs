import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllTheBest {
    public static void main(String args[]) {
        JFrame j = new JFrame();
        JLabel l = new JLabel();
        JLabel l2 = new JLabel();
        JLabel l3 = new JLabel();
        j.setLayout(null);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("All The Best");
        b2 = new JButton("All The Best");
        b3 = new JButton("All The Best");
        b4 = new JButton("All The Best");
        b5 = new JButton("All The Best");
        l.setText("All The Best");
        l2.setText("All The Best");
        l3.setText("All The Best");
        b1.setForeground(new Color(210, 105, 30));
        b2.setForeground(new Color(255, 192, 203));
        b3.setForeground(new Color(238, 130, 238));
        b4.setForeground(new Color(144, 238, 144));
        b5.setForeground(new Color(173, 216, 230));
        b1.setBounds(20, 20, 120, 30);
        b2.setBounds(150, 20, 120, 30);
        b3.setBounds(280, 20, 120, 30);
        b4.setBounds(410, 20, 120, 30);
        b5.setBounds(225, 70, 120, 30);
        l.setBounds(50, 110, 100, 30);
        l2.setBounds(150, 210, 100, 30);
        l3.setBounds(250, 310, 100, 30);
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(b5);
        j.setSize(550, 400);
        j.setVisible(true);

        // Add ActionListener to each button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b1.getForeground());
                l2.setForeground(b1.getForeground());
                l3.setForeground(b1.getForeground());
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b2.getForeground());
                l2.setForeground(b2.getForeground());
                l3.setForeground(b2.getForeground());
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b3.getForeground());
                l2.setForeground(b3.getForeground());
                l3.setForeground(b3.getForeground());
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b4.getForeground());
                l2.setForeground(b4.getForeground());
                l3.setForeground(b4.getForeground());
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(b5.getForeground());
                l2.setForeground(b5.getForeground());
                l3.setForeground(b5.getForeground());
            }
        });
        j.add(l2);
        j.add(l3);
        j.add(l);
    }
}
