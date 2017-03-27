//지하철 역의 class 함수 생성
public class SubwayTrain 
{
	String name;
	double lat;
	double lng;
	
	//지하철 역의 기본 method 생성
	public SubwayTrain(String name, double lat, double lng) 
	{
		super();
		this.name = name;
		this.lat = lat;
		this.lng = lng;
	}
	
	//지하철 역의 오버라이드
	@Override
	public String toString() 
	{
		return "SubwayTrain [name=" + name + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	//거리에 대한 수학 공식 f(x) = ((x1-x2)*2) +(y1-y2)*2) 
	public double calcDistance(double lat2, double lng2) 
	{
		
		return Math.sqrt(Math.pow(lat - lat2, 2) + Math.pow(lng - lng2, 2));
	}
	
	
}
