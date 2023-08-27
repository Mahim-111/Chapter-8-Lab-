package exercise8;

public class Cone
{

	private double radius, height;
	public Cone(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public double getVolume()
	{
		double volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
		return volume;
	}
	public double getSurfaceArea()
	{
		double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		return surfaceArea;
	}
}
