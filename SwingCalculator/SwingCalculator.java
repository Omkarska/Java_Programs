import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SwingCalculator {
    private JFrame frame;
    private JTextField textField;

    public SwingCalculator() {
        frame = new JFrame("Swing Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        // Create the text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.addFocusListener(new TextFieldFocusListener());
        frame.add(textField, BorderLayout.NORTH);

        // Create the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            String currentText = textField.getText();

            if (command.equals("=")) {
                try {
                    double result = evaluateExpression(currentText);
                    textField.setText(Double.toString(result));
                } catch (Exception e) {
                    textField.setText("Error");
                }
            } else {
                textField.setText(currentText + command);
            }
        }
    }

    private class TextFieldFocusListener implements FocusListener {
        public void focusGained(FocusEvent e) {
            textField.setText("");
        }

        public void focusLost(FocusEvent e) {
            // Do nothing
        }
    }

    private double evaluateExpression(String expression) {
        return new Object() {
            int index = -1, ch;

            void nextChar() {
                ch = (++index < expression.length()) ? expression.charAt(index) : -1;
            }

            boolean isDigit() {
                return Character.isDigit(ch);
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (index < expression.length())
                    throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+'))
                        x += parseTerm(); // addition
                    else if (eat('-'))
                        x -= parseTerm(); // subtraction
                    else
                        return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*'))
                        x *= parseFactor(); // multiplication
                    else if (eat('/'))
                        x /= parseFactor(); // division
                    else
                        return x;
                }
            }

            double parseFactor() {
                if (eat('+'))
                    return parseFactor(); // unary plus
                if (eat('-'))
                    return -parseFactor(); // unary minus

                double x;
                int startPos = index;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if (isDigit()) { // numbers
                    while (isDigit())
                        nextChar();
                    x = Double.parseDouble(expression.substring(startPos, index));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                return x;
            }

            boolean eat(int charToEat) {
                while (ch == ' ')
                    nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
        }.parse();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingCalculator();
            }
        });
    }
}
