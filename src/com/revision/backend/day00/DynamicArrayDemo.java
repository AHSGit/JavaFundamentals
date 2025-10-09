package com.revision.backend.day00;

public class DynamicArrayDemo {
	
	int arr[];
	int size, capacity;
	
	public DynamicArrayDemo(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		size = 0;		
	}
	
	void insertEl(int element) {
		if(size == capacity)
			growArray();
		
		arr[size++] = element;
	}

	void growArray() {
		int tempArr[] = new int[2*size];
		for(int i=0; i<size; i++) {
			tempArr[i] = arr[i];
		}
		arr = tempArr;
		capacity = 2*size;
	}
	
	int deleteEl(int index) {
		if(index>=size)
			return -1;
					
		int deletedEl = arr[index];
		for(int i=index; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		return deletedEl;
	}
	
	void displayArr() {
		System.out.println("\nArray elements using 'size': ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nArray elements using 'capacity': ");
		for(int i=0; i<capacity; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		DynamicArrayDemo obj = new DynamicArrayDemo(4);
		obj.insertEl(0);
		obj.insertEl(1);
		obj.insertEl(1);
		obj.insertEl(2);
		obj.insertEl(3);
		obj.displayArr();
		//System.out.println("\nDeleted Element: " + obj.deleteEl(2));
		//System.out.println("\n<<< Arrays after deletion >>>");
		//obj.displayArr();
		obj.insertEl(5);
		obj.displayArr();
	}
	
	
	
	
	

}
