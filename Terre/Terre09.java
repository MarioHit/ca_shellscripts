/*
*        RACINE CARRE d'un nombre
*
* */

public class Terre09 {
    public static void main(String[] args) {
        if ( args.length > 0 ) {
            for (String i : args) {
                // vérifier que c'est un chiffre
                if (isNum(i)) {
                    // le mettre sous format int
                    int carre = Integer.parseInt(i);
                    //calcul de la racine carré :
                    // multiplier les entier par eux memes jusqu'à depasser
                    // enlever le dernier qui correspond
                    // x² = carre , x= carre/x , x*x = carre
                    int racine = 0;
                    int racineProche = 0;
                    int racineP = 0;
                    for (int x = 1; x <= (carre/x); x++) {
                        racineProche = x;
                        if (x * x == carre) {
                            racine = x;
                            System.out.println("racine de "+ i +" = " + racine);
                        } else {
                            //System.out.println(i+" > "+ x+"² = "+x*x+ " ~"+racineProche+" -->"+racineProche*racineProche);
                            //System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre));
                        }
                        // System.out.println("- "+x*x);
                        if (x * x < carre ) {
                            racineP = x;
                            //System.out.println("- "+i+"  -haha x > "+x);
                        }
                    }
                    if( racine == 0 ) {
                        System.out.println("racine de "+ i +" = "+racineProche+" ~ "+racineProche*racineProche +" ("+ Math.sqrt(carre) +")");
                        double in = 0;
                        double inm = 0;
                        int in2 = 0;
                        int in3 = 0;
                        double racineD2 = 0;
                        double racCentaine = 0;
                        double racMil = 0;
                        double racinePrD = Double.valueOf(racineProche) ;
                        double carreD = Double.valueOf(i);
                        double diff = Double.MAX_VALUE;
                        while ( racineD2 < carreD) {
                            double x = in / 10.0;
                            double racineD = racinePrD + x;
                            racineD2 = racineD*racineD;
                            double difference = carreD - racineD2;
                            if ( racineD2 < carreD) {
                                racCentaine = racineD;
                            }
                            // System.out.println(in2+" __ "+in+" - "+racineD +"² : "+ racineD2 +" ~ "+difference + " ~ "+carreD);
                            in += 0.1;
                            in2++;
                        }
                        System.out.println("-racine de "+ i +" = "+racCentaine+" ~ "+racCentaine*racCentaine +" ("+ Math.sqrt(carre) +")");
                        double carreCentaine = racCentaine * racCentaine;
                        while ( carreCentaine < carreD) {
                            double x = inm / 10.0;
                            double racineD = racCentaine + x;
                            carreCentaine = racineD*racineD;
                            double difference = carreD - racineD2;
                            if ( carreCentaine < carreD) {
                                racMil = racineD;
                            }
                            // System.out.println("**"+in3+" __ "+inm+" - "+carreCentaine +"² : "+ racineD2 +" ~ "+difference + " ~ "+carreD);
                            inm += 0.001;
                            in3++;
                        }
                        System.out.println("--racine de "+ i +" = " +racMil+" ~ "+racMil*racMil +" ("+ Math.sqrt(carre) +")");

                    }
                } else {
                    System.out.println("Erreur : " + i);
                }
            }
        } else {
            System.out.println("Erreur :  pas d'argument" );
        }

    }
    public static boolean isNum(String str) {
        return str != null && str.matches("^-?\\+?[0-9]+");
    }
}
