package car01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import car01.enumPackage.Color;
import car01.enumPackage.Covering;
import car01.enumPackage.Diametr;
import car01.enumPackage.Model;


public class Main {

	public static void main(String[] args) {
		
		Steering steering = new Steering(Covering.LEATHER);
		Wheel wheel = new Wheel(Diametr.R16);
		Body body = new Body(Color.RED);
		Car car = new Car(steering, wheel, body, Model.AUDI);
		List<Car> cars = new ArrayList<>();
		cars.add(car);
		System.out.println(cars.get(0));
		
		
	}

}
