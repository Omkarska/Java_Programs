import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChatFrame extends JFrame implements ActionListener {
    private JTextArea chatTextArea;
    private JTextField inputTextField;
    private JButton sendButton;
    private JButton resetButton;

    public ChatFrame() {
        setTitle("Chat Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatTextArea = new JTextArea();
        chatTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatTextArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());

        JLabel enterTextLabel = new JLabel("Enter Text: ");
        inputPanel.add(enterTextLabel, BorderLayout.WEST);

        inputTextField = new JTextField();
        inputPanel.add(inputTextField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        buttonPanel.add(sendButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        inputPanel.add(buttonPanel, BorderLayout.EAST);

        add(inputPanel, BorderLayout.SOUTH);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(this);
        helpMenu.add(aboutMenuItem);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton) {
            String input = inputTextField.getText();
            chatTextArea.append("You: " + input + "\n");
            inputTextField.setText("");
        } else if (e.getSource() == resetButton) {
            chatTextArea.setText("");
            inputTextField.setText("");
        } else if (e.getActionCommand().equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Open Chat File");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text files (*.txt)", "txt"));
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                openChatFromFile(file);
            }
        } else if (e.getActionCommand().equals("Save")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Chat File");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text files (*.txt)", "txt"));
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                saveChatToFile(file);
            }
        } else if (e.getActionCommand().equals("About")) {
            JOptionPane.showMessageDialog(this, "This is a simple chat application.", "About",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void openChatFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            chatTextArea.setText("");
            while ((line = reader.readLine()) != null) {
                chatTextArea.append(line + "\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error occurred while opening the file.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveChatToFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(chatTextArea.getText());
            JOptionPane.showMessageDialog(this, "Chat saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error occurred while saving the file.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatFrame chatFrame = new ChatFrame();
            chatFrame.setVisible(true);
            chatFrame.setSize(400, 400);
            chatFrame.setResizable(false);
        });
    }
}
