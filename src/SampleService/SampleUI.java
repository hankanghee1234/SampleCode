package SampleService;

public class SampleUI {
	
	public void doJob(){
		
		System.out.println("변환 시작");
		int num = -12345;
	
		int result = SampleService.INSTANCE.gstABS(num);
		
		System.out.println(result);
	}
	
	
	
}
