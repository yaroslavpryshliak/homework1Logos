package workman01;

public class EmployeeWeek01 implements Salary01 {
	
    private final int numberw;
	
	private final double weekc;

	public EmployeeWeek01(int numberw, double d) {
		this.numberw = numberw;
		this.weekc = d;
	}

	@Override
	public double wage() {
		return numberw*weekc;
	}
	
	
	

}
