package car01;

import java.util.Scanner;

import car01.enumPackage.Buttons;
import car01.enumPackage.Color;
import car01.enumPackage.Covering;
import car01.enumPackage.Diametr;
import car01.enumPackage.Model;

public class Car {
	
	private Steering steering;
	private Wheel wheel;
	private Body body;
	private Model model;
	
	Scanner sc = new Scanner(System.in);

	public Car(Model model, Body body, Wheel wheel,Steering steering) {
		this.steering = steering;
		this.wheel = wheel;
		this.body = body;
		this.model = model;
	}

	public Steering getSteering() {
		return steering;
	}

	public void setSteering(Steering steering) {
		this.steering = steering;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [" + steering + ", " + wheel + ", " + body + ", Model=" + model + "]";
	}

	
	
	
	
	

	
	
	
	
	

	
	
	
	

	
	
	
}
