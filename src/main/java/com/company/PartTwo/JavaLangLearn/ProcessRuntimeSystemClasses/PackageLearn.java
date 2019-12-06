package com.company.PartTwo.JavaLangLearn.ProcessRuntimeSystemClasses;

//----------------------------------------------------------------------------------------------------------------------
//                                              Packages class
//----------------------------------------------------------------------------------------------------------------------
// 1.  Methods
//-------------------------------------
//
// <A extends Annotation> A getAnnotation
//                              (Class<A> annotationType)   - returns annotation with type.
// Annotation[] getAnnotations()                            - returns all annotations.
// <A extends Annotation> A[] getAnnotationByType
//                              (Class<A> annotationType)   - returns all annotations with type.
// <A extends Annotation> A[] getDeclaredAnnotation
//                              (Class<A> annotationType)   - returns inherited annotations with type.
// Annotation[] getDeclaredAnnotations()                    - returns all annotations without inherited.
// <A extends Annotation> A[] getDeclaredAnnotationByType
//                              (Class<A> annotationType)   - returns not inherited annotations with type.
// String getImplementationTitle()                          - returns title of package.
// String getImplementationVendor()                         - returns the name of realizer of package.
// String getImplementationVersion()                        - returns the version of package.
// String getName()                                         - returns the name of package.
// static Package getPackage(String packageName)            - returns package with name.
// static Package[] getPackages()                           - returns all packages.
// String getSpecificationTitle()                           - returns the title of specification of package.
// String getSpecificationVendor()                          - returns the name of owner of calling package.
// String getSpecificationVersion()                         - returns the version of specification.
// int hashCode()                                           - returns the hashCode of package.
// boolean isAnnotationPresent
//              (Class<? extends Annotation> annotation)    - checks if the annotation is present.
// boolean isCompatibleWith(String version)
//                          throws NumberFormatException    - checks if the package is <= version.
// boolean isSealed()                                       - checks if the package is isolated.
// boolean isSealed(URL url)                                - checks if the package is isolated according to url.
// String toString()                                        - returns the String.



public class PackageLearn {
    public static void main(String[] args) {
        Package packageArray [];
        packageArray = Package.getPackages();
        for (int i = 0; i < packageArray.length; i++) {
            System.out.println(packageArray[i].getName() + " " + packageArray[i].getImplementationTitle() + " "
                    + packageArray[i].getImplementationVendor() + " " + packageArray[i].getImplementationVersion());
        }
    }
}
