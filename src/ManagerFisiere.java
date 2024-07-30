import java.io.*;

public class ManagerFisiere {
    public static void adaugaProgramare(String nume, String prenume, String data, String ora, String medic) {
        try {
            // Deschidere fisier pentru scriere
            FileWriter fisier = new FileWriter("programari.txt", true);
            PrintWriter scriere = new PrintWriter(fisier);

            // Scriere programare in fisier
            scriere.println("Nume: " + nume);
            scriere.println("Prenume: " + prenume);
            scriere.println("Data: " + data);
            scriere.println("Ora: " + ora);
            scriere.println("Hairstylist: " + medic);
            scriere.println("--------------------");

            // Inchidere fisier
            scriere.close();
        } catch (IOException e) {
            System.out.println("Eroare la salvarea programarii!");
        }
    }


    public static String citesteProgramari() {
        String programari = "";

        try {
            // Deschidere fisier pentru citire
            FileReader fisier = new FileReader("programari.txt");
            BufferedReader citire = new BufferedReader(fisier);

            // Citire programari din fisier
            String linie;
            while ((linie = citire.readLine()) != null) {
                programari += linie + "\n";
            }

            // Inchidere fisier
            citire.close();
        } catch (IOException e) {
            System.out.println("Eroare la citirea programarilor!");
        }

        return programari;
    }
}
