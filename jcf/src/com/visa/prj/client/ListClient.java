package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import com.visa.prj.entity.Product;

public class ListClient {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		
		Map<String, List<Product>> map = 
				products.stream()
				.collect(Collectors.groupingBy(p->p.getCategory()));
		
		map.forEach((k,v)-> {
			System.out.println(k);
			v.forEach(System.out::println);
		});
		
		List<Product> list = new CopyOnWriteArrayList<>(products); 
		Iterator<Product> iter = list.iterator(); // Iterator over snapshot of collection
		while(iter.hasNext()) {
			list.add(new Product());
			Product p = iter.next();
			System.out.println(p);
		}
		
//		Collections.sort(products);
//		
//		for (Product p : products) {
//			System.out.println(p);
//		}
//		
//		Collections.sort(products, (p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
//		
//		/*
//		for (int i = 0; i < products.size(); i++) { // here size() is a method of list interface
//			products.add(new Product()); // Out of memory error
//		}
//		*/
//		
//		Iterator<Product> iter = products.iterator();
////		products.add(new Product());// ConcurrentModificationException
//		while(iter.hasNext()) {
//			Product p = iter.next();
//			System.out.println(p);
//		}
//		
//		System.out.println("*********");
//		
//		
//		for (Product p : products) {
////			products.add(new Product());
//			System.out.println(p);
//		}
	}

}
