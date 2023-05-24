import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberAdditionProgram extends JFrame implements ActionListener {
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JTextField resultTextField;

    public NumberAdditionProgram() {
        setTitle("Number Addition Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        Border inputBorder = BorderFactory.createTitledBorder("Number Addition");
        inputPanel.setBorder(inputBorder);

        JLabel num1Label = new JLabel("First Number:");
        num1TextField = new JTextField();
        JLabel num2Label = new JLabel("Second Number:");
        num2TextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        inputPanel.add(num1Label);
        inputPanel.add(num1TextField);
        inputPanel.add(num2Label);
        inputPanel.add(num2TextField);
        inputPanel.add(resultLabel);
        inputPanel.add(resultTextField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);

        inputPanel.add(buttonPanel);

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        exitPanel.add(exitButton);

        mainPanel.add(exitPanel, BorderLayout.SOUTH);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            try {
                int num1 = Integer.parseInt(num1TextField.getText());
                int num2 = Integer.parseInt(num2TextField.getText());
                int result = num1 + num2;
                resultTextField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getActionCommand().equals("Clear")) {
            num1TextField.setText("");
            num2TextField.setText("");
            resultTextField.setText("");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NumberAdditionProgram program = new NumberAdditionProgram();
            program.setVisible(true);
            program.setSize(400, 300);
            program.setResizable(false);
        });
    }
}
