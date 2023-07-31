package day26.annotest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE_USE,ElementType.LOCAL_VARIABLE,ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {	
	String value() default "";//value属性在赋值的时候可以省略
}
