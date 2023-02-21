public class Terre11 {
    public static void main(String[] args) {
        for( String s : args) {
            // vérifier le format
            if( isFormatDate(s)) {
                String[] data = s.split(":");
                int heures , heureSortie = 0;
                heures = Integer.parseInt(data[0]);
                boolean isPm = heures >= 12 ? true : false;
                String str = isPm? "PM":"AM";
                heures = isPm? heures -12 : heures;
                heureSortie = heures == 0 ? 12 : heures;
                String res = heureSortie+":"+data[1]+ str;
                System.out.println(s+" --> "+res);
            } else {
                System.out.println("Erreur : '"+s + "' n'est pas une date");
            }
        }
    }

    public static boolean isFormatDate(String str) {
        return str != null && str.matches("[0-9][0-9]:[0-9][0-9]");
    }
}
