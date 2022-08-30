// Main.java
//Intro practice to basic java

package practice;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Account {
	private String acctName;
	private double acctBalance = 0;

	public static void main(String[] args) {
		
	}
	
	public void setAccountName() {
		System.out.println("enter account name: ");
		Scanner input = new Scanner(System.in); 
		acctName = input.next();
	}
	public void getAccountName() {
		if(!acctName.isEmpty()) {
			System.out.printf("account is:%s", acctName, "\n");
		}
		else {
			System.out.println("invalid input");
		}
	}
	public void setAcctBalance(double balAmt) {
		System.out.println("enter the balance: ");
		Scanner balInput = new Scanner(System.in);
		acctBalance = balInput.nextDouble();
	}
	public void getAcctBalance() {
		System.out.printf("\nAccount balance is: \n");
		truncateValue(acctBalance, 2);
				
				
	}
	public void truncateValue(double val, int decimalPoint) {
		val = val*Math.pow(10, decimalPoint);
		val = Math.floor(val);
		val = val / Math.pow(10, decimalPoint);
		System.out.println(val);
	}
}
