import java.util.Arrays;

public class TrainMain 
{
	public static void main(String[] args) 
	{
		//ktx와 기차간 거리 배열 생성
		Train[] arr = new Train[2];
		arr[0] = new Train("케이티엑스",225,0);
		arr[1] = new Train("기차",88,35);
		
		//System.out.println(Arrays.toString(arr));
		
		//ktx와 기차의 스피드 생성
		double speed1 = arr[0].speed;
		double speed2 = arr[1].speed;
		//System.out.println(speed1);
		//System.out.println(speed2);
		
		//ktx와 기차의 시간 생성
		double disA = arr[0].time + speed1;
		double disB = arr[1].time + speed2;
		//System.out.println(disA);
		//System.out.println(disB);
		
		while(true)
		{
			//ktx와 기차의 속력을 낼 때 따라잡는 시간 측정
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
