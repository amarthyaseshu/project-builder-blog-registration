package businesslogic;

public class RegistrationValidation {
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		if((validPassword(password,confirmPassword)) && (validEmail(email))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean validPassword(String password, String confirmPassword) {
		System.out.println("Entering into check password");
if((password.equals(confirmPassword)) &&(password.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%]).{8,20})")) && (password!=null) ) {
	System.out.println("Entering if statement");
return true;
}
else {
return false;
}
	}
	private boolean validEmail(String email) {
		if((email.matches("^[A-Za-z0-9+_.]+@(.+)$")) && (email!=null)) {
			return true ;
		}
		else {
			return false;
		}
	}
}