package fr.saintaspais.l3.garage.modele;

import java.util.Objects;

public class Voiture {

	private String marque;
	private Integer anneeConstruction;
	private Couleur couleur;
	
	public Voiture(String marque, Integer anneeConstruction, Couleur couleur) {
		this.marque = marque;
		this.anneeConstruction = anneeConstruction;
		this.couleur = couleur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Integer getAnneeConstruction() {
		return anneeConstruction;
	}

	public void setAnneeConstruction(Integer anneeConstruction) {
		this.anneeConstruction = anneeConstruction;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voiture [marque=");
		builder.append(marque);
		builder.append(", anneeConstruction=");
		builder.append(anneeConstruction);
		builder.append(", couleur=");
		builder.append(couleur);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(anneeConstruction, couleur, marque);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		return Objects.equals(anneeConstruction, other.anneeConstruction) && couleur == other.couleur
				&& Objects.equals(marque, other.marque);
	}
	
	
}
