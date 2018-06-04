package fr.unilim.iut.SpaceInvaders;

public  class Vaisseau extends Sprite {
    
	 public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) { 
		 super(dimension, positionOrigine, vitesse);

		}

	public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		
		Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}

	private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
		// TODO Auto-generated method stub
		return null;
	}

	
	 
	 
}