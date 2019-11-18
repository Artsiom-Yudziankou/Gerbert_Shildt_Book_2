package com.company.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// How to use the Annotations and Reflection.
// Retention sets up the rule for Annotation action - RUNTIME allows to use the Annotation by JVM
//


@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation {
    String str();
    int val();
}

public class AnnotationLearnReflection {
    // Annotate method
    @MyAnnotation(str = "Annotation Example", val = 100)

    public static void myMethod() {
        AnnotationLearnReflection annotationLearnReflectionObject = new AnnotationLearnReflection();

        // Get the Annotation and values of it's members
        try {
            // First, get object with type Class
            Class<?> classObject = annotationLearnReflectionObject.getClass();
            // Then get the object with type Method
            Method methodObject = classObject.getMethod("myMethod");
            // Then get annotation for this class
            MyAnnotation annotationObject = methodObject.getAnnotation(MyAnnotation.class);
            // Print the values of annotation members
            System.out.println(annotationObject.str() + " " + annotationObject.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method wasn't found.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}



