package Homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
			String customerPassword = "QkL715!jpRostW12Rr17Pg.T";
			Scanner enter = new Scanner(System.in);
			System.out.println("Sisteme giriş için şifrenizi giriniz:");
			String enteredPassword = enter.nextLine();
			if(enteredPassword.equals(customerPassword)) {
				System.out.println("Giriş Başarılı!");
			}
			else {
				System.out.println("Giriş Başarısız!");
			}
			enter.close();

	}

}
