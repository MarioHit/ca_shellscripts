/**
 *   12 TO 24H
 *
 *   passe d'une date au format am / pm au format 24h
 *
 */
public class Terre12 {
    public static void main(String[] args) {
        for (String i : args) {
            if( isFormatAnglais(i)) {
                String[] data = i.split(":");
                int heures = Integer.parseInt(data[0]);
                boolean isAM = data[1].contains("A");
                boolean isPm  = !isAM;
                int minutes = 0;
                if ( isPm) {
                    heures = heures == 12 ? heures : heures + 12;
                    minutes = Integer.parseInt(data[1].split("P")[0]);
                } else {
                    heures = heures == 12 ? 0 :heures;
                    minutes = Integer.parseInt(data[1].split("A")[0]);
                }

                String res = (heures == 0 ? "00" : heures)+":"+(minutes == 0 ? "00" : heures);
                System.out.println(i+" --> "+res);


                //11:40 11:40AM 2:40 11:40PM 12:40PM 12:40AM 8:40PM 3:40PM 12:00AM 12:00PM 12:32PM 11:59AM 11:59PM
            } else {
                System.out.println("Erreur : "+i+" n'est pas au bon format");
            }
        }
    }

    public static boolean isFormatAnglais(String str) {
        return str != null && str.matches("[0-9]{2}:[0-9]{2}[AP]M");
    }
}
