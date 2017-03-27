package company;

public class DEmp extends Emp {

	private double daliyPay; // 窍风老寸 = (老寸X辟公老)X0.967
	private int days; // 辟公老荐

	public DEmp(int eno, String name, double daliyPay, int days) {
		super(eno, name);
		this.daliyPay = daliyPay;
		this.days = days;
	}

	@Override
	public double calcSalary() {
		
		return 0;
	}

}
