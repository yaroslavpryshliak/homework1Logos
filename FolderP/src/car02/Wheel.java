package car02;
import enumCarProperties.*;

public class Wheel {
	private Diametr diametr;
	private TypeTire typeTire;
	
	public Wheel(Diametr diametr, TypeTire typeTire) {
		this.diametr = diametr;
		this.typeTire = typeTire;
	}

	public Diametr getDiametr() {
		return diametr;
	}

	public void setDiametr(Diametr diametr) {
		this.diametr = diametr;
	}

	public TypeTire getTypeTire() {
		return typeTire;
	}

	public void setTypeTire(TypeTire typeTire) {
		this.typeTire = typeTire;
	}

	@Override
	public String toString() {
		return "Wheel [diametr=" + diametr + ", typeTire=" + typeTire + "]";
	}
	
	
	
}
