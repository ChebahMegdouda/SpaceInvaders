package fr.unilim.iut.SpaceInvaders.model;

public abstract class Sprite {
	protected Position origine;
	protected Dimension dimension;
	protected int vitesse;
	
	public Sprite(Dimension dimension, Position origine,int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

	public Sprite() {
		super();
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