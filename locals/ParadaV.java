package locals;

import java.util.Scanner;

public class ParadaV {
	
	private static final Scanner DADES = new Scanner(System.in);
	private String codi;
	private String nom;
	private String tipus;

	/*
	 * TODO CONSTRUCTOR
	 * 
	 * Paràmetres: valors per tots els atributs de la classe.
	 * 
	 * Accions: - Assignar als atributs corresponents els valors passats com a
	 * paràmetres.
	 */

	public ParadaV(String codi, String nom, String tipus) {
		super();
		this.codi = codi;
		this.nom = nom;
		this.tipus = tipus;
	}

	/*
	 * TODO Heu d'implementar tots els mètodes accessors possibles.
	 */

	public String getCodi() {
		return codi;
	}

	public void setCodi(String codi) {
		this.codi = codi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari les dades per consola per crear una nova parada
	 * de venda. Les dades a demanar són les que necessita el constructor. - També
	 * heu de tenir en compte que el nom o el tipus de producte poden ser una frase,
	 * per exemple, "Fresca" o "pasta fresca".
	 * 
	 * Retorn: La nova parada de venda creada.
	 */
	public static ParadaV addParadaV() {
		String codi;
		String nom;
		String tipus;

		System.out.println("Introdueix el codi de la Parada de Venda");
		codi = DADES.next();
		System.out.println("Introdueix el nom de la Parada de Venda");
		DADES.nextLine();
		nom = DADES.nextLine();
		System.out.println("Introdueix el tipus de la Parada de Venda");
		tipus = DADES.nextLine();
		return new ParadaV(codi, nom, tipus);
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari que introdueixi les noves dades de la parada de
	 * venda actual i modificar els atributs corresponents d'aquesta parada. - També
	 * heu de tenir en compte que el nom o el tipus de producte poden ser una frase,
	 * per exemple, "Fresca" o "Pasta fresca". - Li heu de mostrar a l'usuari els
	 * valors dels atributs abans de modificar-los.
	 * 
	 * Retorn: cap
	 */
	public void updateParadaV() {
		System.out.println("El codi actual de la Parada de Venda es: " + codi);
		System.out.println("Introdueix el nou codi per a la Parada");
		codi = DADES.next();
		System.out.println("El nom actual de la Parada de Venda es: " + nom);
		System.out.println("Introdueix el nou nom per a la Parada");
		DADES.nextLine();
		nom = DADES.nextLine();
		System.out.println("El tipus actual de la Parada de Venda es: " + tipus);
		System.out.println("Introdueix el nou tipus per a la Parada");
		tipus = DADES.nextLine();
	}

	public void showParadaV() {
		System.out.println("\nLes dades de la parada de venda amb codi " + codi + " són:");
		System.out.println("\nNom: " + nom);
		System.out.println("\nTipus de productes: " + tipus);
	}
}
