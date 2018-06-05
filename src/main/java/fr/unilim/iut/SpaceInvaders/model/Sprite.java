package fr.unilim.iut.SpaceInvaders.model;

public abstract class Sprite {
	Dimension dimension;
	Position origine;
	int vitesse;
	
	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

}