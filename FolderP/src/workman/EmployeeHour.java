package workman;

public class EmployeeHour implements Salary {
	
	private int hourcoast;
	
	private int timehour;
	
	@Override
	public void wage() {
		
		System.out.println(hourcoast * timehour+" ymovnuh odunuz'!!!");
		
	}
	
	public int getHourcoast() {
		return hourcoast;
	}

	public void setHourcoast(int hourcoast) {
		this.hourcoast = hourcoast;
	}

	public int getTimehour() {
		return timehour;
	}

	public void setTimehour(int timehour) {
		this.timehour = timehour;
	}







}
