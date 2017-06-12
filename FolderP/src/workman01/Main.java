package workman01;

public class Main {

	public static void main(String[] args) {
		EmployeeHour01 hour = new EmployeeHour01(10, 6);
		hour.print();
		EmployeeWeek01 week = new EmployeeWeek01(9000, 1.3);
		week.print01();
	}

}
