package conlei;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Linkh {
	public static void main(String[] args) {
		LinkedHashSet<String> l=new LinkedHashSet<>();
		l.add("111");
		l.add("222");
		l.add("333");
		l.add("444");
		Iterator<String> e=l.iterator();
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		for(String s:l)
		{
			System.out.println(s);
		}
		HashSet<String> h=new HashSet<>();
		h.add("AA");
		h.add("BB");
		h.add("1"); 
		h.add("DDDD");
		Iterator<String> hh=h.iterator();
		while(hh.hasNext())
		{
			System.out.println(hh.next());
		}
		
		
		
		
		Map<String, String> m=new HashMap<>();
		m.put("a", "A");
		m.put("b", "B");
		m.put("c", "C");
		
		Map<String, String> k=new HashMap<>();
		k.put("1", "aaa");
		k.put("2", "bbb");
		m.putAll(k);
		Set<String> c=m.keySet();
		for(String s:c)
		{
			System.out.println(m.get(s));
		}
		Set<Map.Entry<String, String>>  mm=m.entrySet();
		for(Map.Entry<String, String> s:mm)
		{
			System.out.println(s.getKey()+"="+s.getValue());
		}
	}
}
