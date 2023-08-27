package exercise1;

public class CashRegister
{
	private double purchase;
	private double payment;

	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}
	

	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
	}
	

	public void receivePayment(int coinCount, Coin coinType)
	{
		payment = payment + coinCount * coinType.getCoinValue();
	}
	

	public double getTotalPayment()
	{
		return payment;
	}
	

	public double getTotalPurchase()
	{
		return purchase;
	}

	public double getTotalChange()
	{
		return (payment - purchase);
	}
	

	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
