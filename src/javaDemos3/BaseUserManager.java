package javaDemos3;

public class BaseUserManager {

	private int id;
	private String firstName;
	private String lastName;
	private String tckn;

	public void add() {
		System.out.println("Kullan�c� eklendi");
	}

	public int getId() {
		return id;
	}

	public String getTckn() {
		return tckn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
