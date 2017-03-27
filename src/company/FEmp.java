package company;

public class FEmp extends Emp {

	private double monthSal; // ПљБо

	public FEmp(int eno, String name, double monthSal) {
		super(eno, name);
		this.monthSal = monthSal;
	}

	public double getMonthSal() {
		return monthSal;
	}

	public void setMonthSal(double monthSal) {
		this.monthSal = monthSal;
	}

	@Override
	public double calcSalary() {
		
		return 0;
	}

}
