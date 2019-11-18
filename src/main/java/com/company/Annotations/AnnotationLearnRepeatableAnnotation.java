package com.company.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Create repeat annotation.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyContainerRepeatableAnno.class)
@interface MyRepeatableAnno {
    String str() default "Testing";
    int val() default 9000;
}

// Create container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyContainerRepeatableAnno {
    MyRepeatableAnno [] value();
}


public class AnnotationLearnRepeatableAnnotation {
    @MyRepeatableAnno(str = "First Annotation", val = -1)
    @MyRepeatableAnno(str = "Second Annotation", val = 100)
    public static void myMethod(String str, int i) {
        AnnotationLearnRepeatableAnnotation mainObject = new AnnotationLearnRepeatableAnnotation();
        try {
            Class<?> classObject = mainObject.getClass();
            Method methodObject = classObject.getMethod("myMethod", String.class, int.class);
            Annotation annotationObject = methodObject.getAnnotation(MyContainerRepeatableAnno.class);
            System.out.println(annotationObject);
        } catch (NoSuchMethodException e) {
            System.out.println("method wasn't found.");
        }
    }
    public static void main(String[] args) {
        myMethod("test", 10);
    }
}
