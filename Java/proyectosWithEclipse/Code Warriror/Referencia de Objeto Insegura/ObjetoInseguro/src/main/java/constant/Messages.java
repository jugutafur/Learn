package constant;

public interface Messages {
	
	interface Annotation{
		interface Default{
			String FIELD_MATCH = "The fiels must match";
			String VALID_PASSWORD = "Your password is invalid";
		}
	}
	
	interface Log{
		String FIELD_MATCH_ERROR = "A validation error in the field match";
		String PASSWORD_BRUTE_FORCE = "Password Brute force ocurred. User id: %d";
	}

	interface Error {
		String FIND_ACCOUNT_ACTIVATION_TOKEN ="Could not find account activation token.";
		String EXPIRED_ACCOUNT_ACTIVATION_TOKEN = "Token has expired, Please request a new account activation link.";
		String EXPIRED_JWT_TOKEN = "Jwt token has expired.";
		String INVALID_EMAIL = "Invalid email.";
		String PASSWORD_NOT_MATCH = "the password fields must match.";
		String INVALID_CREDENTIALS = "Invalid user or password.";
		String INVALID_KEY_STORE = "Invalid keyStore.";
		String SECRET_KEY_GENERATION_FAILED= "Secret key generation failed.";
		String ENCRYPT_FAILED = "Encrypt failed.";
		String DECRYPT_FAILED = "Decrypt failed.";
		String SEND_EMAIL = "An error occurred while sending a message.";
		String ROLE_NOT_FOUND = "Role not found.";
		String ERROR_OCCURRED = "An error has occurred, please return to the main page.";
	}
	
	String SUCCESS_ACCOUNT_ACTIVATION = "You successfully activated your account.";
	String ACTIVATION_LINK_SENT = "tou will receive"
			+ "an activation link at the "
			+ "email address you entered during "
			+ "registration."
			+ "Select the link in the email to active"
			+ "your account.";
}
