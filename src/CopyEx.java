import java.util.Arrays;

public class CopyEx 
{
	public static void main(String[] args) 
	{
		int[] origin = {1,2,3,4,5,6,7,8,9};
		
		int[] copyed = new int[8];
		
		//
		System.arraycopy(origin, 0, copyed, 0, 4);
		
		System.arraycopy(origin, 5, copyed, 4, 4);
		
		origin = copyed;
		
		System.out.println(Arrays.toString(copyed));
		
		
		
		
		
		
	}

}
