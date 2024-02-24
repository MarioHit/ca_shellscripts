import java.util.ArrayList;
import java.util.List;

/**
 *Créez un programme qui affiche le N-ème élément de la célèbre suite de Fibonacci. (0, 1, 1, 2) étant le début de la suite et le premier élément étant à l’index 0.
 */

public class Eau03 {
    public static void main(String[] args) {
        List<Integer> listeSuite = new ArrayList<>();
        listeSuite.add(0,0);
        listeSuite.add(1,1);

        if (args.length == 1 && isNumeric(args[0])){
            //prendre le chiffre en entrée
            int entrée = Integer.valueOf(args[0]);;
            // remplir le tableau
            for ( int a = 2; a <= entrée; a++) {
                listeSuite.add(a, (listeSuite.get(a-1) + listeSuite.get(a-2)));
            }

            // Affichage du debug
            for( int i : listeSuite) {
                System.out.print(i+", ");
            }
            System.out.println("\nentréé  : "+entrée+"  > "+listeSuite.get(entrée));


            // affichage du résultat
            System.out.println(listeSuite.get(entrée));

        } else {
            System.out.println("Erreur argument");
        }

    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
