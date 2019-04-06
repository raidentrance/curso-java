
public class TablasDeMultiplicar {
	public static void main(String args[]) {
		for (int i = 0; i <= 10; i++) {
			if(i==5){
				continue;
			}
			System.out.println("Tabla del " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}

	}
}
