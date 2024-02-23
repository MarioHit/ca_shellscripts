import java.util.ArrayList;

/**
 * Combinaisons de 3 chiffres
 *
 * affiche toutes les différentes combinaisons possibles de 3 chiffres dans l'ordre croissant.
 *- les fonction utilisés
 * - la gestion de l’erreur
 * - le parsing
 * - la résolution
 * - affichage du résultat
 */
public class Eau00 {
    public static void main(String[] args) {
        combinaisonTroisChiffre();
    }

    private static void combinaisonTroisChiffre() {

        long startTime = System.nanoTime();

        /* création du tableu qui va contenir des résultat
        *  on va utiliser un arrylist car on ne connait pas la taille
        * */
        ArrayList<String> listeCombinaison = new ArrayList<>();

        // boucler sur le 1er tableu
        for (int x=0;x<=9;x++ ) {
            String combinaison = ""+x+"";
            for ( int y=x+1;y<=9;y++) {
                if( y > x) {
                    combinaison = combinaison+""+y+"";
                }
                for(int z=y+1;z<=9;z++){
                    if( z > y) {
                        listeCombinaison.add(combinaison+""+z);
                        //System.out.println("combin xyZ : x"+x+" y"+y+" z"+z+" : "+ combinaison);
                        // on remet  à zéro pour les dernier chiffre
                        if( z == 9 ) {
                            combinaison = ""+x+"";
                        }
                    }
                }
            }
        }

        afficherListe(listeCombinaison);
        long endTime = System.nanoTime();

        // Calculer la durée en convertissant les nanosecondes en secondes
        long duration = (endTime - startTime);  // Durée en nanosecondes
        System.out.println("\nTemps d'exécution: " + duration + " nanosecondes");
        // Ou convertir la durée en millisecondes pour une meilleure lisibilité
        System.out.println("Temps d'exécution: " + duration/1000000 + " millisecondes");
    }

    private static void afficherListe(ArrayList<String> listeCombinaison) {
        String resultat = String.join(", ", listeCombinaison);
        System.out.println(resultat);
    }
}