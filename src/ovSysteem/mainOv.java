package ovSysteem;

public class mainOv {

    /** -----------------------------
    // Variabelen van Kaartlezer
    // -----------------------------
    */
     
    private String locatie;
    private String type;

    /** -----------------------------
    // Variabelen van ovPas
    // -----------------------------
    */
    
    private double saldo;
    private boolean ingecheckt;

    // -----------------------------
    // Constructor
    // -----------------------------
    /**
     * 
     * @param locatie
     * @param type
     * @param saldo
     */
    public mainOv(String locatie, String type, double saldo) {
        this.locatie = locatie;
        this.type = type;
        this.saldo = saldo;
        this.ingecheckt = false;
    }

    /** -----------------------------
    // Methoden van Kaartlezer
    // -----------------------------
    */
  
    public void scanKaart() {
        System.out.println("Kaart gescand op locatie: " + locatie);
    }

    public void ingechecktMelding() {
        System.out.println("Groen licht + piep Ingecheckt.");
    }

    public void uitgechecktMelding() {
        System.out.println("Piep Uitgecheckt.");
    }

    public void foutmelding(String melding) {
        System.out.println("Rood licht: " + melding);
    }

    /** -----------------------------
    // Methoden van ovPas
    // -----------------------------
    *
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public void opwaarden(double bedrag) {
        saldo += bedrag;
    }

    public void inchecken(double incheckBedrag) {
        saldo -= incheckBedrag;
        ingecheckt = true;
    }

    public void uitchecken(double ritprijs) {
        saldo -= ritprijs;
        ingecheckt = false;
    }

    /** -----------------------------
    // MAIN METHODE
    // -----------------------------
     * @param args
     */
    public static void main(String[] args) {

        mainOv ov = new mainOv("Arnhem", "NS", 2.00);
        // te laag saldo expres

        ov.scanKaart();

        // Zolang saldo lager is dan 4 euro, blijf automatisch proberen
        while (ov.getSaldo() <4.00) {
            ov.foutmelding("Onvoldoende saldo! Je hebt minimaal 4 euro nodig.");
            System.out.println("Huidig saldo: " + ov.getSaldo());

            // Automatisch opwaarderen
            ov.opwaarden(2.00);
            System.out.println("Automatisch 2 euro opgewaardeerd...");
        }

        // Genoeg saldo → inchecken
        ov.inchecken(4.00);
        ov.ingechecktMelding();

        // Uitchecken
        ov.uitchecken(2.50);
        ov.uitgechecktMelding();

        System.out.println("Nieuw saldo: " + ov.getSaldo());
    }
}