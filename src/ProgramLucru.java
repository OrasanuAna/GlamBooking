import javax.swing.*;
import java.awt.*;

public class ProgramLucru extends JFrame {
    private JTextArea programLucru;

    public ProgramLucru() {
        setTitle("HairCode - Program de lucru");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setPreferredSize(new Dimension(400, 300));

        // Setare font si stil pentru text area
        Font font = new Font("Helvetica", Font.PLAIN, 18);

        // Setare culori
        Color primaryColor = new Color(56, 56, 56);
        Color secondaryColor = new Color(221, 221, 221);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(primaryColor);

        // Panel pentru continutul text area
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(secondaryColor);

        // Text area
        programLucru = new JTextArea();
        programLucru.setEditable(false);
        programLucru.setFont(font);
        programLucru.setForeground(primaryColor);
        programLucru.setMargin(new Insets(20, 20, 20, 20));

        // Adaugare continut text area
        programLucru.append("Program de lucru:\n\n");
        programLucru.append("Luni - Vineri: 10:00 - 20:00\n");
        programLucru.append("Sâmbătă: 10:00 - 14:00\n");
        programLucru.append("Duminică: Închis\n");
        textPanel.add(programLucru, BorderLayout.CENTER);

        // Panel pentru butonul de inapoi
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonPanel.setBackground(secondaryColor);

        // Butonul de inapoi
        JButton inapoiButton = new JButton("Înapoi");
        inapoiButton.setPreferredSize(new Dimension(150, 40));
        inapoiButton.setBackground(new Color(67, 185, 148));
        inapoiButton.setForeground(Color.WHITE);
        inapoiButton.setFont(font);

        // Adaugare actiune buton inapoi
        inapoiButton.addActionListener(event -> {
            dispose();
            MeniuPrincipal menu = new MeniuPrincipal();
        });
        buttonPanel.add(inapoiButton);

        // Adaugare panouri la panelul principal
        mainPanel.add(textPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Adaugare panel principal la frame
        add(mainPanel);

        // Setare dimensiune frame si afisare
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
