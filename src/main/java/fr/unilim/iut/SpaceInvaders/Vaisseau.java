package fr.unilim.iut.SpaceInvaders;

public class Vaisseau {
	int x;
	int y;

    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }
    
   	public int abscisse() {
        return abscisseLaPlusAGauche();
	}
	
   	public void deplacerVaisseauVersLaDroite() {
		if (this.abscisseLaPlusADroite() < (longueur - 1))
			this.seDeplacerVersLaDroite();
	}
   	
   	public void seDeplacerVersLaDroite() {
		this.x = abscisseLaPlusADroite() + 1 ;
	}
	
   	public void seDeplacerVersLaGauche() {
		this.x = abscisseLaPlusAGauche() - 1 ;
	}
	
	public boolean occupeLaPosition(int x, int y) {
	     if ((abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite())) 
		      if ( (this.y-this.hauteur+1<=y) && (y<=this.y))
			  return true;
		
	     return false;
    }

	private int abscisseLaPlusAGauche() {
		return this.x;
	}

	private int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche()+this.longueur-1;
	}

	public void positionner(int x, int y) {
		this.x=x;
		this.y=y;
		
	}

	
}