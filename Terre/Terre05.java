/*
DIvisions  : 

Ecrivez un programme qui affiche le  résultat et le reste d'une division 
entre deux nombre

*/
public class Terre05 {
	public static void main(String[] args) {
		// récupération des arguments 
		int arg1 = 0;
		int arg2 = 0;
		String intRegEx =  "^-?\\+?[0-9]+";
		if ( args.length == 2) {
			if( args[0] != null && args[0].matches(intRegEx)) {
				arg1 = Integer.valueOf(args[0]);
			}
			if( args[1] != null && args[1].matches(intRegEx)) {
				arg2 = Integer.valueOf(args[1]);
			}
			if ( arg1 != 0 && arg2 != 0) {
				System.out.println(arg1+" div par "+arg2);
				int result = arg1/arg2;
				int reste = arg1 % arg2;
				System.out.println("Resulat: "+result);
				System.out.println("Reste: "+reste);
			}else {
				System.out.println(arg1+" div par "+arg2);
				System.out.println("Erreur");
			}


		} else {
			System.out.println("Veullez mettre deux arguments!");
		}
	}
}
