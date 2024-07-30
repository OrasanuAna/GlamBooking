import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Autentificare extends JFrame {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, exitButton;

    public Autentificare() {
        super("HairCode - Autentificare");

        // Panoul principal al aplicatiei
        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(Color.WHITE);

        // Eticheta "Nume utilizator"
        usernameLabel = new JLabel("Nume utilizator:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        usernameLabel.setForeground(new Color(51, 51, 51));
        mainPanel.add(usernameLabel);

        // Câmpul pentru numele de utilizator
        usernameField = new JTextField(20);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 16));
        mainPanel.add(usernameField);

        // Eticheta "Parola"
        passwordLabel = new JLabel("Parola:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        passwordLabel.setForeground(new Color(51, 51, 51));
        mainPanel.add(passwordLabel);

        // Câmpul pentru parolă
        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        mainPanel.add(passwordField);

        // Butonul de autentificare
        loginButton = new JButton("Logare");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0, 128, 0));
        loginButton.addActionListener(new LoginListener());
        mainPanel.add(loginButton);

        // Butonul de ieșire
        exitButton = new JButton("Ieșire");
        exitButton.setFont(new Font("Arial", Font.BOLD, 16));
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(128, 0, 0));
        exitButton.addActionListener(new ExitListener());
        mainPanel.add(exitButton);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Verificare utilizator si parola
            if (username.equals("ana") && password.equals("orasanu")) {
                dispose();
                MeniuPrincipal menu = new MeniuPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "Nume utilizator sau parola incorecte!", "Eroare", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
}
