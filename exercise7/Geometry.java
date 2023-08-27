package exercise7;

public class Geometry
{
	public static double cubeVolume(double h)
	{
		double volume = Math.pow(h, 3);
		return volume;
	}
	

	public static double cubeSurface(double h)
	{
		double surfaceArea = 6 * Math.pow(h, 2);
		return surfaceArea;
	}
	

	public static double sphereVolume(double r)
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		return volume;
	}
	

	public static double sphereSurface(double r)
	{
		double surfaceArea = 4.0 * Math.PI * Math.pow(r, 2);
		return surfaceArea;
	}

	public static double cylinderVolume(double r, double h)
	{
		double volume = Math.PI * Math.pow(r, 2) * h;
		return volume;
	}

	public static double cylinderSurface(double r, double h)
	{
		double surfaceArea = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
		return surfaceArea;
	}
	public static double coneVolume(double r, double h)
	{
		double volume = Math.PI * Math.pow(r, 2) * (h / 3.0);
		return volume;
	}
	public static double coneSurface(double r, double h)
	{
		double surfaceArea = Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
		return surfaceArea;
	}
}
