package com.visa.prj.client;

public class HashClient {

	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2); // False, they point to different locations
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		
//		System.out.println(s1 == s2); // True, both point to same pool area
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String s3 = new String("Aa");
		String s4 = new String("BB");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
