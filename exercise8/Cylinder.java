package exercise8;

public class Cylinder
{

	private double radius, height;

	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	public double getVolume()
	{
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	public double getSurfaceArea()
	{
		double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
}
