package Principal;

import java.util.Scanner;

import locals.ParadaG;
import locals.ParadaV;
import locals.PuntInformacio;

public class Mercat {
	private static final Scanner DADES = new Scanner(System.in);
	private int codi;
	private static int codiSeguent = 0;
	private String nom;
	private String adreca;
	private ParadaV[] paradesV = new ParadaV[50];
	private int pParadesV = 0; // Priemra posició buida de l'array de parades de venda
	private ParadaG[] paradesG = new ParadaG[50];
	private int pParadesG = 0; // Priemra posició buida de l'array de parades gastronòmiques
	private PuntInformacio[] puntsInformacio = new PuntInformacio[10];
	private int pPuntsInformacio = 0; // Priemra posició buida de l'array de punts d'informació

	/*
	 * TODO CONSTRUCTOR
	 * 
	 * Paràmetres: valors per tots els atributs de la classe menys els arrays.
	 * 
	 * Accions: - Assignar als atributs corresponents els valors passats com a
	 * paràmetres. - Al codi li hem d'assignar el valor de l'atribut codiSeguent,
	 * per després augmentar en 1 aquest atribut.
	 */
	public Mercat(String nom, String adreca) {
		super();
		this.codi = codiSeguent;
		this.codiSeguent += 1;
		this.nom = nom;
		this.adreca = adreca;
	}

	/*
	 * TODO Heu d'implementar tots els mètodes accessors possibles.
	 */
	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public ParadaV[] getParadesV() {
		return paradesV;
	}

	public void setParadesV(ParadaV[] paradesV) {
		this.paradesV = paradesV;
	}

	public int getpParadesV() {
		return pParadesV;
	}

	public void setpParadesV(int pParadesV) {
		this.pParadesV = pParadesV;
	}

	public ParadaG[] getParadesG() {
		return paradesG;
	}

	public void setParadesG(ParadaG[] paradesG) {
		this.paradesG = paradesG;
	}

	public int getpParadesG() {
		return pParadesG;
	}

	public void setpParadesG(int pParadesG) {
		this.pParadesG = pParadesG;
	}

	public PuntInformacio[] getPuntsInformacio() {
		return puntsInformacio;
	}

	public void setPuntsInformacio(PuntInformacio[] puntsInformacio) {
		this.puntsInformacio = puntsInformacio;
	}

	public int getpPuntsInformacio() {
		return pPuntsInformacio;
	}

	public void setpPuntsInformacio(int pPuntsInformacio) {
		this.pPuntsInformacio = pPuntsInformacio;
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari les dades per consola per crear un nou punt
	 * d'informació. Les dades a demanar són les que passem per paràmetre en el
	 * constructor. - També heu de tenir en compte que el nom i l'adreça, poden ser
	 * una frase, per exemple, "Mercat Nou" o "C/ Principal, 1".
	 * 
	 * Retorn: El nou taller creat.
	 */
	public static Mercat addMercat() {
		String nom, adreca;

		System.out.println("Introdueix el nom del Mercat");
		nom = DADES.nextLine();
		System.out.println("Introdueix l'adreça del Mercat");
		adreca = DADES.nextLine();
		return new Mercat(nom, adreca);
	}

	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Demanar a l'usuari que introdueixi les noves dades del mercat i
	 * modificar els atributs corresponents d'aquest mercat. Els únics atributs que
	 * modificarem són els que hem inicialitzat en el constructor amb els paràmetres
	 * passats. - També heu de tenir en compte que el nom i l'adreça, poden ser una
	 * frase, per exemple, "Mercat Nou" o "C/ Principal, 1". - Li heu de mostrar a
	 * l'usuari els valors dels atributs abans de modificar-los.
	 * 
	 * Retorn: cap
	 */
	public void updateMercat() {

		System.out.println("El nom del Mercat es " + nom);
		System.out.println("Introdueix el nou nom del Mercat");
		nom = DADES.nextLine();
		System.out.println("L'adreça del Mercat es " + adreca);
		System.out.println("Introdueix la nova adreça del Mercat");
		adreca = DADES.nextLine();
	}

	public void showMercat() {
		System.out.println("\nL'adreça del mercat " + nom + " és " + adreca);
	}

	/*
	 * PUNT D'INFORMACIÓ
	 */
	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Afegeix un nou punt d'informació a l'array de punts d'informació
	 * del mercat actual si aquest no existeix. Per afegir-lo heu de fer servir el
	 * mètode de la classe PuntInformacio escaient i per comprovar la seva
	 * existència el mètode d'aquesta classe que ens ajuda en aquesta tasca. -
	 * Actualitza la posició de l'array de punts d'informació si s'afegeix el punt
	 * d'informació. - Mostra el missatge "El punt d'informació ja existeix" si no
	 * s'ha afegit el punt d'informació.
	 * 
	 * Retorn: cap
	 */
	public void addPuntInformacio() {
		PuntInformacio nouPunt = PuntInformacio.addPuntInformacio();
		if (selectPuntInformacio(nouPunt.getCodi()) == -1) {
			puntsInformacio[pPuntsInformacio] = nouPunt;
			pPuntsInformacio++;
		} else {
			System.out.println("El Punt d'Informació ja existeix.");
		}

	}

	public int selectPuntInformacio(String codi) {

		if (codi == null) {
			System.out.println("\nCodi del punt d'informació?:");
			codi = DADES.next();
		}

		for (int i = 0; i < pPuntsInformacio; i++) {
			if (puntsInformacio[i].getCodi().equals(codi)) {
				return i;
			}
		}

		return -1;
	}

	/*
	 * PARADA DE VENDA
	 */
	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Afegeix una nova parada de venda a l'array de parades de venda del
	 * mercat actual si aquesta no existeix. Per afegir-la heu de fer servir el
	 * mètode de la classe ParadaV escaient i per comprovar la seva existència el
	 * mètode d'aquesta classe que ens ajuda en aquesta tasca. - Actualitza la
	 * posició de l'array de parades de venda si s'afegeix la parada de venda. -
	 * Mostra el missatge "La parada de venda ja existeix" si no s'ha afegit la
	 * parada de venda.
	 * 
	 * Retorn: cap
	 */
	public void addParadaV() {
		ParadaV novaParadaV = ParadaV.addParadaV();
		if (selectParadaV(novaParadaV.getCodi()) == -1) {
			paradesV[pParadesV] = novaParadaV;
			pParadesV++;
		} else {
			System.out.println("La Parada de Venda ja existeix.");
		}

	}

	public int selectParadaV(String codi) {

		if (codi == null) {
			System.out.println("\nCodi de la parada de venda?:");
			codi = DADES.next();
		}

		for (int i = 0; i < pParadesV; i++) {
			if (paradesV[i].getCodi().equals(codi)) {
				return i;
			}
		}

		return -1;
	}

	/*
	 * PARADA GASTRONÒMICA
	 */
	/*
	 * TODO
	 * 
	 * Paràmetres: cap
	 * 
	 * Accions: - Afegeix una nova parada gastronòmica a l'array de parades
	 * gastronòmiques del mercat actual si aquesta no existeix. Per afegir-la heu de
	 * fer servir el mètode de la classe ParadaG escaient i per comprovar la seva
	 * existència el mètode d'aquesta classe que ens ajuda en aquesta tasca. -
	 * Actualitza la posició de l'array de parades parada gastronòmiques si
	 * s'afegeix la parada parada gastronòmica. - Mostra el missatge
	 * "La parada parada gastronòmica ja existeix" si no s'ha afegit la parada
	 * parada gastronòmica.
	 * 
	 * Retorn: cap
	 */
	public void addParadaG() {
		ParadaG novaParadaG = ParadaG.addParadaG();
		if (selectParadaG(novaParadaG.getCodi()) == -1) {
			paradesG[pParadesG] = novaParadaG;
			pParadesG++;
		} else {
			System.out.println("La Parada Gastronòmica ja existeix.");
		}
	}

	public int selectParadaG(String codi) {

		if (codi == null) {
			System.out.println("\nCodi de la parada gastronòmica?:");
			codi = DADES.next();
		}

		for (int i = 0; i < pParadesG; i++) {
			if (paradesG[i].getCodi().equals(codi)) {
				return i;
			}
		}

		return -1;
	}
}
