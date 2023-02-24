/**
 * TRié OU PAS
 *
 * programme qui prend en entrée une suite d'entier
 * et vérifie si c'est trié ou pas
 *
 */
public class Terre14 {
    public static void main(String[] args) {
        boolean erreur = false;
        String messageErreur = "Erreur : ";
        boolean trie = false;
        boolean fin = false;

        while (erreur == false && fin == false) {
            System.out.println(" --- : "+Integer.MIN_VALUE+"  --"+args.length);
            if (args.length < 2) {
                messageErreur += " Mettez au moins 2 arguments!";
                erreur = true;
                break;
            } else {
                int lastValue = Integer.MIN_VALUE;
                for (String i : args) {
                    if (!isNum(i)) {
                        messageErreur += " Mettez au moins 2 arguments!";
                        erreur = true;
                        break;
                    } else {
                        int val = Integer.parseInt(i);
                        if( lastValue > val) {
                            trie = false;
                            break;
                        } else {
                            trie = true;
                        }
                        lastValue = val;

                    }
                    fin = true;
                }
            }
        }
        String message =  erreur ? messageErreur : trie? "Triéé !!" : "Pas Triéé";
        System.out.println(message);
    }

    public static boolean isNum(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
