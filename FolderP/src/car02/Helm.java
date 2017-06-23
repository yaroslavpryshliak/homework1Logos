package car02;
import enumCarProperties.*;

public class Helm {
	private Covering covering;
	private Buttons buttons;
	private HelmDiameter helmDiameter;
	
	public Helm(Covering covering, Buttons buttons, HelmDiameter helmDiameter) {
		this.covering = covering;
		this.buttons = buttons;
		this.helmDiameter = helmDiameter;
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

	public HelmDiameter getHelmDiameter() {
		return helmDiameter;
	}

	public void setHelmDiameter(HelmDiameter helmDiameter) {
		this.helmDiameter = helmDiameter;
	}

	@Override
	public String toString() {
		return "Helm [covering=" + covering + ", buttons=" + buttons + ", helmDiameter=" + helmDiameter + "]";
	}
	
	
	
	
}

