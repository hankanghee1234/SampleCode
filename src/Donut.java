
public class Donut 
{
	Circle inner;
	Circle outer;
	
	public Donut(double outerRadius, double innerRadius)
	{
		//생성자 호출하는데 밑에 코드를 받아 출력
		this(new Circle(outerRadius), new Circle(innerRadius));
	}
	
	public Donut(Circle outer, Circle inner)
	{
		this.outer = outer;
		this.inner = inner;
	}

	@Override
	public String toString() 
	{
		return "Donut [inner=" + inner + ", outer=" + outer + "]";
	}
	
	public double getArea()
	{
		return this.outer.getCircleArea() - this.inner.getCircleArea();
	}
	
}
