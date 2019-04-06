import java.util.Random;

public class EjemploDoWhile {
	
	static boolean pedirPosada(){
		int numeroAleatorio = new Random().nextInt(3);
		if(numeroAleatorio==2){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean meAbrieron;
		do{
			System.out.println("Voy a pedir posada");
			meAbrieron=pedirPosada();
		}while(!meAbrieron);
		System.out.println("Ya me abrieron !! ");
		
	}
}
