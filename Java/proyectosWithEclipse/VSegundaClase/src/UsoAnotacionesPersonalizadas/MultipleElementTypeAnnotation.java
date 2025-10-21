/*
package UsoAnotacionesPersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//Creating custom annotation with
//target as multiple Element types as parameters
//which means it can annotate various Elements
@Target({ ElementType.METHOD, ElementType.TYPE,
		ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)

public @interface MultipleElementTypeAnnotation {
	String value() default "Can annotate a class, method, annotation, or constructor";
}
*/