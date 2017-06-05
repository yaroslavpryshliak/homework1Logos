package homeworkc;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(0, 12, 9);
		System.out.println("Plowa pramokytnuka ="+" "+rect.plowa());
		System.out.println("Plowa pramokytnuka ="+" "+rect.perumetr());
		Rectangle rect01 = new Rectangle();
		System.out.println("Plowa pramokytnukaEMPTYCON ="+" "+rect01.plowa());
		System.out.println("Plowa pramokytnukaEMPTYCON ="+" "+rect01.perumetr());
	}

}
