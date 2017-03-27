import java.util.Arrays;

public class FoodStore 
{
	String name;
	double lat;
	double lng;
	String menu;
	
	
	public FoodStore(String name, double lat, double lng, String menu) 
	{
		super();
		this.name = name;
		this.lat = lat;
		this.lng = lng;
		this.menu = menu;
	}


	@Override
	public String toString() 
	{
		return "FoodStore [name=" + name + ", lat=" + lat + ", lng=" + lng + ", menu=" + menu + "]";
	}


	public double calcDistance(double lat2, double lng2)
	{
		return Math.sqrt(Math.pow(this.lat - lat2, 2) + Math.pow(this.lng - lng2, 2));
	}
	
	
	

}
