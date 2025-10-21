package constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;

import constant.Messages;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationTargetException;

@Log4j2
public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
	
	private String firstFieldName;
	private String secondFieldName;
	private String message;
	
	@Override
	public void initialize(final FieldMatch constraintAnnotation) {
		firstFieldName = constraintAnnotation.first();
		secondFieldName = constraintAnnotation.second();
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		boolean valid = true;
		try {
			final Object firstObj = BeanUtils.getProperty(value, firstFieldName);
			final Object secondObj = BeanUtils.getProperty(value, secondFieldName);
			
			valid = firstObj == null && secondObj == null || 
					firstObj != null && firstObj.equals(secondObj);
		}catch(IllegalAccessException | 
				InvocationTargetException |
				NoSuchMethodException ignore){
			log.warn(Messages.Log.FIELD_MATCH_ERROR);
			
		}
		
		if(!valid) {
			context.buildConstraintViolationWithTemplate(message)
			.addPropertyNode(firstFieldName)
			.addConstraintViolation()
			.disableDefaultConstraintViolation();
		}
		return valid;
	}
}
