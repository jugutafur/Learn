package constraint;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;

import javax.validation.Constraint;
import javax.validation.Payload;

import constant.Messages;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({TYPE, ANNOTATION_TYPE})
@Constraint(validatedBy = FieldMatchValidator.class)
public @interface FieldMatch {
	String message() default Messages.Annotation.Default.FIELD_MATCH;
	Class<?>[] groups () default {};
	Class<? extends Payload> [] payload() default {};
	String first();
	String second();
}
