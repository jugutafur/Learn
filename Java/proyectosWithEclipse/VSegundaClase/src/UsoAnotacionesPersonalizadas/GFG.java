package UsoAnotacionesPersonalizadas;
// Java program to Illustrate Targeted Annotations

// Importing required classes from java.lang package
import java.lang.annotation.*;

// Creating a custom annotation with target
// as TYPE which means it can annotate a class,
// enumeration, or interface
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

// Class Annotation
@interface ClassAnnotation
{
	String value() default "Can annotate a class";
}

// Creating custom annotation with
// target as multiple Element types as parameters
// which means it can annotate various Elements
@Target({ ElementType.METHOD, ElementType.TYPE,
		ElementType.ANNOTATION_TYPE,
		ElementType.CONSTRUCTOR })
@Retention(RetentionPolicy.RUNTIME)
@interface MultipleElementTypeAnnotation
{

	String value() default "Can annotate a class, method, "
		+ "annotation, or constructor";
}

// Class to demonstrate the use of custom
// created annotations
@ClassAnnotation

// Main class
// TargetAnnotationDemo
public class GFG {

	@MultipleElementTypeAnnotation public void myMethod() {}

	// Main drive method
	public static void main(String[] args) throws Exception
	{
		GFG obj = new GFG();

		// Accessing the annotations used to annotate the
		// class and storing them in an array of Annotation
		// type since only one annotation is used to
		// annotate our class therefore we print a[0]
		Annotation a[] = obj.getClass().getAnnotations();

		System.out.println(a[0]);
		System.out.println("UNo");
		// Accessing the annotations used to annotate the
		// method and storing them in an array of Annotation
		// type
		Class<?> className = Class.forName("GFG");
		Annotation b[] = className.getMethod("myMethod")
							.getAnnotations();

		System.out.println(b[0]);
	}
}
