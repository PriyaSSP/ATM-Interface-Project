package atminterface;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AccountChoice extends ATM {

	
		Scanner menuInput=new Scanner(System.in);
		
		
		HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
		
		// login information customer number and pin number
		
		public void  getLogin() throws IOException
		{
			int x=1;
			do
			{
				try
				{
					data.put(87654321,1221);
					data.put(12345678, 1234);
					
					System.out.println("Welcome to the ATM Project!");
					
					System.out.println("Enter your Customer Number: ");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your pin: ");
					setPinNumber(menuInput.nextInt());
				}
				catch(Exception e)
				{
					System.out.println("\n" + "Inavlid character(s). Only numbers." + "\n");
					x=2;
				}
				
				for(Entry<Integer, Integer> entry:data.entrySet())
				{
					if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
					{
						getAccountType();
					}
				}
				System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n"); 
				
			}while(x==1);
		}
		
		
		
		public void getAccountType()
		{
			System.out.println("Select the Account you want to access: ");
			System.out.println("Type 1- Current Account");
			System.out.println("Type 2- Savings Account");
			System.out.println("Type 3- Exit");
			System.out.println("Choice: ");
			
			selection=menuInput.nextInt();
			
			switch(selection)
			{
			case 1:
				getCurrent();
				break;
			
			case 2:
				getSavings();
				break;
			
			case 3:
				System.out.println("Thank You for using this ATM: ");
				break;
			
				default:
					System.out.println("\n" + "Inavlid Choice. " + "\n");
					getAccountType();	
			}
		};
		
		
		public void getCurrent()
		{
			System.out.println("Current Account: ");
			System.out.println("Type 1- View Balance");
			System.out.println("Type 2- Withdraw Money");
			System.out.println("Type 3- Deposit Money");
			System.out.println("Type 4- Exit");
			System.out.println("Choice: ");
			
			selection=menuInput.nextInt();
			
			switch(selection)
			{
			case 1:
				System.out.println("Current Account Balance: " + (getCurrentBalance()) + "\n");
				getAccountType();
				break;
				
		
			case 2:
				getCurrentWithdrawlInput();
				getAccountType();
				break;
				
			case 3:
				getCurrentDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank You for using this ATM. ");
				break;
				
		    default:
		    	System.out.println("\n" + "Invalid choice." + "\n");
		    	getCurrent();
			}
		}
		
		
		
		public void getSavings()
		{
			System.out.println("Savings Account: ");
			System.out.println("Type 1- View Balance");
			System.out.println("Type 2- Withdraw Money");
			System.out.println("Type 3- Deposit Money");
			System.out.println("Type 4- Exit");
			System.out.println("Choice: ");
			
			selection=menuInput.nextInt();
			
			switch(selection)
			{
			case 1:
				System.out.println("Savings Account Balance: " + (getSavingsBalance()) + "\n");
				getAccountType();
				break;
				
		
			case 2:
				getSavingsWithdrawlInput();
				getAccountType();
				break;
				
			case 3:
				getSavingsDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank You for using this ATM. ");
				break;
				
		    default:
		    	System.out.println("\n" + "Invalid choice." + "\n");
		    	getSavings();
			}
		}
		int selection;
	}


