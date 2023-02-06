/*

l'alphabet à partir de n 

donc 

*/

public class Terre03 {
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrsuvwxyz";
		String[] alphaTab  = alpha.split("");
		String entree  = "";
		int posEntree = 0;
		if ( args.length > 0 ) {
			entree = args[0];
			// System.out.println(" ok  "+entree);
		} else {
			entree = "a";
		}
		for ( int i =0; i < alphaTab.length;i++) {
			//System.out.print(i);
			String a = alphaTab[i];
			if ( entree ==  "a") {
				System.out.print(a);
			} else {
				//System.out.println(entree+" in -- al"+alphaTab[i]);				
				if( entree.equalsIgnoreCase(a) ) {
					System.out.print(a);
					posEntree = i;
					//System.out.print("pos : "+posEntree+ "  i:  "+i);
				}
				if( posEntree > 0 && posEntree < i) {
					System.out.print(alphaTab[i]);
				}
			}
		}
		
	}
}
