package fr.saintaspais.l3.garage.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garage {

	private List<Voiture> liste = new ArrayList<>();

	public boolean estVide() {
		return liste.isEmpty();
	}

	public boolean ajouter(Voiture voiture) {
		return this.liste.add(voiture);
	}

	/**
	 * Cherche une voiture dans le garage selon les critères indiqués
	 * @param marque
	 * @param annee
	 * @param couleur
	 * @return
	 */
	public Voiture chercher(String marque, int annee, Couleur couleur) {
		
		// Cette méthode est testée dans la classe GarageTest (src/test/java -> garage -> GarageTest)
		// Vous pouvez choisir la méthode de recherche 
		
		// Avec une boucle avec compteur i
		/*for(int i=0;i<liste.size();i++) {
			Voiture v = liste.get(i);
			if(v.getMarque().equals(marque)
					&& v.getAnneeConstruction().equals(annee)
					&& v.getCouleur().equals(couleur)) {
				return v;
			}
		}*/
		
		// foreach
		/*for(Voiture v : liste) {
			if(v.getMarque().equals(marque)
					&& v.getAnneeConstruction().equals(annee)
					&& v.getCouleur().equals(couleur)) {
				return v;
			}
		}*/
		
		// Stream
		Optional<Voiture> option = liste.stream()
				
				// Le filter utilise 3 prédicats selon les 3 critères données
				// et pour les combiner on utilise le "and" logique : &&
				.filter(v -> v.getMarque().equals(marque)
								&& v.getAnneeConstruction().equals(annee) 
								&& v.getCouleur().equals(couleur))
				
				// Une fois le filtre appliqué, on renvoie le premier résultat trouvé
				.findFirst();

		// On peut utiliser l'opérateur ternaire pour renvoyer le résultat
		// selon si on a trouvé une voiture (optional.isPresent() donne true, 
		// dans ce cas on récupère l'objet par le get()
		
		// sinon on renvoie null si on ne trouve pas
		return option.isPresent() ? option.get() : null;
	}
	
}
