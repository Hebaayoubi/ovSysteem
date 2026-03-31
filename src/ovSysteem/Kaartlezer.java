package ovSysteem;

public class Kaartlezer {

	private String locatie;
	/* de pel van het kaartlezer dus bijvoorbeeld Arnhem*/ 
	private String type;
	/* wat voor sorrt type het kaartleer is dus bijvoorbeeld NS of  Arivva */ 

	public Kaartlezer(String locatie, String type) {
		/* de kaartlezer gaat pas werken bij de passende ov-pas*/ 
		this.locatie = locatie;
		/* waar de kaartlezer staat */ 
		this.type = type;
		/* wat voor soort kaartlezer het is */ 
	}

	public void scanKaart(AnoniemChipkaart pas) {
		System.out.println("kaart gescand op locatie:" + locatie);
		/* het scannen van de ov-pas */
		/* er wordt een melding geprint */ 
		/* er wordt gezged op welk locatie het is */ 
	}

	public void ingecheckt() {
		System.out.println("Groen licht + piep Ingecheckt.");
		/* je bent g=ingecheckt */ 
		/* genoeg saldo dan krijg je een melding geprint met een groende licht en een piepgeluid */ 
	}

	public void uitgecheckt() {
		System.out.println("Piep Uitgecheckt.");
		/* uitgecheckt je krijgt een melding geprint van een piep geluid dat je bent uitgecheckt*/ 
	}

	public void foutmelding(String melding) {
		System.out.println("Rood licht:" + melding);
		/* dit wordt gebruikt wanneer er iets misgaat */ 
		/* als je weinign saldo op je ov-pas hebt of bij de verkeerde type */ 
		/* je krijgt een fout melding */ 
	}

}
