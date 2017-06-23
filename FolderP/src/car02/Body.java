package car02;

import enumCarProperties.*;

public class Body {
	private Color color;
	private TypeBody typeBody;
	
	public Body(Color color, TypeBody typeBody) {
		this.color = color;
		this.typeBody = typeBody;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeBody getTypeBody() {
		return typeBody;
	}

	public void setTypeBody(TypeBody typeBody) {
		this.typeBody = typeBody;
	}

	@Override
	public String toString() {
		return "Body color=" + color + ", typeBody=" + typeBody + "";
	}
	
	
	
	
	
	
}
