package car01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import car01.enumPackage.Color;
import car01.enumPackage.Covering;
import car01.enumPackage.Diametr;
import car01.enumPackage.Model;
import car01.enumPackage.Buttons;

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
			System.out.println("1. Find cars that have the entered wheel diameter ENTER 1");
			System.out.println("2. Find cars that have the entered wheel diameter and body color ENTER 2");
			System.out.println("3. Replace in all cars that have a red body color, steering on another ENTER 3");
			System.out.println("4. Increase the wheel's diameter by half if the steering wheel has buttons ENTER 4");
			System.out.println("5. Replace all machines that have wheels less than the entered value in diameter on other machines ENTER 5");
			while (isRun){
			switch (scanner.next()) {
			case "1":
				
				searchDiametr();
				break;
			case "2":
		
				searchDiametrColor();
				break;
			case "3":
				replaceSteeringWheel();
				break;
			case "4":
				buttonsChange();
				break;
			case "5":
				changesCars();
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
		private Diametr diametr;
		Color color;
		
		private Car createCar(){
			Model[] models = Model.values();
			Color[] colors = Color.values();
			Diametr[] diameters = Diametr.values();
			Covering[] coverings = Covering.values();
			Buttons[] button = Buttons.values();
			return new Car(models[random.nextInt(models.length)],
					new Body(colors[random.nextInt(colors.length)]),
					new Wheel(diameters[random.nextInt(diameters.length)]),
					new Steering(coverings[random.nextInt(coverings.length)], button[random.nextInt(button.length)]));
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
		
		
		
		private void searchDiametr(){
			Boolean seadiam = false;
			diametr = enterDiametr();
			for (Car car : cars) {
				if (car.getWheel().getDiametr().equals(diametr)) {
					seadiam = true;
					System.out.println(car);
				}if(seadiam == false) System.out.println("Not car with enter wheeldiametr");
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
		
		
		private void searchDiametrColor() {
			Boolean tf = false;
			color = enterColor();
			for (Car car : cars){
				if(car.getWheel().getDiametr().equals(diametr)&&car.getBody().getColor().equals(color)){
					tf = true;
					System.out.println(car);
				}
				if(tf == false){System.out.println("No car whis diametr and color");}
			}
		}
		
		private void replaceSteeringWheel() {
			System.out.println("  ");
			for (Car car : cars) {
				if(car.getBody().getColor().equals(color.RED)){
					if(car.getSteering().getCovering().equals(Covering.CLOTH)){
						car.getSteering().setCovering(Covering.PLASTIC);
					}else car.getSteering().setCovering(Covering.CLOTH);
				}if(car.getBody().getColor().equals(color.RED)){System.out.println("Steering is another : " + car.toString() );}
				
			}
		}
		
		private void buttonsChange(){
			Diametr[] diameters = Diametr.values();
			for (Car car : cars) {
				if(car.getSteering().getButtons().equals(Buttons.ISBUTTONS)){
					int ord = car.getWheel().getDiametr().ordinal();
					try {car.setWheel(new Wheel(diameters[ord+1]));
					System.out.println("Diameters changed "+car.toString());
					}catch (Exception e) {
						System.err.println("Car with max diametrs R18 not changed");
					}
			}
		}
		}
		private void changesCars(){
			diametr = enterDiametr();
			 for (int i = 0; i < cars.size(); i++) {
				if(cars.get(i).getWheel().getDiametr().ordinal() < diametr.ordinal()){
					System.out.println(cars.get(i) + "*** Changed to:");
					cars.set(i, createCar());
					System.out.println(cars.get(i));
				}
			}
			
		}
		
}

