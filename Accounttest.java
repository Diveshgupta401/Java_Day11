package Day11;

import java.util.Scanner;

public class Accounttest {
private int balance = 100000;
	
	public void debit(int amount)
	{
		if(amount < balance)
		{
			balance = balance - amount;
			System.out.println("Amount "+ amount+" debited from account Your balance is " + balance);
		}
		else
			System.out.println("Deduction request Denied! You dont have sufficient balance Balance is " + balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter amount to be debited");
		Scanner sc = new Scanner(System.in);
		int am = sc.nextInt();
		Accounttest ac = new Accounttest();
		ac.debit(am);
		sc.close();
	}

}
