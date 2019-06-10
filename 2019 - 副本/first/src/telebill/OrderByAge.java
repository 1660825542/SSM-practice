package telebill;

import java.util.Comparator;

public class OrderByAge <T> implements Comparator<T>{

	
	public int compare(T o1, T o2) {
		Person user1=(Person)o1;
		Person user2=(Person)o2;
		
		if(Integer.parseInt(user1.getAge())>Integer.parseInt(user2.getAge()))
			return 1;
		else if(user1.getAge()==user2.getAge())
			return -1;
		else return -1;
	}
}
