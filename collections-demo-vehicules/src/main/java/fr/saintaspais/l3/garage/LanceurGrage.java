package fr.saintaspais.l3.garage;

import fr.saintaspais.l3.garage.modele.Couleur;
import fr.saintaspais.l3.garage.modele.Garage;
import fr.saintaspais.l3.garage.modele.Voiture;

public class LanceurGrage {

	private static final String MSG_AJOUTEE_AU_GARAGE = " ajoutée au garage";
	private static final String VOITURE = "Voiture : ";

	public static void main(String[] args) {

		// On crée une instance du garage
		Garage g = new Garage();
		
		// A chaque étape on va créer une voiture, on l'ajoute au garage
		
		System.out.println("********** Ajout des voitures *************");
		
		Voiture peugeot = new Voiture("Peugeot", 2020, Couleur.BLANCHE);
		boolean b1 = g.ajouter(peugeot);
		if(b1) {
			System.out.println(VOITURE + peugeot + MSG_AJOUTEE_AU_GARAGE);
		}
		
		Voiture bmw = new Voiture("BMW", 2022, Couleur.ROUGE);
		boolean b2 = g.ajouter(bmw);
		if(b2) {
			System.out.println(VOITURE + bmw + MSG_AJOUTEE_AU_GARAGE);
		}
		
		Voiture mercedes = new Voiture("Mercedes", 2015, Couleur.NOIRE);
		boolean b3 = g.ajouter(mercedes);
		if(b3) {
			System.out.println(VOITURE + mercedes + MSG_AJOUTEE_AU_GARAGE);
		}
		
		Voiture toyota = new Voiture("Toyota", 2021, Couleur.VERTE);
		boolean b4 = g.ajouter(toyota);
		if(b4) {
			System.out.println(VOITURE + toyota + MSG_AJOUTEE_AU_GARAGE);
		}
		
		System.out.println("*********** Recherche ******************");
		System.out.println();
		
		// On va tester la recherche avec une voiture déjà ajoutée
		System.out.println("1/ Voiture qui est déjà dans le garage");
		Voiture recherchePeugeot = g.chercher("Peugeot", 2020, Couleur.BLANCHE);
		if(recherchePeugeot != null) {
			System.out.println("Voiture recherchée (Peugeot de 2020 blanche) et trouvée : " + recherchePeugeot);
		} else {
			System.out.println("Pas de voiture avec les critères : Peugeot, 2020, couleur blanche");
		}

		System.out.println();
		
		// avec une voiture qui n'a pas été ajoutée
		System.out.println("2/ Voiture qui n'est pas dans le garage");
		Voiture rechercheRenault = g.chercher("Renault", 2022, Couleur.ROUGE);
		if(rechercheRenault != null) {
			System.out.println("Voiture recherchée (Renault de 2022 rouge) et trouvée : " + rechercheRenault);
		} else {
			System.out.println("Pas de voiture avec les critères : Renault, 2022, couleur rouge");
		}

	}

}
