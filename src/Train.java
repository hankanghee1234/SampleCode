
public class Train 
{
	String title;
	double speed;
	double time;
	
	public Train(String title, double speed, double time) 
	{
		super();
		this.title = title;
		this.speed = speed/60;
		this.time = time;
	}

	@Override
	public String toString() 
	{
		return "Train [title=" + title + ", speed=" + speed + ", time=" + time + "]";
	}
	
	
	
	
	
	
	
}
