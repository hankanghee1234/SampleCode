package company;

//여러개의 클래스를 하나의 클래스인 abstract으로 묶는다.
public abstract class Emp {

	private int eno;
	private String name;

	public Emp(int eno, String name) {
		this.eno = eno;
		this.name = name;
	}
	
	//Emp라는 상위 클래스를 만들게 되면 하위 클래스를 사용할 수 있게 조건을 만드는데 굳이 만들지 않아도 된다.
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