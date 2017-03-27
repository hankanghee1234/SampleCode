package company;

//�������� Ŭ������ �ϳ��� Ŭ������ abstract���� ���´�.
public abstract class Emp {

	private int eno;
	private String name;

	public Emp(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
	
	//Emp��� ���� Ŭ������ ����� �Ǹ� ���� Ŭ������ ����� �� �ְ� ������ ����µ� ���� ������ �ʾƵ� �ȴ�.
	public abstract double calcSalary();
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}