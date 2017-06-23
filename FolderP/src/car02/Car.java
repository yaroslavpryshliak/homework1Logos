package car02;
import enumCarProperties.*;

public class Car {
	private Body body;
	private Helm helm;
	private Wheel wheel;
	private Model model;
	
	public Car(Model model, Body body, Helm helm, Wheel wheel ) {
		this.model = model;
		this.body = body;
		this.helm = helm;
		this.wheel = wheel;
		
	}
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		return "Car [body=" + body + ", helm=" + helm + ", wheel=" + wheel + ", model=" + model + "]";
	}

	
	


	
	


	
	
	
	
}
