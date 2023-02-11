/*
DIvisions  : 

Ecrivez un programme qui affiche le  résultat et le reste d'une division 
entre deux nombre

*/
public class Terre05 {
	public static void main(String[] args) {
		// récupération des arguments 
		int arg1 = 1;
		int arg2 = 1;
		if ( args.length > 0) {
			if( args[0] != null && args[0].matches("[0-9]")) {
				arg1 = Integer.valueOf(args[0]);
			}
			if( args[1] != null && args[1].matches("[0-9]")) {
				arg2 = Integer.valueOf(args[1]);
			}
			System.out.println(arg1+" div par "+arg2);
			System.out.println("Resulat: "+arg1/arg2);


		} else {
			System.out.println("Veullez mettre un argument!");
		}
	}
}
