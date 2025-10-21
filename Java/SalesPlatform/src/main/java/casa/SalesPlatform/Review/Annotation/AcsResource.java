package casa.SalesPlatform.Review.Annotation;

import casa.SalesPlatform.Review.Schema.AccessResource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface AcsResource {
	public AccessResource accessResource();
	
}
