package car01;

import java.util.Scanner;
import car01.enumPackage.Color;
import car01.enumPackage.Covering;
import car01.enumPackage.Diametr;
import car01.enumPackage.Model;

public class Car {
	
	private final Steering steering;
	private final Wheel wheel;
	private final Body body;
	private Model model;
	
	Scanner sc = new Scanner(System.in);

	public Car(Steering steering, Wheel wheel, Body body, Model model) {
		this.steering = steering;
		this.wheel = wheel;
		this.body = body;
		this.model = model;
	}

	public void setCovering(Covering covering) {
		if(covering!=null)steering.setCovering(covering);
	}

	public void setDiametr(Diametr diametr) {
		if(diametr!=null)wheel.setDiametr(diametr);
	}

	public void setColor(Color color) {
		if(body!=null)body.setColor(color);
	}

	@Override
	public String toString() {
		return "CAR" + " " +  model + "  " + steering + "  " +  wheel + "  " +  body + " " ;
	}
	
	
	
	

	
	
	
	
	

	
	
	
	

	
	
	
}
