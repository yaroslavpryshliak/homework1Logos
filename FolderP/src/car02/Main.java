package car02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import car02.Car;
import car02.Body;
import car02.Helm;
import car02.Wheel;
import enumCarProperties.Color;
import enumCarProperties.Buttons;
import enumCarProperties.Covering;
import enumCarProperties.Diametr;
import enumCarProperties.HelmDiameter;
import enumCarProperties.Model;
import enumCarProperties.TypeBody;
import enumCarProperties.TypeTire;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.begin();
		main.syso1();

	}
	public void begin(){
		setCar();
		boolean isRun = true;
		System.out.println("Enter number of task:");
		System.out.println(" ");
		System.out.println("1. Search cars, with enter type  ENTER 1");
		System.out.println("2. Delete from list all cars, have entered colorType  ENTER 2");
		System.out.println("3.  ENTER 3");
		System.out.println("4.  ENTER 4");
		System.out.println("5.  ENTER 5");
		while (isRun){
		switch (scanner.next()) {
		case "1":
			searchTypeBody();
			break;
		case "2":
			removeColor();
			break;
		case "3":

			break;
		case "4":

			break;
		case "5":

			break;
		case "stop":
			isRun = false;
			break;
		default:
			System.out.println("Wrong number of task");
		}
		}
	}
	
	private List<Car> cars = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random();
	
	TypeBody  typeBody;
	Color color;

	private Car createCar(){
		Model[] models = Model.values();
		Color[] colors = Color.values();
		Diametr[] diameters = Diametr.values();
		Covering[] coverings = Covering.values();
		HelmDiameter[] helmDiameters = HelmDiameter.values();
		TypeBody[] typeBodys = TypeBody.values();
		TypeTire[] typeTires = TypeTire.values();
		Buttons[] button = Buttons.values();
		return new Car(models[random.nextInt(models.length)], 
				new Body(colors[random.nextInt(colors.length)], typeBodys[random.nextInt(typeBodys.length)]),
				new Helm(coverings[random.nextInt(coverings.length)], button[random.nextInt(button.length)], 
						helmDiameters[random.nextInt(helmDiameters.length)] ),
				new Wheel(diameters[random.nextInt(diameters.length)], typeTires[random.nextInt(typeTires.length)]));	
	}
	private void setCar(){
		for (int i = 0; i < 6; i++) {
			cars.add(createCar());	
		}
	System.out.println(cars.get(0));
	System.out.println(cars.get(1));
	System.out.println(cars.get(2));
	System.out.println(cars.get(3));
	System.out.println(cars.get(4));
	System.out.println(cars.get(5));
	}
	
	private TypeBody bodyEnter() {
		System.out.println("Choose type body:");
		System.out.println("SEDAN, enter: sedan");
		System.out.println("HATCHBACK, enter: hatchback");
		System.out.println("BOLID, enter: bolid");

		switch (scanner.next().toLowerCase()) {
		case "sedan":
			typeBody = TypeBody.SEDAN;
			break;
		case "hatchback":
			typeBody = TypeBody.HATCHBACK;
			break;
		case "bolid":
			typeBody = TypeBody.BOLID;
			break;
		default:
			System.err.println("Wrong TYPEBODY");
		}
		return typeBody;
	}
	
	private void searchTypeBody(){
		Boolean searbody = false;
		typeBody = bodyEnter();
		System.out.println(" ");
		for (Car car : cars) {
			if (car.getBody().getTypeBody().equals(typeBody)) {
				searbody = true;
				System.out.println(car);
			}if(searbody == false) System.out.println("Not car with enter wheeldiametr");
		}
	}
	
	private Color enterColor() {
		System.out.println("  ");
		System.out.println("Choose car color:");
		System.out.println("Enter : black");
		System.out.println("Enter : blue");
		System.out.println("Enter : green");
		System.out.println("Enter : red");
		System.out.println("Enter : skyblue");
		System.out.println("Enter : white");

		switch (scanner.next().toLowerCase()) {
		case "black":
			color = Color.BLACK;
			break;
		case "blue":
			color = Color.BLUE;
			break;
		case "green":
			color = Color.GREEN;
			break;
		case "red":
			color = Color.RED;
			break;
		case "skyblue":
			color = Color.SKYBLUE;
			break;
		case "white":
			color = Color.WHITE;
			break;
		default:
			System.err.println("Enter true choise color");
		}
		return color;
	}
	private void removeColor() {
		Boolean isCar = false;
		color = enterColor();
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()){
			Car tmp = iterator.next();
			if(tmp.getBody().getColor().equals(color)){
				iterator.remove();
				isCar = true;
				System.out.println("Car deleted");
			}
		}if (isCar != true) {
			System.out.println("Not car with enter colors...");
		}
	}
	
	private void syso1(){
		System.out.println(cars.toString());
	}

}
