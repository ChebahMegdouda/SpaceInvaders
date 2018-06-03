package fr.unilim.iut.SpaceInvaders.model;

public class Vaisseau {
	
	Position origine; 
	Dimension dimension;
    int vitesse; 

	 public Vaisseau(int longueur, int hauteur) {
		    this(longueur, hauteur, 0, 0);
	    }

	 public Vaisseau(int longueur, int hauteur, int x, int y) {
		   this(new Dimension(longueur, hauteur), new Position(x, y));
	    }
	 
	 public Vaisseau(Dimension dimension, Position positionOrigine) {
			this(dimension, positionOrigine, 1);
		}
    
	 public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
			this.dimension = dimension;
			this.origine = positionOrigine;
			this.vitesse = vitesse;
		}
	 
	 
	 
   	public int abscisse() {
        return abscisseLaPlusAGauche();
	}
	  
   	
   	public void seDeplacerVersLaDroite() {
	    this.origine.changerAbscisse(this.origine.abscisse()+vitesse);
   }

	
    public void seDeplacerVersLaGauche() {
	    this.origine.changerAbscisse(this.origine.abscisse()-vitesse);
  }

	
	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse() <=y && y <= ordonneeLaPlusHaute());
	}

	public int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	public int ordonneeLaPlusBasse() {
		return this.origine.ordonnee()-this.dimension.hauteur()+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche() + this.dimension.longueur()-1;
	}

	public void positionner(int x, int y) {
		  this.origine.changerAbscisse(x);
		  this.origine.changerOrdonnee(y);
    }
	public void deplacerVaisseauVersLaDroite() {
		if (this.abscisseLaPlusADroite() < (dimension.longueur() - 1))
			this.seDeplacerVersLaDroite();
	}

	public int longueur() {
		return this.dimension.longueur();
	}
}