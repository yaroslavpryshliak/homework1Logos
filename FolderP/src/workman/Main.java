package workman;

public class Main {

	public static void main(String[] args) {
		EmployeeHour ehour = new EmployeeHour();
		EmployeeWeek eweek = new EmployeeWeek();
		ehour.setHourcoast(10); // zina godunu
		ehour.setTimehour(9); // kilkist' godun
		System.out.println("Za : "+ehour.getTimehour()+" godun pru vartosti godunu: "+ehour.getHourcoast()+" !!!Perwui!!! prazivnuk zarobut' : ");
		ehour.wage();
		eweek.setWeekcoast(9000);//vartist' misja4noi zarplatu
		eweek.setNumberweek(1.3);//kilkist' misaziv
		System.out.println("Za : "+eweek.getNumberweek()+" misjaz'(zi) pru vartosti misja4noi zarplatu : "+eweek.getWeekcoast()+" !!!Drygui!!! prazivnuk zarobut' : ");
		eweek.wage();

	}
}