package car01;

public class Main {

	public static void main(String[] args) {
		Steering steering = new Steering("Wlapys");
		Wheel wheel = new Wheel(16);
		Body body = new Body("green");
		Car car = new Car("VW", Type.AUTO, steering, wheel, body);
		car.setParameters(" cloth", 12, "blues");
		System.out.println(car.toString());
	}

}
