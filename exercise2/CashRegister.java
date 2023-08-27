package exercise2;

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
	public void recievePayment(int coinCount, Coin coinType)
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
	public int giveChange(Coin coinType)
	{
		double coinValue = coinType.getCoinValue();
		double change = payment - purchase;
		int numberOfCoins;
		
		numberOfCoins = (int) (change / coinValue);
		
		payment = payment - (coinValue * numberOfCoins);
		
		if (coinType.getCoinValue() == 0.01)
		{
			numberOfCoins++;
		}
		
		return numberOfCoins;
	}
}
