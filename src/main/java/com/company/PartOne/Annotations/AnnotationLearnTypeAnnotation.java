package com.company.PartOne.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Marker-Annotation, that can be used for annotation of Type of Data.
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}

// Marker-Annotation, that can be used for annotation of Type of Data.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

// Marker-Annotation, that can be used for annotation of Type of Data.
@Target(ElementType.TYPE_USE)
@interface Unique {}

// Parameter-Annotation, that can be used for annotation of Type of Data.
@Target(ElementType.TYPE_USE)
@interface MaxLen {    int value(); }

//Annotation, that can be used for annotation of Parameter of Type.
@Target(ElementType.TYPE_PARAMETER)
@interface What { String description(); }

// Marker annotation that can be used for annotation of field.
@Target(ElementType.FIELD)
@interface EmptyOk {}

// Marker annotation, that can be used for annotation of method.
@Target(ElementType.METHOD)
@interface Recommended {}

//Type annotation in parameter type.
public class AnnotationLearnTypeAnnotation <@What(description = "General type of data") T>{
    // Type annotation in constructor.
    public @Unique AnnotationLearnTypeAnnotation() {}

    // Annotation of type (String), not the field.
    @TypeAnno String str;

    // Annotation of field.
    @EmptyOk String test;

    // Annotation of array access mode to elements.
    String @MaxLen(10) [] @NotZeroLen [] w;

    // Annotation of the type of elements.
    @TypeAnno Integer[] vec;

    // Annotation of reference this.
    public int getInt10 (@TypeAnno AnnotationLearnTypeAnnotation<T> this, int x) { return 10; }

    // Annotation of return.
    public @TypeAnno Integer getJK (int j, int k) { return j + k; }

    // Annotation of method declaration
    public @Recommended Integer getHalfOfLength (String str) {
        return str.length();
    }

    // Annotation of Exception
    public void trialFunc() throws @TypeAnno NullPointerException {}

    public static void myMethod(int varInteger) {
        // Annotation of the argument of type.
        AnnotationLearnTypeAnnotation<@TypeAnno Integer> mainObject = new AnnotationLearnTypeAnnotation<>();
        // Annotation of the operator new.
        @Unique AnnotationLearnTypeAnnotation<Integer> secondaryObject = new @Unique AnnotationLearnTypeAnnotation<>();

        Object arrayInteger = new Integer(varInteger);
        Integer commonIntegerVar;

        // annotation of "приведение" of types.
        commonIntegerVar = (@TypeAnno Integer) arrayInteger;
    }

    public static void main(String args[]) {
        myMethod(10);
    }
}

class AdditionalClass extends @TypeAnno AnnotationLearnTypeAnnotation<Boolean> {}
