package Homework07;

import java.util.Scanner;

public class SalesReport extends Report {
	
	String[] authorizedDeparments;
	Scanner enter = new Scanner(System.in);
	StringBuilder builder = new StringBuilder();

	public String[] getAuthorizedDeparments() {
		return authorizedDeparments;
	}

	public void setAuthorizedDeparments(String[] authorizedDeparments) {
		this.authorizedDeparments = authorizedDeparments;
	}
}
