package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.Person;
import model.PersonComparator;

public class Test {

	private ArrayList<Person> persons;
	
	
	
	public Test() {
		super();
		this.persons = new ArrayList<Person>();
		persons.add( new Person(123, "David", "Olimpo"));
		persons.add( new Person(143, "Martin", "z"));
		persons.add( new Person(173, "Juan", "Liturgio"));
		persons.add( new Person(183, "Marta", "Mesa"));
		persons.add( new Person(193, "Lucas", "Quevedo"));
		persons.sort(Person::compareOtherPerson);
		// (X,Y) -> X.getId() - Y.getId()
	}

	

	public ArrayList<Person> getPersons() {
		return persons;
	}
	
	public void print(Predicate<Person> predicate) {
		for(Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
	}



	public static void main(String[] args) {
		Test test = new Test();
		//test.print(X -> X.getId() > 170);
		test.print(X -> X.getName().startsWith("L"));
		test.getPersons().stream().forEach(
				new Consumer<Person>() {

					@Override
					public void accept(Person t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}
			
		});
		//System.out.println(test.getPersons());
		
	}
}
