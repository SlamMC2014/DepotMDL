package Classes;

public class MainTestGit {
	
	    public static void main (String[] args)
	    {
	        //Ceci est mon nouveau commentaire
	    	// pour l'exercice version2
	    	// Modif Annie 10/03/14
	    	Atelier monAtelier,  monAtelier2;
	    	monAtelier= new Atelier(1,1,"info",10);
	    	monAtelier2= new Atelier(1,1,"info",10);
	    	System.out.print ("Voici mon premier atelier : ");
	    	System.out.print (monAtelier.getLibelleatelier());
	    	System.out.print ("Voici mon deuxime atelier : ");
	    	System.out.print (monAtelier2.getLibelleatelier());
	    }
	}

