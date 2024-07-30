import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListaHairstylisti extends JFrame {
    private JTextArea listaHairstylisti;
    private ArrayList<String> hairstylisti;

    public ListaHairstylisti() {
        setTitle("HairstylePlanner - Lista Hairstylisti");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(true);

        JPanel mainPanel = new JPanel(new BorderLayout());

        listaHairstylisti = new JTextArea();
        listaHairstylisti.setEditable(true);
        listaHairstylisti.setFont(new Font("Roboto", Font.PLAIN, 18));
        listaHairstylisti.setOpaque(false);
        mainPanel.add(new JScrollPane(listaHairstylisti), BorderLayout.CENTER);

        // Adaugare hairstylisti
        hairstylisti = new ArrayList<String>();
        hairstylisti.add("Ioana Moise");
        hairstylisti.add("Ana Redenciuc");
        hairstylisti.add("Izabela Moraru");
        hairstylisti.add("Ionela Manea");

        for (String hairstylist : hairstylisti) {
            listaHairstylisti.append(hairstylist + "\n");
        }

        JButton inapoiButton = new JButton("Inapoi");
        inapoiButton.setFont(new Font("Roboto", Font.BOLD, 16));
        inapoiButton.setBackground(new Color(0, 150, 136));
        inapoiButton.setForeground(new Color(255, 255, 255));
        inapoiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dispose(); // închiderea ferestrei curente
                MeniuPrincipal menu = new MeniuPrincipal();
            }
        });
        mainPanel.add(inapoiButton, BorderLayout.SOUTH);

        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
