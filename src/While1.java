import static javax.swing.JOptionPane.*;

public class While1 {
    public static void main(String[] args) {
        int sum = 0;
        int antall = 0;
        String input = showInputDialog("Skriv inn et heltall og avslutt med 0");
        int innTall = Integer.parseInt(input);
        while (innTall > 0) {
            sum = sum + innTall;
            antall = antall + 1;
            input = showInputDialog("Skriv inn et heltall og avslutt med 0");
            innTall = Integer.parseInt(input);
        }
        showMessageDialog(null,"Summen er : "+sum);
        double gjennomsnitt = (double) sum / (double) antall; //Disse er castet til double, og vi får ut desimaltallene
        showMessageDialog(null,"Gjennomsnittet er : "+gjennomsnitt);
    }
}
