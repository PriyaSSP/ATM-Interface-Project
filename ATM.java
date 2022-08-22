package atminterface;

import java.util.Scanner;

public class ATM 
{
	Scanner sc=new Scanner(System.in);
	
	private int customerNumber;
	private int pinNumber;
	private double currentBalance=100;
	private double savingsBalance=100;
	
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	public double getCurrentBalance() 
	{
		return currentBalance;
	}
	
	public double getSavingsBalance() 
	{
		return savingsBalance;
	}
	
	public double calcCurrentWithdraw(double amount)
	{
		currentBalance=(currentBalance-amount);
		return currentBalance;
	}
	
	public double calcSavingsWithdraw(double amount)
	{
		savingsBalance=(savingsBalance-amount);
		return savingsBalance;
	}
	
	public double calcCurrentDeposit(double amount)
	{
		currentBalance=(currentBalance+amount);
		return currentBalance;
	}
	
	public double calcSavingsDeposit(double amount)
	{
		savingsBalance=(savingsBalance+amount);
		return savingsBalance;
	}
	
	public void getCurrentWithdrawlInput()
	{
		System.out.println("Account Balance: " + (currentBalance));
		System.out.println("Amount you want to withdraw from Current Account: ");
		double amount=sc.nextDouble();
		
		if((currentBalance-amount)>=0)
		{
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account balance: " + (currentBalance) + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	

	public void getSavingsWithdrawlInput()
	{
		System.out.println("Account Balance: " + (savingsBalance));
		System.out.println("Amount you want to withdraw from Savings Account: ");
		double amount=sc.nextDouble();
		
		if((savingsBalance-amount)>=0)
		{
			calcSavingsWithdraw(amount);
			System.out.println("New Saving Account balance: " + (savingsBalance)  + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	
	public void getCurrentDepositInput()
	{
		System.out.println("Account Balance: " + (currentBalance));
		System.out.println("Amount you want to deposit in Current Account: ");
		double amount=sc.nextDouble();
		
		if((currentBalance+amount)>=0)
		{
			calcCurrentDeposit(amount);
			System.out.println("New Current Account balance: " + (currentBalance) + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	public void getSavingsDepositInput()
	{
		System.out.println("Account Balance: " + (savingsBalance));
		System.out.println("Amount you want to deposit in Savings Account: ");
		double amount=sc.nextDouble();
		
		if((savingsBalance+amount)>=0)
		{
			calcSavingsDeposit(amount);
			System.out.println("New Savings Account balance: " + (savingsBalance)  + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	

}


