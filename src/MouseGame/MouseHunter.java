package MouseGame;

public class MouseHunter {
	
	//헌터의 x,y값 변수 생성
	private int xpos;
	private int ypos;
	
	//필드 생성
	public MouseHunter(int xpos, int ypos) {
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
	
	//헌터가 움직일 수 있는 거리
	public void moveHunter(){
		
		this.xpos += 3;
		this.ypos += 3;
		
	}
	
	
	@Override
	public String toString() {
		return "MouseHunter [xpos=" + xpos + ", ypos=" + ypos + "]";
	}
	
}