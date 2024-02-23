import java.util.ArrayList;

/**
 * Combinaisons de 2 chiffres
 *
 * affiche toutes les différentes combinaisons possibles de 2 chiffres dans l'ordre croissant.
 *- les fonction utilisés
 * - la gestion de l’erreur
 * - le parsing
 * - la résolution
 * - affichage du résultat
 */
public class Eau01 {
    public static void main(String[] args) {

        afficherCombinasons2nombre();


    }

    private static void afficherCombinasons2nombre() {
        Long startTime = System.nanoTime();
        Long startTime2 = System.currentTimeMillis();
        // création du tableau qui va contenir les combinaisons
        ArrayList<String> listeCombinaison = new ArrayList<>();

        //affichage du premier nombre
        for( int premierNbr = 0; premierNbr <=9 ; premierNbr++) {
            // création de la variable qui va contenir une combinaison
            String combinaison = Integer.toString(premierNbr);
            //boucler sur le 2eme tableau
            for( int deuxiemeNbr = premierNbr+1; deuxiemeNbr <=9 ; deuxiemeNbr++) {
                listeCombinaison.add( combinaison + Integer.toString(deuxiemeNbr));
            }
        }
        afficherListe(listeCombinaison);
        long endTime = System.nanoTime();
        System.out.println(System.nanoTime() - startTime );
        System.out.println(System.currentTimeMillis() - startTime2 );


        // Calculer la durée en convertissant les nanosecondes en secondes
        long duration = (endTime - startTime);  // Durée en nanosecondes
        System.out.println("\nTemps d'exécution: " + duration + " nanosecondes");
        // Ou convertir la durée en millisecondes pour une meilleure lisibilité
        System.out.println("Temps d'exécution: " + duration/1000000 + " millisecondes");
    }

    private static void afficherListe(ArrayList<String> listeCombinaison) {
        String resultat = String.join(", ", listeCombinaison);
        System.out.println(resultat);
        // System.out.println(listeCombinaison.size());
    }
}
