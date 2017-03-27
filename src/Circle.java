
public class Circle 
{
	double radius;

	public Circle(double radius) 
	{
		super();
		this.radius = radius;
	}

	@Override
	public String toString() 
	{
		return "Circle [radius=" + radius + "]";
	}
	
	public double getCircleArea()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}

}
