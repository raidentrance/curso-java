
public class TestContinueWhile {

	public static void main(String[] args) {
		int x = 0;
		while (x < 10) {
			System.out.println("Test");
			if(x==3){
				continue;
			}
			x++;
		}
	}
}
