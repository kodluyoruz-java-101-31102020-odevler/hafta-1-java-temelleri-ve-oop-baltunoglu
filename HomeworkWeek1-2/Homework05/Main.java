package Homework05;

public class Main {
public static void main(String[] args) {
		
		IntArray array = new IntArray();
		array.fillArray();
		System.out.println("Rastgele oluşturulmuş dizi:");
		array.print();
		System.out.println("Dizinin çift elemanları:");
		array.printEven();
		System.out.println("Dizinin tek elemanları:");
		array.printOdd();
}
}
