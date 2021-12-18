package ma.education.tp5.collections;

import java.util.Comparator;

public class CodeComparator implements Comparator<Client> {

	@Override
	public int compare(Client o1, Client o2) {
		// return o1.code-o2.code;
		int compareNom = o1.name.compareTo(o2.name);
		if (compareNom >= 0)
			return 1;
		else
			return 0;
	}

}
