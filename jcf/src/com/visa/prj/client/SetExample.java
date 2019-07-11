package com.visa.prj.client;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.visa.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> unique = new HashSet<>();
		Set<String> stringsdup = new HashSet<>();

		
		String str = "we are the world we are the children";
	    String[] strlist = str.split(" ");
		
		for(String s: strlist) {
			if(unique.add(s) == false) {
				stringsdup.add(s);
			}
		}
		System.out.println(unique);
		System.out.println(stringsdup);
		unique.removeAll(stringsdup);
		System.out.println(unique);
		

		
		
//		Set<Product> products = new HashSet<>(100); // 100 is a default modulo number
//		Set<Product> products = new TreeSet<>(); // sorts based on id
		Set<Product> products = new TreeSet<>((p1,p2)-> {
			int diff = Double.compare(p1.getPrice(), p2.getPrice());
			if(diff == 0) {
				diff = p1.getId() - p2.getId();    // if price is same, compare on id
			}
			return diff;
		}); // 100 is a default modulo number


		products.add(new Product(645, "Hp Laptop", 135000.00, "computer", 100));
		products.add(new Product(224, "iPhone", 98000.00, "mobile", 500));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer", 300));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv", 900));
		products.add(new Product(912, "One Plus", 32000.00, "mobile", 100));
		products.add(new Product(88, "HP Printer", 19000.00, "computer", 100));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv", 900));

		for (Product p : products) {
			System.out.println(p);
		}
	}

}
