package fr.unilim.iut.SpaceInvaders.model;

public class Envahisseur extends Sprite {

	 public Envahisseur() {
		    super(new Dimension(1,1),new Position(0,0), 0);
	}

	 public Envahisseur(int x, int y) {
		 	super(new Dimension(1,1),new Position(x, y),0);
	 }
	 
	 public Envahisseur(Position positionOrigine) {
		 super(new Dimension(1,1), positionOrigine, 1);
	}
    
	public Envahisseur(Position positionOrigine, int vitesse) {
			this.origine = positionOrigine;
			this.vitesse = vitesse;
	}
	 
	public int abscisse() {
        return abscisseLaPlusAGauche();
	}
	  
   	
   	public void deplacerVersLaDroiteUnEnvahisseur() {
	    this.origine.changerAbscisse(this.origine.abscisse()+vitesse);
   }

	
    public void deplacerVersLaGaucheUnEnvahisseur() {
	    this.origine.changerAbscisse(this.origine.abscisse()-vitesse);
  }

	
	public boolean unEnvahisseurOccupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse() <=y && y <= ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	public int ordonneeLaPlusBasse() {
		return this.origine.ordonnee();
	}
	
	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche();
	}

	public void positionner(int x, int y) {
		  this.origine.changerAbscisse(x);
		  this.origine.changerOrdonnee(y);
    }
	
	public void deplacerUnEnvahisseurVersLaDroite() {
		if (this.abscisseLaPlusADroite() < 1)
			this.deplacerVersLaDroiteUnEnvahisseur();
	}
	
	public void deplacerUnEnvahisseurVersLaGauche() {
		if (this.abscisseLaPlusAGauche() > this.vitesse)
			this.deplacerVersLaGaucheUnEnvahisseur();
	}

	public void deplacerEnvahisseur(){
		int droiteOuGauche = (int) (Math.random()*(0-1));
		if (droiteOuGauche == 1) {
			this.deplacerUnEnvahisseurVersLaGauche();
		}
		else {
			this.deplacerUnEnvahisseurVersLaGauche();
		}
	}
}
