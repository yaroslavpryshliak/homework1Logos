package car01;
import car01.enumPackage.Covering;
public class Steering {
	
	private Covering covering;

	public Steering(Covering covering) {
		this.covering = covering;
	}

	public Covering getCovering() {
		return covering;
	}

	public void setCovering(Covering covering) {
		this.covering = covering;
	}

	@Override
	public String toString() {
		return "Steering covering " + covering;
	}
	
	
	

	
	
	
	
	
}
