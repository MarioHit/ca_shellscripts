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
			String[] entree = args[0].split("");
			for ( int i = entree.length-1; i >= 0; i--) {
				retour += entree[i];
			}
			System.out.println(retour);
		}else {
			System.out.println("pas de mot en entrée");
		}
	}
}
