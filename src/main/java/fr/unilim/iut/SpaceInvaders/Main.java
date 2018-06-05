package fr.unilim.iut.SpaceInvaders;
import fr.unilim.iut.SpaceInvaders.model.SpaceInvaders;
import fr.unilim.iut.SpaceInvaders.moteurJeu.DessinSpaceInvaders;
import fr.unilim.iut.SpaceInvaders.moteurJeu.MoteurGraphique;

/**
 * lancement du moteur avec le jeu
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {

		SpaceInvaders jeu = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    jeu.initialiserJeu();
	    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);
	    MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	}

}
