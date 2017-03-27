package company;

public class EmpMain {

	public static void main(String[] args) {

		Emp e1 = new REmp(1, "¡§1", 7000, 50, 14000);
		Emp e2 = new FEmp(2, "«¡2", 700);
		Emp e3 = new DEmp(3, "¿œ3", 5, 17);

		Emp[] arr = { e1, e2, e3 };

		for (Emp emp : arr) {
			
			System.out.println(emp.calcSalary());
			
		}
	}
}
