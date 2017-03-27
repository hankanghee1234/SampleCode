import java.util.Arrays;

public class SubwayMain 
{
	public static void main(String[] args) 
	{
		//지하철 역사 위치를 경도와 위도로 생성
		SubwayTrain[] arr = new SubwayTrain[4];
		arr[0] = new SubwayTrain("수원역", 37.266315, 126.999516);
		arr[1] = new SubwayTrain("광교중앙역", 37.288183, 127.052078);
		arr[2] = new SubwayTrain("세류역", 37.244102, 127.013751);
		arr[3] = new SubwayTrain("상현역", 37.297896, 127.069241);
		
		System.out.println(Arrays.toString(arr));
		//우리집 위도와 경도 설정
		double lat = 37.255222;
		double lng = 127.011720;
		
		//for~each문으로 지하철 역의 거리 측정
		for (SubwayTrain subwayTrain : arr) 
		{
			double distance = subwayTrain.calcDistance(lat, lng);
			System.out.println(distance);
		}
		//지하철 역의 거리 측정을 나열
		Arrays.sort(arr, (a, b) ->
		{
			double disA = a.calcDistance(lat, lng);
			double disB = b.calcDistance(lat, lng);
			
			double gap = disA - disB;
			
			if(gap > 0)
			{
				return 1;
			}
			else if(gap < 0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		});
	}	
}
