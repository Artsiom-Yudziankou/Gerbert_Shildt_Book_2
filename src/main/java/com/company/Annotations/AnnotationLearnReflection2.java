package com.company.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// For getting the all annotations the getAnnotations() can be used, it returns the array of annotations
// with type Annotation.
// For getting the all Declared non-extended annotations : Annotation[] getDeclearedAnnotations()
// For getting the information If the annotation exists for object:
//                                          boolean isAnnotationPresent(Class<? extends Annotation> type of Annotation)

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationDescription {
    String description();
}

@MyAnnotationDescription(description = "Annotation of test class")
@MyAnnotation2(str ="AnnotationLearnReflection2", val= 99)
public class AnnotationLearnReflection2 {
    @MyAnnotationDescription(description = "Annotation of test class")
    @MyAnnotation2(str ="methodForCheckReflection2", val= 98)
    public static void methodForCheckReflection2() {
        AnnotationLearnReflection2 annotationLearnReflection2Object = new AnnotationLearnReflection2();
        try {
            // Print all annotations for Class AnnotationLearnReflection2
            Annotation annotation[] = annotationLearnReflection2Object.getClass().getAnnotations();
            System.out.println("All annotations for class:");
            for (Annotation a: annotation
                 ) {
                System.out.println(a);
            }
            System.out.println();
            // Print all annotations for Method methodForCheckReflection2
            Method methodObject = annotationLearnReflection2Object.getClass().getMethod("methodForCheckReflection2");
            annotation = methodObject.getAnnotations();
            System.out.println("All annotations for method:");
            for (Annotation a:
                 annotation) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method wasn't found.");
        }
    }

    public static void main (String[] args) {
        methodForCheckReflection2();
    }
}
