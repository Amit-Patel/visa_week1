package com.visa.prj.client;

import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyClient {

	public static void main(String[] args) {
		
		String str = new String("we are the world we are the children");
		wordFrequencyCount(str);
		
	}
	
	public static void wordFrequencyCount(String str){
		
		String[] newstr = str.split(" ");
		Map<String, Integer> freqmap = new TreeMap<>();
		for (String s : newstr) {
			if(freqmap.containsKey(s)) {
				freqmap.put(s,freqmap.get(s)+1);
			}
			else {
				freqmap.put(s,1);
			}
		}
		
		System.out.println(freqmap);
	}
	
}
