/*
PAIR OU Impair

Proogramme qui permet de  déternminer si l'argument donné est un entier 
pair ou impair : 

doit être un int 
différent de  0 
par donc divisible par 2 avec reste 0

*/

public class Terre04 {
	public static void main(String[] args) {
		for (String i : args) {
			if( isNumeric(i) ){
				Integer in = Integer.valueOf(i);
				if ( in % 2 == 0) {
					System.out.println("Pair");
				} else {
					System.out.println("Impair");
				}
			} else {
				System.out.println("WESSSH C PAS UN CHIFFRE!!!");
			}
		}
	}
	private static boolean isNumeric(String str) {
		return str != null && str.matches("^-?\\+?[0-9]+");
	}
}
