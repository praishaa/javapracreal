abstract class Employee{
	abstract int calculatesalary(int base);
}
class FullTimeEmployee extends Employee{
	int calculatesalary(int base) {
		return base*3;
	}
}
class PartTimeEmployee extends Employee{
	int calculatesalary(int base) {
		return base*2;
	}
}
public class lollll {
	public static void main(String args[]) {
		Employee emp1=new FullTimeEmployee();
		PartTimeEmployee emp2=new PartTimeEmployee();
		System.out.println(emp1.calculatesalary(1000));
		System.out.println(emp2.calculatesalary(1000));
	}
}
