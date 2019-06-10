package telebill;

import java.util.Comparator;

public class OrderByName <T> implements Comparator<T>{
	public int compare(T o1, T o2) {
		Person user1=(Person)o1;
		Person user2=(Person)o2;
		int x=user1.getName().compareTo(user2.getName());
		if(x>0)
			return 1;
		
		else return -1;
		}
}
