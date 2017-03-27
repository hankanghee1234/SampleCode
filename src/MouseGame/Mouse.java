package MouseGame;

public class Mouse {
	//쥐의 x,y값 변수 생성
	private int xpos;
	private int ypos;
	
	//필드 생성
	public Mouse(int xpos, int ypos) {
		super();
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	//x값 반환
	public int getXpos(){
		
		return xpos;
	}
	
	//y값 반환
	public int getYpos(){
		
		return ypos;
	}
	
	//쥐가 움직일 수 있는 거리
	public void moveMouse(){

		
		if(xpos< 100 && ypos<100){
			
			this.xpos+= 5;
			this.ypos+= 5;
			
		}
		
		else{
			this.xpos-= 15;
			this.ypos-= 15;
			
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Mouse [xpos=" + xpos + ", ypos=" + ypos + "]";
	}

}
