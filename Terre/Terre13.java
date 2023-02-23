/**
 * Trouver la suisse
 *
 * faire un programme qui prend en entrée 3 entiers et qui trouver celui du milieu
 */
public class Terre13 {
    public static void main(String[] args) {

        boolean erreur = false;
        int init = 0;
        int milieu = init;
        String message = "Erreur : ";
        String arg = " ";
        for (String str :
                args) {
            arg += str+" ";
        }
        System.out.println("args:["+arg+"]");
        if ( args.length != 3) {
            message += "il faut 3 argument, ici (" +args.length+")";
            erreur = true;
        } else {
            int initMax  = Integer.MIN_VALUE;
            int initPetit = Integer.MAX_VALUE;
            int petit = initPetit;
            int grand = initMax;
            int[] num = new int[args.length];
            int inc = 0;
            for (String s: args) {
                if ( !isInteger(s)) {
                    message += "'"+s+"' n'est pas un entier";
                    erreur = true;
                    break;
                } else {
                    int chiffre = Integer.parseInt(s);
                    for (int i = 0; i < num.length; i++) {
                        if( num[i] == chiffre) {
                            message += "Pas de doublon SVP !!! ";
                            erreur = true;
                            break;
                        }
                    }
                    num[inc] = chiffre;
                    inc++;

                    if (petit == initPetit) {
                        milieu = chiffre;
                    }
                    petit = chiffre <= petit ? chiffre : petit;
                    if (chiffre > petit) {
                        if (grand == initMax) {
                            milieu = chiffre;
                            grand = chiffre;
                        }
                        if (chiffre < grand) {
                            milieu = chiffre;
                        }
                        if (chiffre > grand) {
                            milieu = grand;
                            grand = chiffre;
                        }
                    }
                    grand = chiffre > grand ? chiffre : grand;
                    // System.out.println(chiffre + " : " + petit + " < " + milieu + " < " + grand);

                }
            }
        }
        if(erreur) {
            System.out.println(message);
        } else {
            System.out.println(milieu);
        }
    }

    public static boolean isInteger( String s) {
        return s != null && s.matches("[0-9]+");
    }
}
