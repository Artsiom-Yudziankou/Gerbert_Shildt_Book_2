package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Boolean class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Constructors
//-------------------------------------
//
//
//
//-------------------------------------
// 3. Methods
//-------------------------------------
//
// static Class<?> forName(Module module, String name)      - returns Class object.
// static Class<?> forName(String name)
//                          throws ClassNotFoundException   - returns Class object.
// static Class<?> forName(String name,
//                   boolean way, ClassLoader loader)
//                          throws ClassNotFoundException   - returns Class object. (way: true - initialize,
//                                                                                              false - no initialize)
// <A extends Annotation> A getAnnotation
//                              (Class <A> annotationType)  - returns Annotation object according to Type.
// Annotation[] getAnnotations()                            - get annotations connected with calling object.
// <A extends Annotation> A[] getAnnotationsByType
//                              (Class <A> type Annotation) - get annotations connected with calling object by type.
// Class <?> [] getClasses()                                - returns Class objects foreach open class and interface of object.
// ClassLoader getClassLoader()                             - returns ClassLoader object.
// Constructor<T> getConstructor(Class ... paramType)
//          throws NoSuchMethodException, SecurityException - returns Constructor object.
// Constructor<?> [] getConstructors()
//                                 throws SecurityException - get Constructor objects foreach open constructor.
// Annotation[] getDeclaredAnnotations()                    - get Annotation objects.
// <A extends Annotation> A[] getDeclaredAnnotationsByType
//                                (Class<A> annotationType) - returns array of non-inherited annotations by type.
// Constructor<?>[] getDeclaredConstructors()
//                                 throws SecurityException - get Constructor objects foreach declared constructor.
//                                                            (super class constructors are ignored).
// Field[] getDeclaredFields() throws SecurityException     - get Field objects foreach field declared in class or interface.
//                                                            (inherited fields are ignored).
// Filed[] getFields() throws SecurityException             - get Field objects for each open field, class or interface.
// Class<?> [] getInterfaces()                              - get implemented Interfaces or extended in case of interface.
// Method getMethod (String methodName,
//                             Class<?> .. paramType)
//         throws  NoSuchMethodException, SecurityException - returns Method object.
// Method [] getMethods() throws SecurityException          - get Method objects foreach oper method from class or interface.
// Module getModule()                                       - returns Module object.
// String getName()                                         - returns full name of class or interface.
// ProtectionDomain getProtectionDomain()                   - returns ProtectionDomain.
// Class <? super T> getSuperclass()                        - returns superclass.
// boolean isInterface()                                    - checks if object is interface.
// String toString()                                        - returns String performance of object.
//

public class ClassLearn {
    public static void main(String [] args) {
        ClassCheckX xObject = new ClassCheckX();
        ClassCheckY yObject = new ClassCheckY();
        Class <?> classObject;

        classObject = xObject.getClass();   // reference for Class object.
        System.out.println("xObject: " + classObject.getName());

        classObject = yObject.getClass();   // reference for Class object.
        System.out.println("yObject: " + classObject.getName());

        classObject = classObject.getSuperclass();
        System.out.println("ClassCheckY has a superClass: " + classObject.getName());


    }
}

class ClassCheckX {
    int intValue;
    float floatValue;
}

class ClassCheckY extends ClassCheckX {
    double doubleValue;
}


