/**
 * 
 */

/**
 * @author raidentrance
 *
 */
public class EjemploIf {

	public static boolean esGuapo() {
		System.out.println("Es guapo");
		return true;
	}

	public static boolean esChistoso() {
		System.out.println("Es chistoso");
		return false;
	}

	public static void main(String[] args) {
		boolean esChistoso = esChistoso();
		boolean esGuapo = esGuapo();
		if (esChistoso && esGuapo) {
			System.out.println("Si me late");
		} else {
			System.out.println("No me late");
		}
	}
}
