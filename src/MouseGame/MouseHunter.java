package MouseGame;

public class MouseHunter {
	
	//������ x,y�� ���� ����
	private int xpos;
	private int ypos;
	
	//�ʵ� ����
	public MouseHunter(int xpos, int ypos) {
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
	
	//���Ͱ� ������ �� �ִ� �Ÿ�
	public void moveHunter(){
		
		this.xpos += 3;
		this.ypos += 3;
		
	}
	
	
	@Override
	public String toString() {
		return "MouseHunter [xpos=" + xpos + ", ypos=" + ypos + "]";
	}
	
}