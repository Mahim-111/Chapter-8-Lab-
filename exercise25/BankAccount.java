package exercise25;

import java.util.ArrayList;
public class BankAccount
{
	// Instance Variables
	private double balance;
	private int accountNumber;
	private ArrayList<Double> statement = new ArrayList<Double>();
	
	private static int lastAssignedNumber = 1000;
	public static final double OVERDRAFT_FEE = 20.95;

	public BankAccount()
	{
		lastAssignedNumber++;
		
		accountNumber = lastAssignedNumber;
		balance = 0;
	}


	public BankAccount(double initialBalance)
	{
		lastAssignedNumber++;
		
		accountNumber = lastAssignedNumber;
		balance = initialBalance;
	}
	

	public void deposit(double amount)
	{
		balance = balance + amount;
		
		addToStatement(amount);
	}
	

	public void withdraw(double amount)
	{
		if (amount > balance)
		{
			balance = balance - OVERDRAFT_FEE;
			
			addToStatement(-OVERDRAFT_FEE);
		}
		else
		{
			balance = balance - amount;
			
			addToStatement(-amount);
		}
	}
	

	public double getBalance()
	{
		return balance;
	}
	

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void addToStatement(double value)
	{
		statement.add(value);
	}

	public ArrayList<Double> getStatement()
	{
		return statement;
	}
	

	public void clearStatement()
	{
		statement.clear();
	}
}
