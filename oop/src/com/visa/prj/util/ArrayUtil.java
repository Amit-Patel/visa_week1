package com.visa.prj.util;

import java.util.Arrays;

public class ArrayUtil {

	public static void sort(Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i + 1; j < elems.length; j++) {
				if(elems[i].compareTo(elems[j]) > 0) {
					Comparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}
	
	public static int getSum(int[] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static int[] sort(int[] elems) {
		Arrays.sort(elems);
		return elems;
	}
	
	/**
	 * method to return number of occurrence of "no" in an array
	 */
	
	public static int getCount(int[] elems, int no) {
		int count = 0;
		for (int i = 0; i < elems.length; i++) {
			if(elems[i] == no)
				count++;
		}
		return count;
	}
	
	public static int[] convert(int[][] data) {
		int breadth = data[0].length;
		int []newarray = new int[data.length*data[0].length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < breadth; j++) {
				newarray[i*breadth+j] = data[i][j];
			}
		}
		return newarray;
	}
}
