package javaDemos3;

public class InstructorManager extends BaseUserManager{
	
	private double salary;
	
	@Override
	public void add() {
		System.out.println("��retment sisteme kaydedildi.");
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
}
