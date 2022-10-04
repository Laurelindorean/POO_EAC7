/*
* Classe que defineix una parada gastronòmica del mercat. Es defineixen pel seu 
* codi, nom, tipus de productes que ofereix i si té taules per menjar o no.
 */
package locals;

import java.util.Scanner;

/**
 *
 * @author Palmira
 */
public class ParadaG {
	private static final Scanner DADES = new Scanner(System.in);
	private String codi;
	private String nom;
	private String tipus;
	private boolean teTaula;

	/*
	 * TODO CONSTRUCTOR
	 * 
	 * Paràmetres: valors per tots els atributs de la classe.
	 * 
	 * Accions: - Assignar als atributs corresponents els valors passats com a
	 * paràmetres.
	 */
	public ParadaG(String codi, String nom, String tipus, boolean teTaula) {
		super();
		this.codi = codi;
		this.nom = nom;
		this.tipus = tipus;
		this.teTaula = teTaula;
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

	public boolean isTeTaula() {
		return teTaula;
	}

	public void setTeTaula(boolean teTaula) {
		this.teTaula = teTaula;
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari les dades per consola per crear una nova parada
	 * gastronòmica. Les dades a demanar són les que necessita el constructor. -
	 * També heu de tenir en compte que el nom o el tipus de producte poden ser una
	 * frase, per exemple, "Can Tomàs" o "Formatges i embotits". - En el cas de les
	 * taules, a l'usuari li hem de demanar que contesti "Sí" (Verdader) o "No"
	 * (Fals). De moment, en el cas d'aquest EAC, suposarem que sempre contesta "Sí"
	 * o "No".
	 * 
	 * Retorn: La nova parada gastronòmica creada.
	 */

	public static ParadaG addParadaG() {
		String codi;
		String nom;
		String tipus;
		boolean teTaula = true;
		String resposta;
		
		System.out.println("Introdueix el codi de la Parada Gastronòmica");
		codi = DADES.next();
		System.out.println("Introdueix el nom de la Parada Gastronòmica");
		DADES.nextLine();
		nom = DADES.nextLine();
		System.out.println("Introdueix el tipus de la Parada Gastronòmica");
		tipus = DADES.nextLine();
		System.out.println("Introdueix 'Si' o 'No' si la Parada disposa de taules per menjar");
		resposta = DADES.next();
		if (resposta.equalsIgnoreCase("Si")) {
			teTaula = true;
		}
		if (resposta.equalsIgnoreCase("No")) {
			teTaula = false;
		}
		return new ParadaG(codi, nom, tipus, teTaula);
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari que introdueixi les noves dades de la parada
	 * gastronòmica actual i modificar els atributs corresponents d'aquesta parada.
	 * - També heu de tenir en compte que el nom o el tipus de producte poden ser
	 * una frase, per exemple, "Can Tomàs" o "Formatges i embotits". - En el cas de
	 * les taules, a l'usuari li hem de mostrar "Sí" en cas que el valor sigui
	 * verdader i "No" en cas contrari. De la mateixa manera, a l'usuari li hem de
	 * demanar que contesti "Sí" (Verdader) o "No" (Fals). De moment, en el cas
	 * d'aquest EAC, suposarem que sempre contesta "Sí" o "No". - Li heu de mostrar
	 * a l'usuari els valors dels atributs abans de modificar-los.
	 * 
	 * Retorn: cap
	 */
	public void updateParadaG() {
		String resposta;
		
		System.out.println("El codi actual de la Parada Gastronòmica es " + codi);
		System.out.println("Introdueix el nou codi de la Parada Gastronòmica");
		codi = DADES.next();
		DADES.nextLine();
		System.out.println("El nom de la Parada Gastronòmica es " + nom);
		System.out.println("Introdueix el nou nom de la Parada Gastronòmica");
		nom = DADES.nextLine();
		if (teTaula) {
			resposta = "Si";
			System.out.print("La Parada te taules:" + resposta);
		} else {
			resposta = "No";
			System.out.print("La Parada te taules:" + resposta);
		}
		System.out.println("Introdueix 'Si' o 'No' si la Parada disposarà de taules per menjar");
		resposta = DADES.next();
		if (resposta.equalsIgnoreCase("Si")) {
			teTaula = true;
		}
		if (resposta.equalsIgnoreCase("No")) {
			teTaula = false;
		}

	}

	public void showParadaG() {
		System.out.println("\nLes dades de la parada gastronòmica amb codi " + codi + " són:");
		System.out.println("\nNom: " + nom);
		System.out.println("\nTipus de productes: " + tipus);
		System.out.println("\nLa parada gastronòmica ");

		if (teTaula) {
			System.out.print("sí ");
		} else {
			System.out.print("no ");
		}

		System.out.print("té taules.");
	}
}
