import java.util.ArrayList;
import java.util.List;

public class Eau03 {

    public static List<Integer> calculerSuiteFibonacci(int n) {
        List<Integer> listeSuite = new ArrayList<>();
        listeSuite.add(0); // Premier élément de la suite
        listeSuite.add(1); // Deuxième élément de la suite

        for (int i = 2; i <= n; i++) {
            listeSuite.add(listeSuite.get(i - 1) + listeSuite.get(i - 2));
        }

        return listeSuite;
    }

    public static void main(String[] args) {
        if (args.length == 1 && isNumeric(args[0])) {
            int entree = Integer.parseInt(args[0]);
            List<Integer> listeSuite = calculerSuiteFibonacci(entree);

            System.out.println("Entrée : " + entree + " > " + listeSuite.get(entree));
        } else {
            System.out.println("Erreur argument");
        }
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
