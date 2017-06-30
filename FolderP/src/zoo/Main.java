package zoo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import enumCarProperties.Diametr;
import zoo.ZooClub;
public class Main {

	public static void main(String[] args) {
		
		
		Main main = new Main();
		main.begin();
		
}
	ZooClub zooClub;
	Person person;
	Person person1;
	Pet pet;
	Pet pet1;
	private Scanner scanner = new Scanner(System.in);
	
	public void begin(){
		zooClub = new ZooClub();
		person = new Person("Andriu",18,Gender.MALE);
		person1 = new Person("Slavik",21,Gender.MALE);
		pet = new Pet("Waruk", "Papilion");
		pet1 = new Pet("Tyzik", "Pydel");
		boolean isRun = true;
		System.out.println("1. addPerson ENTER 1");
		System.out.println("2. addPet ENTER 2");
		System.out.println("3. deletePet ENTER 3");
		System.out.println("4. deletePersons ENTER 4");
		System.out.println("5. deletePetAllPerson ENTER 5");
		System.out.println("6. String MAP ZooClub ENTER 6");
		System.out.println("Exit switch enter :::  stop");
		while (isRun){
			switch (scanner.next()) {
			case "1":
				zooClub.addPerson(person);
				zooClub.addPerson(person1);
				break;
			case "2":
				zooClub.addPet(person, pet);
				zooClub.addPet(person, pet1);
				zooClub.addPet(person1, pet);
				zooClub.addPet(person1, pet1);
				break;
			case "3":
				zooClub.deletePet(person, pet);
				zooClub.deletePet(person1, pet1);
				break;
			case "4":
				zooClub.deletePerson(person);
				zooClub.deletePerson(person1);
				break;
			case "5":
				
				System.out.println("Choose what pet delete from all Persons (Waruk or Tyzik): ");
				System.out.println("Waruk enter: 1");
				System.out.println("Tyzik enter: 2");
			
					switch (scanner.nextInt()) {
					case 1:
						zooClub.deletePetAllPerson(pet);
						break;
					case 2:
						zooClub.deletePetAllPerson(pet1);
						break;}
					
				break;
			case "6":
				System.out.println(zooClub.toString());
				break;
			case "stop":
				isRun = false;
				break;
			default:
				System.out.println("Wrong number of task");
			}
	}
}}