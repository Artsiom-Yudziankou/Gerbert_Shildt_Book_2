package com.company.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Marker Annotations used without any vars and params in it.
// with: boolean isAnnotationPresent(Class<? extends Annotation> typeOfAnnotation) - it can be checked if this
// class connected with neccessary Annotation.


@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotationMarker{ }

public class AnnotationLearnMarkerAnnotations {
    @MyAnnotationMarker
    public static void myMarkerMethod() {
        AnnotationLearnMarkerAnnotations mainObject = new AnnotationLearnMarkerAnnotations();
        try {
            Method methodObject = mainObject.getClass().getMethod("myMarkerMethod");
            if (methodObject.isAnnotationPresent(MyAnnotationMarker.class))
                System.out.println("Marker Annotation exists.");
            else System.out.println("No marker Annotations exist.");
        } catch (NoSuchMethodException e) {
            System.out.println("Method wasn't found");
        }
    }

    public static void main(String[] args) {
        myMarkerMethod();
    }
}
