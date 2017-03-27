import java.util.Arrays;

public class SubwayMain 
{
	public static void main(String[] args) 
	{
		//����ö ���� ��ġ�� �浵�� ������ ����
		SubwayTrain[] arr = new SubwayTrain[4];
		arr[0] = new SubwayTrain("������", 37.266315, 126.999516);
		arr[1] = new SubwayTrain("�����߾ӿ�", 37.288183, 127.052078);
		arr[2] = new SubwayTrain("������", 37.244102, 127.013751);
		arr[3] = new SubwayTrain("������", 37.297896, 127.069241);
		
		System.out.println(Arrays.toString(arr));
		//�츮�� ������ �浵 ����
		double lat = 37.255222;
		double lng = 127.011720;
		
		//for~each������ ����ö ���� �Ÿ� ����
		for (SubwayTrain subwayTrain : arr) 
		{
			double distance = subwayTrain.calcDistance(lat, lng);
			System.out.println(distance);
		}
		//����ö ���� �Ÿ� ������ ����
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
