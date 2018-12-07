/**
 * Purpose: Annotation Is Used To Provide Special Property to a method ,field ,class ,variable.
 * @author-Himanshu Prajapati
 * @version-1.0.0
 * @since-7/12/18
 */

package com.javaprog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface MyAnnotationTarget {

	
}
