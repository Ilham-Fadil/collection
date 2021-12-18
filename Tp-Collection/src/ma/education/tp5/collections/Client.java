package ma.education.tp5.collections;

import java.util.Comparator;

public class Client implements Comparable<Client> {
	Integer code;
	String name;

	public Client(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client{" + "code=" + code + ", name='" + name + '\'' + '}';
	}

	@Override
	public int compareTo(Client o) {
//		if (o.code < this.code)
//			return 1;
//		else if (o.code > this.code)
//			return -1;
//		return 0;
		Client client = (Client) o;
		return -client.code+this.code;
	}
	@Override
	public boolean equals(Object o) {
	Client client = (Client) o;
	return this.code==client.code && this.name.equals(client.name);
	}
	@Override
	public int hashCode() {
	return code;
	}

}
