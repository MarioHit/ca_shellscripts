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
                    int racineProche = 0;
                    for (int x = 1; x <= carre / x; x++) {
                        racineProche = carre/x;
                        if (x * x == carre) {
                            racine = x;
                            System.out.println("racine de "+ i +"  = " + racine);
                        } else {
                            System.out.println(i+" > "+ x+"² = "+x*x+ " ~"+racineProche+" -->"+racineProche*racineProche);
                        }
                    }
                    if( racine == 0 ) {
                        System.out.println(i+" n'as pa de racine mais le plus proche est "+racineProche);
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
