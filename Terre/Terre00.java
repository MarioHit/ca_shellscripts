/*
créer un programee qui affiche l'alpabet en lettres 
miniscules suivi d'un retour à la ligne.

Attention votre programme devra utiliser une boucle  !! 
*/
public class Terre00 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrsuvwy";
		String[] tab = alphabet.split("");
		for (String i: tab) {
			System.out.print(i);
		}
		System.out.print("\n");
	}
}
