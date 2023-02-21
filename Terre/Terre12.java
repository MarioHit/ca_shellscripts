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
                boolean isHeure12 = heures == 12 ? true : false;
                boolean isAM = data[1].contains("A");
                boolean isPm  = !isAM;
                String minutes, heuresStr = "";
                if ( isPm) {
                    heuresStr = "" + (isHeure12 ? heures : heures + 12) ;
                    minutes = (data[1].split("P")[0]);
                } else {
                    heuresStr = isHeure12 ? "00" : heures +"";
                    minutes = (data[1].split("A")[0]);
                }
                String res = heuresStr+":"+minutes;
                System.out.println(i+" --> "+res);
            } else {
                System.out.println("Erreur : '"+i+"' n'est pas au bon format");
            }
        }
    }

    public static boolean isFormatAnglais(String str) {
        return str != null && str.matches("[0-9]?[0-9]:[0-9]{2}[AP]M");
    }
}
