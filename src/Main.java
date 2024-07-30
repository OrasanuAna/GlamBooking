import javax.swing.JFrame;

public class Main {
    public static void main(String[] args)
    {
        Autentificare auth = new Autentificare();
        auth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        auth.setSize(500, 300);
        auth.setLocationRelativeTo(null); // Centrare fereastra
        auth.setResizable(false);
        auth.setVisible(true);
    }
}
