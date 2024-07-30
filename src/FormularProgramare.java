import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularProgramare extends JFrame {
    private JLabel numeLabel, prenumeLabel, dataLabel, oraLabel, hairstylistLabel;
    private JTextField numeField, prenumeField, dataField, oraField;
    private JComboBox<String> hairstylistCombo;
    private JButton saveButton, backButton;

    public FormularProgramare() {
        setTitle("HairCode - Programare");
        setResizable(false);

        JPanel mainPanel = new JPanel(new GridLayout(6, 2));
        mainPanel.setBackground(new Color(255, 255, 255));

        numeLabel = new JLabel("Nume: ");
        numeLabel.setForeground(new Color(24, 25, 26));
        mainPanel.add(numeLabel);

        numeField = new JTextField(20);
        mainPanel.add(numeField);

        prenumeLabel = new JLabel("Prenume: ");
        prenumeLabel.setForeground(new Color(24, 25, 26));
        mainPanel.add(prenumeLabel);

        prenumeField = new JTextField(20);
        mainPanel.add(prenumeField);

        dataLabel = new JLabel("Data: ");
        dataLabel.setForeground(new Color(24, 25, 26));
        mainPanel.add(dataLabel);

        dataField = new JTextField(20);
        mainPanel.add(dataField);

        oraLabel = new JLabel("Ora: ");
        oraLabel.setForeground(new Color(24, 25, 26));
        mainPanel.add(oraLabel);

        oraField = new JTextField(20);
        mainPanel.add(oraField);

        hairstylistLabel = new JLabel("Hairstylist: ");
        hairstylistLabel.setForeground(new Color(24, 25, 26));
        mainPanel.add(hairstylistLabel);

        hairstylistCombo = new JComboBox<String>(new String[]{"Ioana Moise", "Ana Redenciuc", "Izabela Moraru", "Ionela Manea"});
        hairstylistCombo.setBackground(new Color(255, 255, 255));
        hairstylistCombo.setForeground(new Color(24, 25, 26));
        mainPanel.add(hairstylistCombo);

        saveButton = new JButton("Salveaza");
        saveButton.setBackground(new Color(67, 185, 148));
        saveButton.setForeground(new Color(255, 255, 255));
        saveButton.addActionListener(new SaveListener());
        mainPanel.add(saveButton);

        backButton = new JButton("Inapoi");
        backButton.setBackground(new Color(67, 185, 148));
        backButton.setForeground(new Color(255, 255, 255));
        backButton.addActionListener(new BackListener());
        mainPanel.add(backButton);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class SaveListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Salvare programare
            String nume = numeField.getText();
            String prenume = prenumeField.getText();
            String data = dataField.getText();
            String ora = oraField.getText();
            String hairstylist = (String) hairstylistCombo.getSelectedItem();
            ManagerFisiere.adaugaProgramare(nume, prenume, data, ora, hairstylist);
            JOptionPane.showMessageDialog(null, "Programarea a fost salvata cu succes!");

            // Redirectionare către MeniuPrincipal
            dispose();
            MeniuPrincipal menu = new MeniuPrincipal();
        }
    }

    private class BackListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // Închiderea ferestrei FormularProgramare
            dispose();

            // Redirectionare către MeniuPrincipal
            MeniuPrincipal menu = new MeniuPrincipal();
        }
    }
}
