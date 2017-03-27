package MouseGame;

public class Mouse {
	//���� x,y�� ���� ����
	private int xpos;
	private int ypos;
	
	//�ʵ� ����
	public Mouse(int xpos, int ypos) {
		super();
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	//x�� ��ȯ
	public int getXpos(){
		
		return xpos;
	}
	
	//y�� ��ȯ
	public int getYpos(){
		
		return ypos;
	}
	
	//�㰡 ������ �� �ִ� �Ÿ�
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
