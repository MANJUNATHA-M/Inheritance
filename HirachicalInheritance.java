package com.hirachical.inheritance;

class Account 
{	public String BankName="CBI";
	public long AccNo=876523456l;
	public double bal=0.0;
	public String Owner="Hara Hara Mahadev";
	
	public void Accountdeatils()
	{
		System.out.println("1. BankName :-->"+BankName+"  "
				+"2. Account Number :-->"+AccNo+"  "
				+"3. Current Balance :-->"+bal+"  "
				+"4. Account Ownwer :-->"+Owner);
	
	}
	public void Deposite(double amt)
	{
		bal=bal+amt;
		System.out.println("Currently Deposited Amount :-->"+amt);
		System.out.println("Current Balance is :-->"+bal);
	}
	
	public void Withdraw(double amt)
	{
		if(bal>=amt&& amt>=0)
		{
			bal=bal-amt;
			System.out.println("Currently Withdrawn Amount :-->"+amt);
			System.out.println("Current Balance is :-->"+bal);
		}
		else
		{
			System.out.println("");
			System.out.println("INSUFFICENT BALANCE");
			System.out.println("PLZ Check Again....?!");
		}
		
	}
}

class Saving extends Account
{

	static final double roi=0.05;
	 
	 public void CalculateROI()
	 {
		 bal=bal+bal*roi;
		 System.out.println("Current Balance : -->"+bal);
	 }
}

class Current extends Account
{
	public double MinBalance=5000.0;
	public void ShowMinBalance() 
	{
		System.out.println("MinBalance In Current : -->"+MinBalance);
	}
}

public class HirachicalInheritance 
{
	public static void main(String[] args)
	{
		Saving save=new Saving();
		
		System.out.println("-----------------");
		System.out.println("Account Details");
		save.Accountdeatils();
		System.out.println("-----------------");
		
		
		save.Deposite(500.0);
		System.out.println("");
		save.Withdraw(100.0);
		save.CalculateROI();
		System.out.println("");
		
		Current current=new Current();
		current.Deposite(5000.0);
		System.out.println("");
		current.Withdraw(350.0);
		System.out.println("");
		current.ShowMinBalance();
			
	}

}
