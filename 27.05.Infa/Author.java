import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// public interface Author extends Annotation {
public @interface Author {
	String name();	
	int year() default 2000;
}