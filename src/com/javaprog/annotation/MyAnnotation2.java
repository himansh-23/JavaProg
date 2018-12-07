/**
 * Purpose: Annotation Is Used To Provide Special Property to a method ,field ,class ,variable.(Multi Annotation)
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-7/12/18
 */

package com.javaprog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface MyAnnotation2 {
	int value1() default 5;  
	String value2()default "xyz";  
	String value3()default "Himanshu";  
	}  

