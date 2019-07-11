package com.visa.prj.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // annotation available at runtime
@Target(ElementType.TYPE)			// class/interface/annotation is a type
public @interface Table {
	String name();

}
