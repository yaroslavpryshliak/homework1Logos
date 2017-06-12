package workman01;

public class EmployeeHour01 implements Salary01 {
	
	private final int hourc;
	
	private final int timeh;
	
	public EmployeeHour01(int hourc, int timeh) {
		this.hourc = hourc;
		this.timeh = timeh;
	}

	@Override
	public double wage() {
		return  hourc*timeh;
	}
	
	
	
}
