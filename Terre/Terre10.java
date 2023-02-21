/**
 * PROGRAMME QUI AFFICHE SI UN NOMBRE EST PREMIER OU PAS
 *
 * algo :
 *  1. vérifier si un nombre est un chiffre
 *  2. vérifier si un nombre est premier
 *      un nombre premier est divisible par lui même et par 1
 *      0 n'est pas un nombre premier car divisible par tous
 *      1 n'est pas un nombre premier car divisible que par lui même
 *      x divisible par y  =>  x % y  = 0
 *          1. gérer le cas du 0 et du 1
 *          2. vérifier que le seul modulo  = 0 sont 1 et le chiffre lui même
 */
public class Terre10 {
    public static void main(String[] args ) {
        for ( String i : args ) {
            if ( isNum(i)) {
                int x = Integer.parseInt(i);
                if( x == 0 || x == 1 ) {
                    System.out.println("Non "+x+ " n'est pas un nombre premier");
                } else {
                    int nbre = 0;
                    for(int y = 1; y <= x; y++) {
                        if ( x % y == 0) {
                            nbre++;
                        }
                    }
                    if( nbre == 2) {
                        System.out.println("Oui "+x+" est un nombre premier");
                    } else {
                        System.out.println("Non "+x+ " n'est pas un nombre premier");
                    }
                }
            } else {
                System.out.println("Erreur sur '"+i+"' : => Veuillez entrer un chiffre");
            }
        }
    }

    public static boolean isNum(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
