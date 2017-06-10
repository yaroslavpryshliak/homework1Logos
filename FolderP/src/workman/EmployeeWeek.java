package workman;

public class EmployeeWeek implements Salary {
	private double numberweek;
	
	private int weekcoast;
	
	@Override
	public void wage() {
		System.out.println(weekcoast*numberweek+" ymovnuh odunuz'!!!");
	}

	public double getNumberweek() {
		return numberweek;
	}

	public void setNumberweek(double d) {
		this.numberweek = d;
	}

	public int getWeekcoast() {
		return weekcoast;
	}

	public void setWeekcoast(int weekcoast) {
		this.weekcoast = weekcoast;
	}
	
}
