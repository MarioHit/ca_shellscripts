/*
		TAILLE D'UNE CHAINE
un programe qui affiche le nombre de caractères
 d'une chaine de caractères passée en argurment

donc si c'est plusieurs argument : erreur
si c'est un chiffer : erreur 

0. vérifier s'il y a plusieurs entrée si oui erreur sinon continuer 
1. preparer une string regex à comparer en cas de  x arguments 
2. si la chaine n'est pas string :  erreur 
2. si la chaine est une string continuer
3. calculer la taille  de la chien

*/
public class Terre07 {
	public static void main(String[] args){
		if( args.length == 1 ) {
			String regex = "[0-9]+";
			String str = args[0];
			if ( str != null & str.matches(regex) ) {
				System.out.println("Erreur");
			} else {
				System.out.println(str.length());
			}
		} else {
			System.out.println("Erreur");
		}
	}
}
