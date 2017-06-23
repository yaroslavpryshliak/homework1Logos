package car01;
import car01.enumPackage.Covering;
import car01.enumPackage.Buttons;
public class Steering {
	
	private Covering covering;
	private Buttons buttons;
	
	public Steering(Covering covering, Buttons buttons) {
		this.covering = covering;
		this.buttons = buttons;
	}

	public Covering getCovering() {
		return covering;
	}

	public void setCovering(Covering covering) {
		this.covering = covering;
	}

	public Buttons getButtons() {
		return buttons;
	}

	public void setButtons(Buttons buttons) {
		this.buttons = buttons;
	}

	@Override
	public String toString() {
		return "Steering covering=" + covering + ", buttons=" + buttons ;
	}
	
	
	
	
	
	

	
	
	
	
	
}
