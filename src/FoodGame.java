import java.util.Arrays;

public class FoodGame 
{
	public static void main(String[] args) 
	{
		FoodStore[] arr = new FoodStore[3];
		arr[0] = new FoodStore("강남불백", 37.493598, 127.030329, "불고기 백반");
		arr[1] = new FoodStore("미즈컨테이너", 37.498283, 127.025140, "스테이크");
		arr[2] = new FoodStore("스시메이진", 37.491975, 127.029695, "회 부페");
		
		double lat = 37.493496;
		double lng = 127.028148;
		
		for (FoodStore foodStore : arr) 
		{
			double distance = foodStore.calcDistance(lat, lng);
			System.out.println(distance);
			//System.out.println(foodStore);
		}
		Arrays.sort(arr,  (a,b) -> 
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
