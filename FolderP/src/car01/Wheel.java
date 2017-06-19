package car01;
import car01.enumPackage.Diametr;
public class Wheel {
	private Diametr diametr;

	public Wheel(Diametr diametr) {
		this.diametr = diametr;
	}

	public Diametr getDiametr() {
		return diametr;
	}

	public void setDiametr(Diametr diametr) {
		this.diametr = diametr;
	}

	@Override
	public String toString() {
		return "Wheel diametr= " + diametr;
	}
	
	
	
	
}
