package ovSysteem;

public class AnoniemChipkaart {
	public double getSaldo() {
	    return saldo;
	}
	/*actie/functie*/ 
	private double saldo;
	/*bewaart het geld*/ 
	  /* het bedrag wat er op het ov-pas staat*/
	    private boolean ingecheckt;
	    /* dat gefet aan of je bent ingechecktt op dit moment true/false*/ 
	    private String inchecklocatie; 
	    /*nieuwe variabele om een locatie om-p te slaan*/ 
	   
	    public AnoniemChipkaart(double saldo){
	    /* je maakt een nieuwe object*/ 	
	    	/* kaaratnummer dat zou het kaartnummer van de ov zijn*/ 
	    	/* het saldo wat je op je ov-pas hebt*/ 
	  
	        this.saldo = saldo;
	        /* het object krijgt saldo*/ 
	        this.ingecheckt = false;
	        /* de nieuw ov-pas is standaard niet ingecheckt dus dat is false */ 
	        this.inchecklocatie= null; 
	        /* er is op dti moment geen inchecklocatie*/ 
	    }
	    public double Saldo() {
	        return saldo;
	        /* geeft het huidige saldo terug */ 
	    }

	    public boolean Ingecheckt() {
	        return ingecheckt;
	        /* geeft terug of je hebt ingechcket */ 
	    }
	    public String inchecklocatie() { 
	    	return inchecklocatie; 
	    }

	    public void opwaarden(double bedrag) {
	        saldo += bedrag;
	        /* verhoogd het saldo*/ 
	    }

	    public void inchecken(double incheckBedrag , String locatie ) {
	        saldo +=incheckBedrag ;
	        ingecheckt =true;
	        inchecklocatie =locatie; 
	        /* je bent ingechecjt dus er gaaat geld van je pas */ 
	        /* je pas wordt ingecheck gezet*/ 
	    }

	    public void uitchecken(double ritprijs) {
	        saldo -= ritprijs;
	        ingecheckt = false;
	        inchecklocatie = null; 
	        /* er wordt geld van je saldo gehaald*/ 
	        /* de pas wordt uitgecheckt*/ 
	    }

}

