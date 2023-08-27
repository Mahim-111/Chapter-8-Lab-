package exercise1;

public class Coin
{
	private double coinValue;
	private String coinName;
	

	public Coin(double value, String name)
	{
		coinValue = value;
		coinName = name;
	}
	

	public double getCoinValue()
	{
		return coinValue;
	}
	

	public String getCoinName()
	{
		return coinName;
	}
	

	public void setCoinValue(double value)
	{
		this.coinValue = value;
	}

	public void setCoinName(String name)
	{
		this.coinName = name;
	}
}
