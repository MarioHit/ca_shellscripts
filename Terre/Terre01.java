/*

créer un programme qui affiche son nom de fichier 


*/

public class Terre01 {
	public static void main(String[] args) {
		String nomFichier = "Terre01.java";
		System.out.println("00-name-"+Terre01.class.getName());
		System.out.println("00-type name -"+Terre01.class.getTypeName());
		afficher();

	}
	
	void afficher() {
		System.out.println("01-canonical -"+Terre01.class.getCanonicalName());
/*
		String className = this.getClass.getSimpleName();
		System.out.println("1. class: "+className);
		String className2 = this.getClass.getSuperClass.getName();
		System.out.println("2. class: "+className2);

		String canonicalClassName = this.getClass.getCanonicalName();
		System.out.println("2. canonical : "+canonicalClassName);
*/
	}
}
