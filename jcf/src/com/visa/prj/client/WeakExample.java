package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import com.visa.prj.entity.Product;

public class WeakExample {

	public static void main(String[] args) {
		
		WeakHashMap<String, Double> map = new WeakHashMap<>();
//		Map<String, Double> map = new HashMap<>();
		

		String s= new String("hello");
		map.put(s,534.44);
		
		s = null;
		
		System.gc();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(map.get("hello"));
		
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		
		Map<String, Object> result = storeInfo(products.get(0));
		System.out.println(result);
		
		
		
	 }
	
	static Map<String, Object> storeInfo(Object o){
		
		Map<String,Object> newmap = new HashMap<String,Object>();
		Class<?> clazz = o.getClass();
		Method[] methods = clazz.getMethods(); // All inherited methods + own methods
		for(Method m : methods) {
			if(m.getName().startsWith("get")) {
				try {
					Object ret = m.invoke(o);
					newmap.put(m.getName().substring(3),ret);
					System.out.println(ret);
				} catch(Exception ex) {
					ex.printStackTrace();
				}
				}
			}
		
		return newmap;
		}
	}


