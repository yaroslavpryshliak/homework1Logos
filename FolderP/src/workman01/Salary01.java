package workman01;

public interface Salary01 {

	double wage();
	
	public default void print(){
		System.out.println("Zarplata prazivnuka jakui prazyje pogoduno "+this.wage());
	}
	public default void print01(){
		System.out.println("Zarplata prazivnuka jakui prazyje za misja4nojy stavkojy "+this.wage());
	}
}
