package Homework07;

import java.util.Date;
import java.util.Scanner;

public class Report {
	
	String name;
	String result;
	Date createDate;
	Scanner scanner = new Scanner(System.in);
	
	public String getName() {
		name = scanner.nextLine();
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		result = scanner.nextLine();
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getCreateDate() {
		createDate.toGMTString();
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
