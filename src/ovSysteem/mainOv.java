package ovSysteem;

public class mainOv {

    public static void main(String[] args) {

        // Maak objecten
        Kaartlezer lezer = new Kaartlezer("Arnhem", "NS");
        AnoniemChipkaart pas = new AnoniemChipkaart(2.00);

        // Scan kaart
        lezer.scanKaart(pas);

        // Zolang saldo te laag is
        while (pas.getSaldo() < 4.00) {
            lezer.foutmelding("Onvoldoende saldo! Je hebt minimaal 4 euro nodig.");
            System.out.println("Huidig saldo: " + pas.getSaldo());

            pas.opwaarden(2.00);
            System.out.println("Automatisch 2 euro opgewaardeerd...");
        }

        // Inchecken
        pas.inchecken(4.00, "Arnhem");
        lezer.ingecheckt();

        // Uitchecken
        pas.uitchecken(2.50);
        lezer.uitgecheckt();

        // Eindsaldo
        System.out.println("Nieuw saldo: " + pas.getSaldo());
    }
}