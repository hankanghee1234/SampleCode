package company;

public class REmp extends Emp {

	private double yearSal; // 연봉 = (연봉/12+ 수당 + 보너스/12) X 0.67
	private double pay; // 월급
	private double incen; // 보너스

	public REmp(int eno, String name, double yearSal, double pay, double incen) {
		super(eno, name);
		this.yearSal = yearSal;
		this.pay = pay;
		this.incen = incen;
	}

	public double getYearSal() {
		return yearSal;
	}

	public void setYearSal(double yearSal) {
		this.yearSal = yearSal;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getIncen() {
		return incen;
	}

	public void setIncen(double incen) {
		this.incen = incen;
	}

	@Override
	public double calcSalary() {
		
		return 0;
	}

}
