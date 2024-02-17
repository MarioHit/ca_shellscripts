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

        /* création des 3 tableaux */
        int premierChiffre[] = {0,1,2,3,4,5,6,7,8,9};
        int deuxiemeChiffre[] = {0,1,2,3,4,5,6,7,8,9};
        int troisiemeChiffre[] = {0,1,2,3,4,5,6,7,8,9};

        /* création du tableu qui va contenir des résultat
        *  on va utiliser un arrylist car on ne connait pas la taille
        * */
        ArrayList<String> listeCombinaison = new ArrayList<>();

        /* création des indices pour chaque tableau
         */
        int indice1 = 0, indice2, indice3 = 0;

        /* création de la string qui va contenir le résultat*/
        String combinaisonx = "";


        // boucler sur le 1er tableu
        for (int x=0;x<=9;x++ ) {
            System.out.println("x_"+x);
            String combinaison = ""+x+"";
            for ( int y=x+1;y<=9;y++) {
                System.out.println("y_"+y);
                //vérifier qu'on passe au suicant
                if( y > x) {
                    combinaison = combinaison+""+y+"";
                }
                //System.out.println("combin xy :"+ combinaison);

                for(int z=y+1;z<=9;z++){
                    System.out.println("z_"+z);
                    //vérifier qu'on passe au suicant
                    if( z > y) {
                        combinaison = combinaison+""+z+"";
                        listeCombinaison.add(combinaison+",");
                        System.out.println(""+indice1+"--combin xyZ : x"+x+" y"+y+" z"+z+" : "+ combinaison);
                        combinaison = ""+x+y+"";
                        if( z == 9 ) {
                            combinaison = ""+x+"";
                        }
                        indice1++;


                    }

                }
                System.out.println(listeCombinaison.size());

            }
        }


        for( String comb: listeCombinaison) {
            System.out.print(comb);
        }

        System.out.println(listeCombinaison.size());
    }
}