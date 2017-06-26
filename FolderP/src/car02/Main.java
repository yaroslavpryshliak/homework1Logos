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
		
	}
	public void begin(){
		setCar();
		boolean isRun = true;
		System.out.println("Enter number of task:");
		System.out.println(" ");
		System.out.println("1. Search cars, with enter type  ENTER 1");
		System.out.println("2. Delete from list all cars, have entered colorType  ENTER 2");
		System.out.println("3. Change tire by diametr to winter  ENTER 3");
		System.out.println("4. Delet car (typeBody, helDiameter) ENTER 4");
		System.out.println("5. Remember index of Cars  ENTER 5");
		while (isRun){
		switch (scanner.next()) {
		case "1":
			searchTypeBody();
			break;
		case "2":
			removeColor();
			break;
		case "3":
			changeTypeTireByDiametrWheel();
			break;
		case "4":
			deleteCars();
			break;
		case "5":
			searchBodyType();
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
	TypeTire typeTire;
	Color color;
	Diametr diametr;
	HelmDiameter helmDiameter;

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
	
	private TypeTire tireEnter() {
		
		System.out.println("Choose type tire:");
		System.out.println("ALLSEASON, enter: allseason");
		System.out.println("SUMMER, enter: summer");
		System.out.println("WINTER, enter: winter");
		
		switch (scanner.next().toLowerCase()) {
		case "allseason":
			typeTire = TypeTire.ALLSEASON;
			break;
		case "summer":
			typeTire = TypeTire.SUMMER;
			break;
		case "winter":
			typeTire = TypeTire.WINTER;
			break;
		default:
			System.err.println("Wrong TYPETIRE");
		}
		return typeTire;
	}
	
	private Diametr enterDiametr(){
		System.out.println("  ");
		System.out.println("Choose diametr R*:");
		System.out.println("R12 enter: 12");
		System.out.println("R13 enter: 13");
		System.out.println("R14 enter: 14");
		System.out.println("R15 enter: 15");
		System.out.println("R16 enter: 16");
		System.out.println("R17 enter: 17");
		System.out.println("R18 enter: 18");
		try{
		switch (scanner.nextInt()) {
		case 12:
			diametr = Diametr.R12;
			break;
		case 13:
			diametr = Diametr.R13;
			break;
		case 14:
			diametr = Diametr.R14;
			break;
		case 15:
			diametr = Diametr.R15;
			break;
		case 16:
			diametr = Diametr.R16;
			break;
		case 17:
			diametr = Diametr.R17;
			break;
		case 18:
			diametr = Diametr.R18;
			break;
		
		default:
			System.out.println("Enter from 12 to 18");
		
		}
		}catch (Exception e) {
			System.err.println("Values not from R13-R20");
		}
		return diametr;
	}
	
	private void changeTypeTireByDiametrWheel(){
		Boolean changeType = false;
		diametr = enterDiametr();
		System.out.println(" ");
		for (Car car : cars) {
			if (car.getWheel().getDiametr().equals(diametr)) {
				car.getWheel().setTypeTire(typeTire.WINTER);
				changeType = true;	
			}
		}System.out.print(cars);
	}
	
	public HelmDiameter diameterHelmEnter() {
		System.out.println("Виберіть діаметр керма:");
		System.out.println("D12 enter: 12");
		System.out.println("D13 enter: 13");
		System.out.println("D14 enter: 14");


		switch (scanner.next()) {
		case "12":
			helmDiameter = HelmDiameter.D12;
			break;
		case "13":
			helmDiameter = HelmDiameter.D13;
			break;
		case "14":
			helmDiameter = HelmDiameter.D14;
			break;
		default:
			System.out.println("Enter helmdiameter from 12-14!");
		}

		return helmDiameter;
	}
	
	private void deleteCars() {
		Boolean delcar = false;
		typeBody = bodyEnter();
		helmDiameter = diameterHelmEnter();
		Iterator<Car> iter = cars.iterator();
		while(iter.hasNext()){
		Car tmp = iter.next();
			if (tmp.getBody().getTypeBody().equals(typeBody)&&tmp.getHelm().getHelmDiameter().equals(helmDiameter)) {
				delcar = true;
				iter.remove();
		}System.out.print(cars);
	}
	}

	public void searchBodyType() {
		Boolean hasCar = true;
		typeBody = bodyEnter();
		List<Integer> carAds = new ArrayList<>();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car tmp = iterator.next();
			if (tmp.getBody().getTypeBody().equals(typeBody)) {
				carAds.add(cars.indexOf(tmp));
				hasCar = true;
				System.out.println("Car add to list");
			}
		}
		System.out.println(carAds);
		if (hasCar != true) {
			System.out.println("No car whis choose type");
		}
	}
}
