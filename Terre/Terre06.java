/*
INverser une chaine 

Passer de 
	 "Hello world!"  à  !dlrow olleH
	"lehciM"  à Michel

*/

public class Terre06 {
	public static void main(String[] args) {
		String retour = "";
		if ( args.length > 0 ) {
			for ( String str : args ) {
				String[] entree = str.split("");
				for ( int i = entree.length-1; i >= 0; i--) {
					retour += entree[i];
				}
				retour += " ";
				System.out.println(retour);
			}
		}else {
			System.out.println("pas de mot en entrée");
		}
	}
}
