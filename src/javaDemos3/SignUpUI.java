package javaDemos3;

public class SignUpUI {

	private BaseUserManager user;

	public SignUpUI(BaseUserManager user) {
		this.user = user;
	}

	public void signUp() {
		user.add();
	}
}
