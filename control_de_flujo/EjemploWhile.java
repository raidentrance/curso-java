/**
 * 
 */

/**
 * @author raidentrance
 *
 */
public class EjemploWhile {
	static int numeroDeCervezas=12;
	
	static void beber(){
		System.out.println("Estoy bebiendo prros !");
		numeroDeCervezas--;
	}
	
	public static void main(String[] args) {
		while(numeroDeCervezas>0){
			beber();
		}
	}
}
