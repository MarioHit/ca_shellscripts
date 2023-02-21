public class Terre11 {
    public static void main(String[] args) {
        for( String s : args) {
            // vérifier le format
            if( isFormatDate(s)) {
                String[] data = s.split(":");
                int hh , hhCalc, hhFinal = 0;
                hh = Integer.parseInt(data[0]);
                //hhCalc = Integer.parseInt(data[1]);
                String hhStr , mmStr , str= "";
                boolean isPm = hh >= 12 ? true : false;
                if ( isPm ) {
                    hhCalc = hh - 12;
                } else {
                    hhCalc = hh;
                }
                str = isPm? "PM":"AM";
                System.out.println(" heure : "+hhCalc);
                if(hhCalc == 0) {
                    hhFinal = 12;
                } else {
                    hhFinal = hhCalc;
                }


                String res = hhFinal+":"+data[1]+ str;
                System.out.println(s+" --> "+res);
            } else {
                System.out.println("Erreur : '"+s + "' n'est pas une date");
            }
        }
    }

    public static boolean isFormatDate(String str) {
        return str != null && str.matches("[0-9][0-9]:[0-9][0-9]");
    }

    public static boolean isNum(String str) {
        return str != null && str.matches("[0-9][0-9]");
    }
}
