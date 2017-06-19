package car01;

import car01.enumPackage.Color;

public class Body {

	private Color color;

	public Body(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body color=" + color;
	}
	
	
	
}
