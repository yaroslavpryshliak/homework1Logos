package zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZooClub {
	 Person person;
	 List<Pet> pets;
	 Map<Person, List<Pet>> map;
	 Set<Map.Entry<Person,List<Pet>>> entries;
	 Iterator<Map.Entry<Person, List<Pet>>> iterator;
	
		 public ZooClub() {
			  map = new HashMap<>();
			 } 
		 
		 public void addPerson(Person person) {
		  map.put(person, new ArrayList<Pet>());
		 }
		 
		 public void addPet(Person person, Pet pet) {
		  List<Pet> pets = map.get(person);
		  pets.add(pet);
		 }
		 
		 
		 public void deletePet(Person person, Pet pet) {
		  List<Pet> pets = map.get(person);
		  Iterator<Pet> iterator = pets.iterator();
		  
		  while(iterator.hasNext()) {
		   Pet currentPet = iterator.next();
		   if(currentPet.equals(pet)) {
		    iterator.remove();
		   }
		  }
		 }
		 
		 public void deletePerson(Person person) {
		  map.remove(person);
		 }
		 
		 
		 
		 public void deletePetAllPerson(Pet pet){
		  entries = map.entrySet();
		  for(Map.Entry<Person, List<Pet>> entry : entries){
		   Iterator<Pet> iterator = entry.getValue().iterator();
		   while(iterator.hasNext()){
		    if(iterator.next().equals(pet)){
		     iterator.remove();
		    }
		   }
		   
		  }
		 }


		 @Override
		 public String toString() {
		  return "ZooClub [map=" + map + "]";
		 }
}
