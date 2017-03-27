//����ö ���� class �Լ� ����
public class SubwayTrain 
{
	String name;
	double lat;
	double lng;
	
	//����ö ���� �⺻ method ����
	public SubwayTrain(String name, double lat, double lng) 
	{
		super();
		this.name = name;
		this.lat = lat;
		this.lng = lng;
	}
	
	//����ö ���� �������̵�
	@Override
	public String toString() 
	{
		return "SubwayTrain [name=" + name + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	//�Ÿ��� ���� ���� ���� f(x) = ((x1-x2)*2) +(y1-y2)*2) 
	public double calcDistance(double lat2, double lng2) 
	{
		
		return Math.sqrt(Math.pow(lat - lat2, 2) + Math.pow(lng - lng2, 2));
	}
	
	
}
