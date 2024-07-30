import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MeniuPrincipal extends JFrame {
    private JButton programeazaButton, listaHairstylistiButton, programLucruButton, iesireButton;

    public MeniuPrincipal() {
        setTitle("HairCode - Meniu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Logo
        ImageIcon logoIcon = new ImageIcon("logo.png");
        Image logoImage = logoIcon.getImage();
        int scaledWidth = (int) (logoIcon.getIconWidth() * 0.7);
        int scaledHeight = (int) (logoIcon.getIconHeight() * 0.7);
        Image scaledImage = logoImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));
        logoLabel.setHorizontalAlignment(JLabel.CENTER);


        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.white);

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 0, 20));
        buttonPanel.setBackground(Color.white);

        programeazaButton = new JButton("Programează-te");
        programeazaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // închiderea ferestrei curente
                FormularProgramare programare = new FormularProgramare();
            }
        });
        programeazaButton.setFont(new Font("Arial", Font.BOLD, 20));
        programeazaButton.setForeground(Color.white);
        programeazaButton.setBackground(Color.black);
        buttonPanel.add(programeazaButton);

        listaHairstylistiButton = new JButton("Lista Hairstyliști");
        listaHairstylistiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // închiderea ferestrei curente
                ListaHairstylisti listaHairstylisti = new ListaHairstylisti();
            }
        });
        listaHairstylistiButton.setFont(new Font("Arial", Font.BOLD, 20));
        listaHairstylistiButton.setForeground(Color.white);
        listaHairstylistiButton.setBackground(Color.black);
        buttonPanel.add(listaHairstylistiButton);

        programLucruButton = new JButton("Program de lucru");
        programLucruButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // închiderea ferestrei curente
                ProgramLucru programLucru = new ProgramLucru();
            }
        });
        programLucruButton.setFont(new Font("Arial", Font.BOLD, 20));
        programLucruButton.setForeground(Color.white);
        programLucruButton.setBackground(Color.black);
        buttonPanel.add(programLucruButton);

        // Buton Ieșire
        JPanel iesirePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        iesirePanel.setBackground(Color.white);
        iesireButton = new JButton("Ieșire");
        iesireButton.setFont(new Font("Arial", Font.BOLD, 20));
        iesireButton.setForeground(Color.white);
        iesireButton.setBackground(Color.black);
        iesireButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                // închiderea ferestrei curente
                dispose();
                // închiderea aplicației
                System.exit(0);
            }
        });
        iesirePanel.add(iesireButton);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(iesirePanel, BorderLayout.SOUTH);

        add(logoLabel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
