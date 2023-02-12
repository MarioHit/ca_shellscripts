/*
		PUISSANCE D'UN NOMBRE
un programme qui prend deux arguments a b et qui calcue a ^b
 sachant que b ne pourra pas être négatif

0. vérifier que nous avons deux entrées 
1. vérifier que ce sont des chiffres 
2. vérifier que b est  supérieur à 0
3. faire l'exposant 
*/

public class Terre08 {
	public static void main(String[] args) {

		if( args.length == 2 ) {
			int a = 0;
			int b = 0; 
			String strA = args[0];
			String strB = args[1];

			if( isNumeric(strA) && isNumeric(strB) ) {
				a = Integer.parseInt(strA);
				b = Integer.parseInt(strB);
				if( b>0 ) {
					int result = 1;
					for ( int i=0; i< b; i++){
						result *= a;
					}
					System.out.println(result);
				} else {
					System.out.println("Erreur "+strB +" negaatif ");
 				}
			 } else {
		 		System.out.println("Erreur "+strA +" & "+strB);
			 }
		} else {
			System.out.println("Erreur nombre entrée");
		}
	}
	public static boolean isNumeric(String s) {
		String intRegex = "^-?\\+?[0-9]+";
		return s != null & s.matches(intRegex);
	}
}
