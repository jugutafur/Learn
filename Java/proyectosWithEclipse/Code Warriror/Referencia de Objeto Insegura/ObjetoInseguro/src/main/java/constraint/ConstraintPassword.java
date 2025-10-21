package constraint;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordValidator;
import org.passay.LengthRule;
import org.passay.WhitespaceRule;
import org.passay.RuleResult;
import org.passay.PasswordData;

import org.springframework.stereotype.Component;

@Component
public class ConstraintPassword implements ConstraintValidator<ValidPassword, String>{
	
	@Override
	public void initialize(ValidPassword constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
		PasswordValidator validator = new PasswordValidator(Arrays.asList(				
				new LengthRule(10,160),
				new CharacterRule(EnglishCharacterData.UpperCase, 1),
				new CharacterRule(EnglishCharacterData.LowerCase, 1),
				new CharacterRule(EnglishCharacterData.Digit, 1),
				new CharacterRule(EnglishCharacterData.Special, 1),
				new WhitespaceRule()
				));
		if(password == null) {
			return false;
		}
		final RuleResult result = validator.validate(new PasswordData(password));
		
		if(result.isValid()) {
			return true;
		}
		
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate(String.join("\n", 
				validator.getMessages(result)))
				.addConstraintViolation();
		return false;
	}
}
