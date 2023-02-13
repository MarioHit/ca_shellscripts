/*
*        RACINE CARRE d'un nombre
*
* */

public class Terre09 {
    public static void main(String[] args) {
        if ( args.length > 0 ) {
            for (String i : args) {
                // vérifier que c'est un chiffre
                if (isNum(i)) {
                    // le mettre sous format int
                    int carre = Integer.parseInt(i);
                    //calcul de la racine carré :
                    // multiplier les entier par eux memes jusqu'à depasser
                    // enlever le dernier qui correspond
                    // x² = carre , x= carre/x , x*x = carre
                    int racine = 0;
                    for (int x = 1; x <= carre / x; x++) {
                        if (x * x == carre) {
                            racine = x;
                            System.out.println("racine de "+ i +"  = " + racine);
                        }
                        // System.out.println(i+" : "+ x+""+ " - " + racine);
                    }
                } else {
                    System.out.println("Erreur : " + i);
                }
            }
        } else {
            System.out.println("Erreur :  pas d'argument" );
        }

    }
    public static boolean isNum(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
