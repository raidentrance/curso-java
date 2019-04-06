/**
 * 
 */

/**
 * @author raidentrance
 *
 */
public class EjemploIfAnidado {
	public static boolean esGuapo() {
		return true;
	}
	public static void main(String[] args) {
		int edad=20;
		if(edad<18){
			System.out.println("Estas chavo");
		}else if(edad >18 && edad <30 && esGuapo()){
			System.out.println("Eres joven :`(");
		}else if(edad >90){
			System.out.println("Eres fuerte ");
		}else{
			System.out.println("Paga impuestos !!!");
		}
	}
}
