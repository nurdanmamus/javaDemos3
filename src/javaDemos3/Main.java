package javaDemos3;

public class Main {

	public static void main(String[] args) {
		
		SignUpUI signUpUI = new SignUpUI(new StudentManager());
		signUpUI.signUp();

	}

}
