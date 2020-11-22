package Homework03;

public class IntArray {
	private int[] array;
	int avg, summation=0;
	
	public IntArray() {
		this.array = new int[10];
	}
	
	public int[] fillArray() {
		
		for(int i = 0; i < 10 ; i++) {
			this.array[i] = (int)(Math.random() * 100);
		}
		return this.array;
	}
	
	public void print() {
		System.out.println("Dizinin elemanları:");
		for(int i = 0; i < 10 ; i++) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}
	public double average() {
		for (int i=0;i<10;i++){
			  summation = summation + array[i];
			 if (i  == 9 ){
				 double avg = summation/10;
				 System.out.println("Dizinin ortalaması: "+ avg);
	     }
    }
		return avg;
	}
}
