package fr.saintaspais.l3.garage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.saintaspais.l3.garage.modele.Couleur;
import fr.saintaspais.l3.garage.modele.Garage;
import fr.saintaspais.l3.garage.modele.Voiture;

public class GarageTest {

	@Test
	public void testGarageVide() {
		Garage g = new Garage();
		assertTrue(g.estVide());
	}
	
	@Test
	public void testGarageAvecUneVoiture() {
		Garage g = new Garage();
		g.ajouter(new Voiture("BMW", 2019, Couleur.GRISE));
		assertFalse(g.estVide());
	}
	
	@Test
	public void testGarageAvecRechercheSuccess() {
		Garage g = new Garage();
		
		Voiture expected = new Voiture("BMW", 2019, Couleur.GRISE);
		g.ajouter(expected);
		assertFalse(g.estVide());
		
		Voiture actual = new Voiture("BMW", 2019, Couleur.GRISE);
		assertEquals(actual, g.chercher("BMW", 2019, Couleur.GRISE));
	}
	
	@Test
	public void testGarageAvecRechercheEchec() {
		Garage g = new Garage();
		
		Voiture expected = new Voiture("Mercedes", 2021, Couleur.ROUGE);
		g.ajouter(expected);
		assertFalse(g.estVide());
		
		assertNull(g.chercher("BMW", 2019, Couleur.GRISE));
	}

}
