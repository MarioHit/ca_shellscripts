//package Eau;
import java.util.ArrayList;
import java.util.List;

/**
 * Créez un programme qui affiche le premier nombre premier supérieur au nombre donné en argument.
 */
public class Eau04 {


    private static boolean isNumeric(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }


    public static void main(String[] args) {

        returnProchainPremierNombre(args);

    }

    private static void returnProchainPremierNombre(String[] args) {
        if (args.length == 1 && isNumeric(args[0])){
            int entree = Integer.valueOf(args[0]) + 1;

            System.out.println("Prime is : "+ nextPremier(entree));
        }else {
            System.out.println("Erreur argument");
        }
    }


    private static int nextPremier(int entree) {
        boolean isEntreePrime = false;
        int prime = entree;
        while (isEntreePrime == false) {
            isEntreePrime = isPrime(entree);
            prime = entree;
            entree++;
        }
        return prime;
    }


    /**
     * qui calcule si un chiffre est premier ou pas
     * @param entree le chiffre qu'on veut vérifier s'il est premier
     * @return true ou false si l'entree est premier ou pas
     */
    public static boolean isPrime(int entree) {
        //on va d'abord determinter si c'est premier ou pas
        int multiples = 0;
        for(int i = 2; i<= entree; i++ ) {
            while ( i*i <= entree) {
                if( entree % i == 0) {
                    multiples++;
                }
                i++;
            }
            if ( multiples == 0 ) {
                return true;
            }
        }
        return false;
    }
}
