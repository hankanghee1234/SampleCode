import java.util.Arrays;

public class TrainMain 
{
	public static void main(String[] args) 
	{
		//ktx�� ������ �Ÿ� �迭 ����
		Train[] arr = new Train[2];
		arr[0] = new Train("����Ƽ����",225,0);
		arr[1] = new Train("����",88,35);
		
		//System.out.println(Arrays.toString(arr));
		
		//ktx�� ������ ���ǵ� ����
		double speed1 = arr[0].speed;
		double speed2 = arr[1].speed;
		//System.out.println(speed1);
		//System.out.println(speed2);
		
		//ktx�� ������ �ð� ����
		double disA = arr[0].time + speed1;
		double disB = arr[1].time + speed2;
		//System.out.println(disA);
		//System.out.println(disB);
		
		while(true)
		{
			//ktx�� ������ �ӷ��� �� �� ������� �ð� ����
			disA = disA + speed1;
			disB = disB + speed2;
			System.out.println(disA);
			System.out.println(disB);
			
			if(disA > disB)
			{
				break;
			}
			
		}

	}
	
}
