package car;

public class ConWheel implements Wheel {
	
	private static final int diametr = 1;
	
	private int p;
	
	
	public ConWheel(int p) {
		this.p = p;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	
	@Override
	public void diametr() {
		System.out.println(diametr*p*2+" diametr");
		
	}

}
