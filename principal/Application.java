package principal;

import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Palmira
 */
public class Application {

	private static final Scanner DADES = new Scanner(System.in);
	private static Mercat[] mercats = new Mercat[15];
	private static int pMercats = 0; // Priemra posició buida del vector mercats
	private static Mercat mercatActual = null;

	public static void main(String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {
		int opcio = 0;

		do {
			System.out.println("\nSelecciona una opció");
			System.out.println("\n0. Sortir");
			System.out.println("\n1. Gestió de mercats");
			System.out.println("\n2. Gestió de punts d'informació");
			System.out.println("\n3. Gestió de parades gastronòmiques");
			System.out.println("\n4. Gestió de parades de venda");
			opcio = DADES.nextInt();

			switch (opcio) {
			case 0:
				break;
			case 1:
				menuMercats();
				break;
			case 2:
				if (mercatActual != null) {
					menuPuntsInformacio();
				} else {
					System.out.println("\nPrimer s'ha de seleccionar el mercat al menú Gestió de mercats");
				}
				break;
			case 3:
				if (mercatActual != null) {
					menuParadesGastronomiques();
				} else {
					System.out.println("\nPrimer s'ha de seleccionar el mercat al menú Gestió de mercats");
				}
				break;
			case 4:
				if (mercatActual != null) {
					menuParadesVenda();
				} else {
					System.out.println("\nPrimer s'ha de seleccionar el mercat al menú Gestió de mercats");
				}
				break;
			default:
				System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
				break;
			}
		} while (opcio != 0);
	}

	public static void menuMercats() {
		int opcio;

		do {
			int indexSel;
			System.out.println("\nSelecciona una opció");
			System.out.println("\n0. Sortir");
			System.out.println("\n1. Alta");
			System.out.println("\n2. Seleccionar");
			System.out.println("\n3. Modificar");
			System.out.println("\n4. Llista de mercats");
			opcio = DADES.nextInt();
			switch (opcio) {
			case 0:
				break;
			case 1:
				mercats[pMercats] = Mercat.addMercat();
				pMercats++;
				break;
			case 2:
				indexSel = selectMercat();
				if (indexSel >= 0) {
					mercatActual = mercats[indexSel];
				} else {
					System.out.println("\nNo existeix aquest mercat");
				}
				break;
			case 3:
				indexSel = selectMercat();
				if (indexSel >= 0) {
					mercats[indexSel].updateMercat();
				} else {
					System.out.println("\nNo existeix aquest mercat");
				}
				break;
			case 4:
				for (int i = 0; i < pMercats; i++) {
					mercats[i].showMercat();
				}
				break;
			default:
				System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
				break;
			}
		} while (opcio != 0);
	}

	/*
	 * TODO Heu de desenvolupar el menuPuntsInformacio amb les opcions que podeu
	 * veure. Nota: penseu que quan arribem aquí, l'atribut mercatActual no és null
	 * 
	 * Opció 0. Sortir --> Surt del menú i retorna al menú principal Opció 1. Alta
	 * --> Crea un punt d'informació del mercat actual. Penseu que Mercat sap crear
	 * punts d'informació Opció 2. Modificar --> Permet modificar un punt
	 * d'informació del mercat actual (per comprovar l'existència del punt
	 * d'informació tenim un mètode en la classe Mercat que ens ajuda) Opció 3.
	 * Llista de punt d'informació--> Imprimeix les dades dels punts d'informació
	 * del mercat actual
	 * 
	 * A més, heu de fer una estructura iterativa per tornar a mostrar el menú
	 * sempre que no es premi l'opció 0 de sortida Recomanacions: - estructura de
	 * control switch-case per bifurcar les opcions - si no s'ha introduït cap opció
	 * de les de la llista, s'ha de mostrar el missatge
	 * "S'ha de seleccionar una opció correcta del menú." - definiu una variable
	 * opcio de tipus enter
	 */
	public static void menuPuntsInformacio() {
		int opcio;
		do {
			System.out.println("\nSelecciona una opció");
			System.out.println("\n0. Sortir");
			System.out.println("\n1. Alta");
			System.out.println("\n2. Modificar");
			System.out.println("\n3. Llista de punts d'informació");

			opcio = DADES.nextInt();

			switch (opcio) {
			case 0:
				break;
			case 1:
				mercatActual.addPuntInformacio();
				break;
			case 2:
				int pos = mercatActual.selectPuntInformacio(null);
				if (pos != -1) {
					mercatActual.getPuntsInformacio()[pos].updatePuntInformacio();

				} else {
					System.out.println("Aquest Punt d'Informació no existeix");
				}
				break;
			case 3:

				for (int i = 0; i < mercatActual.getpPuntsInformacio(); i++) {
					mercatActual.getPuntsInformacio()[i].showPuntInformacio();
				}

				break;
			default:
				System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
				break;
			}
		} while (opcio != 0);

	}

	/*
	 * TODO Heu de desenvolupar el menuParadesGastronomiques amb les opcions que
	 * podeu veure. Nota: penseu que quan arribem aquí, l'atribut mercatActual no és
	 * null
	 * 
	 * Opció 0. Sortir --> Surt del menú i retorna al menú principal Opció 1. Alta
	 * --> Crea una parada gastronòmica del mercat actual. Penseu que Mercat sap
	 * crear parades gastronòmiques Opció 2. Modificar --> Permet modificar una
	 * parada gastronòmica del mercat actual (per comprovar l'existència de la
	 * parada gastronòmica tenim un mètode en la classe Mercat que ens ajuda) Opció
	 * 3. Llista de parades gastronòmiques--> Imprimeix les dades de les parades
	 * gastronòmiques del mercat actual
	 * 
	 * A més, heu de fer una estructura iterativa per tornar a mostrar el menú
	 * sempre que no es premi l'opció 0 de sortida Recomanacions: - estructura de
	 * control switch-case per bifurcar les opcions - si no s'ha introduït cap opció
	 * de les de la llista, s'ha de mostrar el missatge
	 * "S'ha de seleccionar una opció correcta del menú." - definiu una variable
	 * opcio de tipus enter
	 */
	public static void menuParadesGastronomiques() {
		int opcio;
		do {

			System.out.println("\nSelecciona una opció");
			System.out.println("\n0. Sortir");
			System.out.println("\n1. Alta");
			System.out.println("\n2. Modificar");
			System.out.println("\n3. LLista de Parades Gastronòmiques");
			opcio = DADES.nextInt();
			DADES.nextLine();
			switch (opcio) {
			case 0:
				break;
			case 1:
				mercatActual.addParadaG();
				break;
			case 2:
				int pos = mercatActual.selectParadaG(null);
				if (pos != -1) {
					mercatActual.getParadesG()[pos].updateParadaG();

				} else {
					System.out.println("Aquests Parada Gastronòmica no existeix");
				}
				break;
			case 3:
				for (int i = 0; i < mercatActual.getpParadesG(); i++) {
					mercatActual.getParadesG()[i].showParadaG();
				}
				break;

			default:
				System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
				break;
			}
		} while (opcio != 0);
	}

	/*
	 * TODO Heu de desenvolupar el menuParadesVenda amb les opcions que podeu veure.
	 * Nota: penseu que quan arribem aquí, l'atribut mercatActual no és null
	 * 
	 * Opció 0. Sortir --> Surt del menú i retorna al menú principal Opció 1. Alta
	 * --> Crea una parada de venda del mercat actual. Penseu que Mercat sap crear
	 * parades de venda Opció 2. Modificar --> Permet modificar una parada de venda
	 * del mercat actual (per comprovar l'existència de la parada de venda tenim un
	 * mètode en la classe Mercat que ens ajuda) Opció 3. Llista de parades de
	 * venda--> Imprimeix les dades de les parades de venda del mercat actual
	 * 
	 * A més, heu de fer una estructura iterativa per tornar a mostrar el menú
	 * sempre que no es premi l'opció 0 de sortida Recomanacions: - estructura de
	 * control switch-case per bifurcar les opcions - si no s'ha introduït cap opció
	 * de les de la llista, s'ha de mostrar el missatge
	 * "S'ha de seleccionar una opció correcta del menú." - definiu una variable
	 * opcio de tipus enter
	 */
	public static void menuParadesVenda() {
		int opcio;

		do {
			System.out.println("\nSelecciona una opció");
			System.out.println("\n0. Sortir");
			System.out.println("\n1. Alta");
			System.out.println("\n2. Modificar");
			System.out.println("\n3. LLista de Parades de Venda");
			opcio = DADES.nextInt();
			DADES.nextLine();
			switch (opcio) {
			case 0:
				break;
			case 1:
				mercatActual.addParadaV();
				break;
			case 2:
				int pos = mercatActual.selectParadaV(null);
				if (pos != 1) {
					mercatActual.getParadesV()[pos].updateParadaV();
				} else {
					System.out.println("Aquesta Parada de Venda no existeix.");
				}
				break;
			case 3:
				for (int i = 0; i < mercatActual.getpParadesV(); i++) {
					mercatActual.getParadesV()[i].showParadaV();
				}
				break;

			default:
				System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
				break;
			}
		} while (opcio != 0);
	}

	public static Integer selectMercat() {

		System.out.println("\nCodi del mercat?:");
		int codi = DADES.nextInt();

		for (int i = 0; i < pMercats; i++) {
			if (mercats[i].getCodi() == codi) {
				return i;
			}
		}
		return -1;
	}
}
