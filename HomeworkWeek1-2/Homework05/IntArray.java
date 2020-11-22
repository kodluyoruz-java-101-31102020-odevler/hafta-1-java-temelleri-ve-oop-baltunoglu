package Homework05;

public class IntArray {
	private int[] array;
	
	public IntArray() {
		this.array = new int[100];
	}
	
	public int[] fillArray() {
		
		for(int i = 0; i < 100 ; i++) {
			this.array[i] = (int)(Math.random() * 100);
		}
		return this.array;
	}
	
	public void print() {
		
		for(int i = 0; i < 100 ; i++) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}
	
		
	public void printEven() {
		for(int i=0; i<100; i++) {
			if(this.array[i]%2==0) {
				System.out.print(array[i]+" ");					
			}
		}
		System.out.println();
	}
	public void printOdd() {
		for(int i=0; i<100; i++) {
			if(this.array[i]%2 != 0)
				System.out.print(array[i]+" ");					
			}
		}
}
