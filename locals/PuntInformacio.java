package locals;

import java.util.Scanner;

public class PuntInformacio {
	
	private static final Scanner DADES = new Scanner(System.in);
	private String codi;
	private String nomResponsable;
	private int anyActual;
	private int quantitatPersones;

	/*
	 * TODO CONSTRUCTOR
	 * 
	 * Paràmetres: valors per tots els atributs de la classe, menys els arrays
	 * 
	 * Accions: - Assignar als atributs els valors passats com a paràmetres.
	 */
	public PuntInformacio(String codi, String nomResponsable, int anyActual, int quantitatPersones) {
		super();
		this.codi = codi;
		this.nomResponsable = nomResponsable;
		this.anyActual = anyActual;
		this.quantitatPersones = quantitatPersones;
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

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

	public int getAnyActual() {
		return anyActual;
	}

	public void setAnyActual(int anyActual) {
		this.anyActual = anyActual;
	}

	public int getQuantitatPersones() {
		return quantitatPersones;
	}

	public void setQuantitatPersones(int quantitatPersones) {
		this.quantitatPersones = quantitatPersones;
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari les dades per consola per crear un nou punt
	 * d'informació. Les dades a demanar són les que necessita el constructor. -
	 * També heu de tenir en compte que el nom del responsable seran el nom i
	 * cognoms, per tant, serà una frase com per exemple, "Biel Bestard".
	 * 
	 * Retorn: El nou punt d'informació creat.
	 */
	public static PuntInformacio addPuntInformacio() {
		String codi;
		String nomResponsable;
		int anyActual;
		int quantitatPersones;
		System.out.println("Introdueix el codi");
		codi = DADES.next();
		System.out.println("Introdueix el nom del responsable");
		DADES.nextLine();
		nomResponsable = DADES.nextLine();
		System.out.println("Introdueix l'any actual");
		anyActual = DADES.nextInt();
		System.out.println("Introdueix la quantitat de persones");
		quantitatPersones = DADES.nextInt();
		return new PuntInformacio(codi, nomResponsable, anyActual, quantitatPersones);
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari que introdueixi les noves dades del punt
	 * d'informació i modificar els atributs corresponents a aquest punt
	 * d'informació. - També heu de tenir en compte que el nom del responsable seran
	 * el nom i cognoms, per tant, serà una frase com per exemple, "Biel Bestard". -
	 * Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
	 * 
	 * Retorn: cap
	 */
	public void updatePuntInformacio() {

		System.out.println("El codi actual del Punt d'Informació és: " + codi);
		System.out.println("Introdueix el nou codi");
		codi = DADES.next();
		System.out.println("El nom del responsable actual del Punt d'Informació és: " + nomResponsable);
		System.out.println("Introdueix el nou nom del responsable");
		DADES.nextLine();
		nomResponsable = DADES.nextLine();
		System.out.println("L'any actual es " + anyActual);
		System.out.println("Introdueix el nou any");
		anyActual = DADES.nextInt();

	}

	public void showPuntInformacio() {
		System.out.println("\nLes dades del punt d'informació " + codi + " són:");
		System.out.println("\nNom: " + nomResponsable);
		System.out.println("\nAny actual: " + anyActual);
		System.out.println("\nQuantitat de persones que han demanat informació: " + quantitatPersones);
	}
}
