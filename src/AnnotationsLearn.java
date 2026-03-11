class Paint {
     public void test(){
         System.out.println("parent wala");
     }
}

class AsianPaint extends Paint{

      @Override
      public void test(){
          System.out.println("child wala");
      }
}

public class AnnotationsLearn {

      public static void main(String[] args){
          Paint p = new AsianPaint();
          p.test();
      }
}

/*

Note:: every annotation has two default annotation 1) @Target({}) where to use on clas, method, variable put in curly
       2)@Retention ---> it tells life line like compile time, runtime, inside .class etc .
1️⃣ Annotation

Annotation is a marker/label added to Java code to provide extra information to compiler or frameworks.

It does not change program logic directly.

Example:

@Override
2️⃣ Creating an Annotation
public @interface MyAnnotation {
}

@interface is used to create a custom annotation.

3️⃣ @Target

Defines where the annotation can be used.

Example:

@Target(ElementType.METHOD)

Common ElementType values:

ElementType	Used On
METHOD	Methods
CLASS / TYPE	Classes
FIELD	Variables
PARAMETER	Method parameters
CONSTRUCTOR	Constructors

Example:

@Target(ElementType.METHOD)
public @interface Test {}

This annotation can be used only on methods.

4️⃣ @Retention

Defines how long the annotation is available.

Example:

@Retention(RetentionPolicy.SOURCE)

Types:

RetentionPolicy	Meaning
SOURCE	Available only in source code (removed after compilation)
CLASS	Stored in .class file but not available at runtime
RUNTIME	Available during program execution (used by frameworks like Spring)
5️⃣ Example
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}

Meaning:

@Override can be used only on methods

It is checked by compiler during compilation

It does not exist at runtime

6️⃣ Common Java Annotations

@Override

@Deprecated

@SuppressWarnings

✅ One line definition (for interview):

Annotation is a metadata mechanism in Java used to provide additional information to the compiler, tools, or frameworks without affecting the program logic.

 */
