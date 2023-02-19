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
                    //System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre));
                    for (int x = 1; x <= (carre/x); x++) {
                        racineProche = x;
                        if (x * x == carre) {
                            racine = x;
                            System.out.println("racine de "+ i +" = " + racine);
                        } else {
                            //System.out.println(i+" > "+ x+"² = "+x*x+ " ~"+racineProche+" -->"+racineProche*racineProche);
                            //System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre));
                        }
                        System.out.println("- "+x*x);
                        if (x * x < carre ) {
                            racineP = x;
                            // System.out.println("haha x > "+x);
                        }
                    }
                    System.out.println(" Bas "+ racineProche +" -- GGOOD : "+ racineP);
                    if( racine == 0 ) {
                       //  System.out.println("~~ racine de "+ i +" ~ " + racineProche +" pour "+racineProche*racineProche +" ou " + (racineProche+1) +" pour "+(racineProche+1)*(racineProche+1));
                        // System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre));
                        double in = 0;
                        double in2 = 0;
                        double racineD2 = 0;
                        double rac = 0;
                        double racinePrD = Double.valueOf(racineProche) ;
                        double carreD = Double.valueOf(i);
                        double diff = Double.MAX_VALUE;
                        while ( racineD2 < carreD) {
                            double x = in / 10.0;
                            double racineD = racinePrD + x;
                            racineD2 = racineD*racineD;
                            double difference = carreD - racineD2;
                            if ( racineD2 < carreD) {
                                rac = racineD;
                            }
                            System.out.println(in2+" __ "+in+" - "+racineD +"² : "+ racineD2 +" ~ "+difference + " ~ "+carreD);
                            in += 0.1;
                            in2++;
                        }
                        System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre) +" : "+rac+"  pour à peu pres : "+rac*rac);
                    }
                    //System.out.println("---->racine de "+ i +" = " + Math.sqrt(carre) +" * :"+racine);
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
