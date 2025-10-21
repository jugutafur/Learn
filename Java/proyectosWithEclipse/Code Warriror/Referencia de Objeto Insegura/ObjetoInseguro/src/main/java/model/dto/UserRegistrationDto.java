package model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import constraint.FieldMatch;
import constraint.ValidPassword;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import constant.Messages;

import constraint.EmailValidate;

@Getter
@Setter
@AllArgsConstructor			//Constructor with all fields
@NoArgsConstructor			//Constructor default
@FieldMatch(first="password", second="confirPassword", message = Messages.Error.PASSWORD_NOT_MATCH)
public class UserRegistrationDto {
	
	@ValidPassword
	private String password;
	
	@NotEmpty
	private String confirmPassword;
	
	@Pattern(regexp = EmailValidate.REGEX_EMAIL_VALIDATION, message = Messages.Error.INVALID_EMAIL)
	private String email;
	

}
