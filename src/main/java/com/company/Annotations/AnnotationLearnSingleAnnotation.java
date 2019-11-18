package com.company.Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// In case the annotation has only one variable - the name of variable must be value.
// In this case the call of Annotation can be without parameter setting :
//                                                  @MySingleAnnotation(100) instead of @MySingleAnnotation(value = 100)
//
// In case the annotation has more than 1 variable, but all except 1 have default value, it can be done like:
//
// @interface MyAnnotation { int value(), int var1() default 100, int var2() default 3;
// @MyAnnotation(100)
//

@Retention(RetentionPolicy.RUNTIME)
@interface MySingleAnnotation {
    int value();                    // the variable must be named "value"
}

public class AnnotationLearnSingleAnnotation {
    @MySingleAnnotation(100)
    public static void myMethod() {
        AnnotationLearnSingleAnnotation mainObject = new AnnotationLearnSingleAnnotation();
        try {
            Method methodObject = mainObject.getClass().getMethod("myMethod");
            MySingleAnnotation annotationObject = methodObject.getAnnotation(MySingleAnnotation.class);
            System.out.println(annotationObject.value());
        } catch (NoSuchMethodException e) {
            System.out.println("No such Method found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}

