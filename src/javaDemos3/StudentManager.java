package javaDemos3;

public class StudentManager extends BaseUserManager {
	
	private double grade;
	
	@Override
	public void add() {
		System.out.println("Öðrenci sisteme kaydedildi.");
	}

	double getGrade() {
		return grade;
	}

	void setGrade(double grade) {
		this.grade = grade;
	}
}
