package com.revision.backend.day01;

public class ArrayLoop {
	
	public static void main(String[] args) {
		int[] arr = {21, 26, 30, 37, 41, 49, 55, 61, 69};
		int lim = 35; //lower limit above which to print
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= lim) System.out.println(arr[i]);
		}
	}

}
