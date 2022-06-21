package com.cg.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Long, Contact> tm = new TreeMap<>();
		Contact c = new Contact(123,"meghana","hi@gmail.com","male");
		Contact c1 = new Contact(124,"mahesh","hello@gmail.com","male");
		Contact c2 = new Contact(125,"anand","hithere@gmail.com","male");
		Contact c3 = new Contact(126,"vinitha","hlothere@gmail.com","male");
		
		tm.put((long) 123, c);
		tm.put((long) 124,c1);
		tm.put((long) 125,c2);
		tm.put((long) 126,c3);
		
		Set keys = tm.keySet();
		System.out.println(keys);
		
		Collection<Contact> values = tm.values();
		System.out.println(values);
		
		Set<Map.Entry<Long, Contact>> entries = tm.entrySet();
		System.out.println(entries);

	}

}
