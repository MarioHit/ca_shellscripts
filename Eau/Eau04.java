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

            boolean prime = isProchainPrime(entree);
            
            System.out.println("Prime is : "+ nextPremier(entree));
        }else {
            System.out.println("Erreur argument");
        }
    }

    private static boolean isProchainPrime(int entree) {
        boolean prime = false;
        while (prime == false) {
            prime = isPrime(entree);
            entree++;
        }
        return prime;
    }

    private static int nextPremier(int entree) {
        boolean isPrime = false;
        int prime = entree;
        while (isPrime == false) {
            isPrime = isPrime(entree);
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
                //System.out.println("i : "+i+"² = "+i*i+" >>"+ entree);
                if( entree % i == 0) {
                    multiples++;
                }
                i++;
            }
            if ( multiples == 0 ) {
                System.out.println("-- "+entree+" IS PRIME");
                return true;
            }
        }
        //System.out.println("fin de la boucle  avec "+ multiples +" multiples, "+ entree +" est prime ? : "+ "non"+" : ++-");
        return false;
    }

    private static void isNextNumberPremier(int entree, List<Integer> premier, Boolean prime) {
        while(prime == false ) {
            //afficher la liste des nombres de 2 jusqu'à N
            for(int arg = entree +1; arg <= entree * entree; arg++ ) {

                int nombreMultiple = 0;
                //calcul de divisible
                while(premier.equals(true) ) {
                    for( int a = 2; a <arg; a++){

                        // while(nombreMultiple >2) {
                        if(arg%a == 0){
                            nombreMultiple++;
                        }
                        a++;
                        System.out.println(" - "+arg+ " modulo  "+a+" = "+arg%a+"  nb :"+nombreMultiple+" ++ "+a);
                        //}
                    }
                    if( nombreMultiple < 1 ) {
                        premier.add(arg);
                        System.out.println(" PREMIER");

                        break;
                    }
                }

            }
        }


        for( int prem: premier){
            System.out.print(prem + ",");
        }
    }

}
