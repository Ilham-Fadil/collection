package ma.education.tp5.collections;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		//forEach(i-> System.out.println(i));
		Set<Client> set4 = new TreeSet<>();
		set4.add(new Client(1,"OMAR"));
		set4.add(new Client(3,"SAID"));
		set4.add(new Client(2,"HASSAN"));
		//set4.forEach(i-> System.out.println(i));
		//trier par code
		System.out.println("trier par code");
		Set<Client> set5 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
		set5.add(new Client(1,"OMAR"));
		set5.add(new Client(3,"SAID"));
		set5.add(new Client(2,"HASSAN"));
		set5.forEach(i-> System.out.println(i));
		//trier par name
		System.out.println("****************************************");
		System.out.println("trier par Nom");
		Set<Client> set6 = new TreeSet<>((c1,c2) -> c1.name.compareTo(c2.name));
		set6.add(new Client(1,"c"));
		set6.add(new Client(3,"e"));
		set6.add(new Client(2,"a"));
		set6.forEach(i-> System.out.println(i));


	}

}
