package exercise8;

public class Sphere
{

	private double radius;
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	public double getVolume()
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	public double getSurfaceArea()
	{
		double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
}
