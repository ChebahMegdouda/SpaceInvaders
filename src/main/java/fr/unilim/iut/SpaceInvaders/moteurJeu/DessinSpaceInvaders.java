package fr.unilim.iut.SpaceInvaders.moteurJeu;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.SpaceInvaders.model.Dimension;
import fr.unilim.iut.SpaceInvaders.model.Envahisseur;
import fr.unilim.iut.SpaceInvaders.model.Missile;
import fr.unilim.iut.SpaceInvaders.model.Position;
import fr.unilim.iut.SpaceInvaders.model.SpaceInvaders;
import fr.unilim.iut.SpaceInvaders.model.Vaisseau;

public class DessinSpaceInvaders implements DessinJeu {
	private SpaceInvaders jeu;

	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		this.jeu = spaceInvaders;
	}

	public void dessiner(BufferedImage im) {
		if (this.jeu.aUnVaisseau()) {
			this.dessinerUnVaisseau(new Vaisseau(new Dimension(3,2),new Position(7,9),1), im);
		}
		if(this.jeu.aUnMissile()) {
			this.dessinerUnMissile(new Missile(), im);
		}
		if(this.jeu.aUnEnvahisseur()) {
			this.dessinerUnEnvahisseur(new Envahisseur(), im);
		}
	}

	private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();

		crayon.setColor(Color.gray);
		crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(), vaisseau.hauteur());

	}
	
	private void dessinerUnEnvahisseur(Envahisseur envahisseur, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();

		crayon.setColor(Color.green);
		crayon.fillRect(envahisseur.abscisseLaPlusAGauche(), envahisseur.ordonneeLaPlusBasse(), envahisseur.longueur(), 1);

	}

	private void dessinerUnMissile(Missile missile, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();

		crayon.setColor(Color.blue);
		crayon.fillRect(missile.abscisseLaPlusAGauche(), missile.ordonneeLaPlusBasse(), missile.longueur(), missile.hauteur());

}

}
