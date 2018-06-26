package com.imie.algotojava.tp09Modifie.model;

public class ArmurePhysique extends Armure {
	// Les attributs	
		private int statPhysique;
		
		// Les constructeurs	
		/** Constructeur vide de la classe ArmurePhysique
		 * 
		 */
		public ArmurePhysique() {
			
		}
		
		/** Constructeur de la classe ArmurePhysique
		 * 
		 * @param nom, chaîne de caractères, nom de l'armure
		 * @param niveau, entier, niveau de l'armure
		 * @param valeurDefensePhysique, entier, valeur de défense physique de l'armure
		 */
		public ArmurePhysique(String nom, int niveau, int valeurDefensePhysique) {
			super(nom, niveau);
			this.statPhysique = valeurDefensePhysique;
		}			
		
		// Les accesseurs	
		public void setStatPhysique(int statPhysique) {
			this.statPhysique = statPhysique;
		}
		
		public int getStatPhysique() {
			return this.statPhysique;
		}
}
