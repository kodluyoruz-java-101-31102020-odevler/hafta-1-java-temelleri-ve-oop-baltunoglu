package Homework02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		int x,y,n,summation,multiply,division,subtraction,remain;		
		System.out.println("Yapmak istediğiniz işlemi seçiniz"+"\n1-Toplama"+"\n2-Çıkarma"+"\n3-Çarpma"+"\n4-Bölme");
		n=enter.nextInt();
		try {
		switch(n) {
		case 1:
			System.out.println("Toplamak istediğiniz sayıları giriniz:"+"\nİlk sayı:");
			x=enter.nextInt();
			System.out.println("İkinci sayı:");
			y=enter.nextInt();
			summation=x+y;
			System.out.println(x+ "+"+y+"="+summation);
			break;
		case 2:
			System.out.println("Eksilen sayıyı giriniz:");
			x=enter.nextInt();
			System.out.println("Çıkan sayıyı giriniz:");
			y=enter.nextInt();
			subtraction=x-y;
			System.out.println(x+"-"+y+"="+subtraction);
			break;
		case 3:
			System.out.println("Çarpmak istediğiniz sayıları giriniz:"+"\nİlk sayı:");
			x=enter.nextInt();
			System.out.println("İkinci sayı:");
			y=enter.nextInt();
			multiply=x*y;
			System.out.println(x+ "*"+y+"="+multiply);
			break;
		case 4:
			System.out.println("Bölünen sayıyı giriniz:");
			x=enter.nextInt();
			System.out.println("Bölen sayıyı giriniz:");
			y=enter.nextInt();
			division=x/y;
			remain=x%y;
			System.out.println(x+" sayısının "+y+" sayısına bölümü:"+division+" kalan:"+remain);
		}
		}
			catch(Exception ArithmeticExpection) {
				System.out.println("Sayı sıfıra bölünemez!");
			}
		enter.close();
		}
	}
