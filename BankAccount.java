/**
 * 
 * @author Krisi Hristova
 *Bank Account
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance;
	
	//constructors
	public BankAccount(String yourName, int account)
	{
		name = yourName;
		accNum = account;
	}
	public BankAccount(String yourName, int account, double money)
	{
		name = yourName;
		accNum = account;
		balance = money;
	}
	//methods
	public void deposit(double depNum)
	{
		balance = balance + depNum;
	}
	public void withdraw(double takeOut)
	{
		balance = balance - takeOut;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return name;
		return "" + accNum;
		return "" + balance;
	}
}
