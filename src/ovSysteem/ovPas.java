package ovSysteem;

public class ovPas {

	  private double saldo;
	  /* het besgra wat er op het ov-pas staat*/
	    private boolean ingecheckt;
	    /* dat gefet aan of je bent ingechecktt op dit moment true/false*/ 
	    
	    public ovPas(String kaartnummer, double saldo) {
	    /* je maakt een nieuwe object*/ 	
	    	/* kaaratnummer dat zou het kaartnummer van de ov zijn*/ 
	    	/* het saldo wat je op je ov-pas hebt*/ 
	    	
	        this.saldo = saldo;
	        /* het object krijgt saldo*/ 
	        this.ingecheckt = false;
	        /* de nieuw ov-pas is standaard niet ingecheckt dus dat is false */ 
	    }
	    public double Saldo() {
	        return saldo;
	        /* geeft het huidige saldo terug */ 
	    }

	    public boolean Ingecheckt() {
	        return ingecheckt;
	        /* geeft terug of je hebt ingechcket */ 
	    }

	    public void opwaarden(double bedrag) {
	        saldo += bedrag;
	        /* verhoogd het saldo*/ 
	    }

	    public void inchecken(double incheckBedrag) {
	        saldo +=incheckBedrag ;
	        ingecheckt = true;
	        /* je bent ingechecjt dus er gaaat geld van je pas */ 
	        /* je pas wordt ingecheck gezet*/ 
	    }

	    public void uitchecken(double ritprijs) {
	        saldo -= ritprijs;
	        ingecheckt = false;
	        /* er wordt geld van je saldo gehaald*/ 
	        /* de pas wordt uitgecheckt*/ 
	    }

}
