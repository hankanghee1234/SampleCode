package company;

public class DEmp extends Emp {

	private double daliyPay; // �Ϸ��ϴ� = (�ϴ�X�ٹ���)X0.967
	private int days; // �ٹ��ϼ�

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
