package car;

public class Main {

	public static void main(String[] args) {
			Helm helm = new ConHelm("style = ");
			Wheel wheel = new ConWheel(3);
			Body body = new ConBody("green = ");
			WorkCar car = new WorkCar("Car", helm, wheel, body);
			car.printWorkCar();
	}

}
