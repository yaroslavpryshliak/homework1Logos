package car01;

public class Car {
	
	private Type type;
	private final Steering steering;
	private final Wheel wheel;
	private final Body body;
	private String carmodel;
	

	public Car(String carmodel, Type type, Steering steering, Wheel wheel, Body body ) {
		this.carmodel = carmodel;
		this.steering = steering;
		this.wheel = wheel;
		this.body = body;
		this.type = type;
		
	}

	public void setCover(String cover) {
		if(cover!=null)steering.setCover(cover);
	}

	public void setDiametr(int diametr) {
		if(diametr!=0)wheel.setDiametr(diametr);
	}

	public void setColor(String color) {
		if(body!=null)body.setColor(color);
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [steering=" + steering + ", wheel=" + wheel + ", body=" + body + ", carmodel=" + carmodel
				+ ", type= " + type + "]";
	}

	public void setParameters(String cover, int diametr, String color){
		setCover(cover);
		setDiametr(diametr);
		setColor(color);
	}
	
	

	
	
	
	

	
	
	
}
