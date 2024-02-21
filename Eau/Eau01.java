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
    }

    private static void afficherListe(ArrayList<String> listeCombinaison) {
        String resultat = String.join(", ", listeCombinaison);
        System.out.println(resultat);
        // System.out.println(listeCombinaison.size());
    }
}
