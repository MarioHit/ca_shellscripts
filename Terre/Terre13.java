/**
 * Trouver la suisse
 *
 * faire un programme qui prend en entrée 3 entiers et qui trouver celui du milieu
 */
public class Terre13 {
    public static void main(String[] args) {

        if ( args.length != 3) {
            System.out.println("Erreur  il faut 3 argument " +args.length);
        } else {
            int init = 0;
            int initMax  = Integer.MIN_VALUE;
            int petit = Integer.MAX_VALUE;
            int grand = initMax;
            int milieu = init;
            for (String s: args) {
                if ( !isInteger(s)) {
                    System.out.println("Erreur : '"+s+"' n 'est pas un entier");
                } else {
                    int chiffre = Integer.parseInt(s);
                    petit = chiffre < petit ? chiffre : petit;
                    if (chiffre > petit ) {
                        if ( grand == initMax) {
                            milieu = chiffre;
                            grand = chiffre;
                        }
                        if ( chiffre < grand) {
                            milieu = chiffre;
                        }
                        if (chiffre > grand) {
                            milieu = grand;
                        }
                    }
                    grand = chiffre > grand ? chiffre : grand;
                    System.out.println( petit+" < "+ milieu + " < "+ grand);
                }
            }
            System.out.println(milieu);
        }
    }

    public static boolean isInteger( String s) {
        return s != null && s.matches("[0-9]+");
    }
}
