import java.util.ArrayList;
import java.util.List;

/**
 * Créez un programme qui affiche le premier nombre premier supérieur au nombre donné en argument.
 */
public class Eau04 {

    private static boolean prime;

    private static boolean isNumeric(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }


    public static void main(String[] args) {

        if (args.length == 1 && isNumeric(args[0])){
            int entree = Integer.valueOf(args[0]) + 1;
            List<Integer> premier = new ArrayList<>();

            prime = isPrimeAvecRacine(entree);

            boolean prime2 = isPrime(entree);

            System.out.println("frist: "+prime+" second : "+prime2);


            //isNextNumberPremier(entree, premier, prime);
        }else {
            System.out.println("Erreur argument");
        }

    }

    private static boolean isPrimeAvecRacine(int entree) {
        //calcul de la racine
        double racineEntree = Math.sqrt(entree);

        //nombre multiples
        int multiples =0;


        for(int ent = entree +1 ; ent <= entree*entree; ent++) {
            if( isPrime(entree)) {
                System.out.println("____ "+ent+"___");
                return true;
            }
        }
        return false;

    }

    /**
     * qui calcule si un chiffre est premier ou pas
     * @param entree
     * @return
     */
    private static boolean isPrime(int entree) {
        //on va d'abord determinter si c'est premier ou pas
        int a = 0;
        int multiples = 0;
        for(int i = 2; i<= entree; i++ ) {
            while ( i*i <= entree) {
                System.out.println("i : "+i+"² = "+i*i+" >>"+ entree);
                if( entree % i == 0) {
                    multiples++;
                }
                i++;
                a++;
            }
            if ( multiples == 0 ) {
                System.out.println("-- "+entree+" IS PRIME");
                return true;
            }
        }
        System.out.println("fin de la boucle  avec "+ multiples +" multiples, "+ entree +" est prime ? : "+ "non"+" : ++-"+a);
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
