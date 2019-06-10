package telebill;

import java.util.Comparator;

public class OrderBySex <T> implements Comparator<T>{
	public int compare(T o1, T o2) {
		Person user1=(Person)o1;
		Person user2=(Person)o2;
		
		if(user1.getSex().charAt(0)>user2.getSex().charAt(0))
			return 1;
		else if(user1.getSex().equals(user2.getSex()))
			return -1;
		else return -1;
		}
}
