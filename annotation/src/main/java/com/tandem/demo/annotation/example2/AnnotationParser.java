package com.tandem.demo.annotation.example2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationParser {

    public static void main(String[] args) throws ClassNotFoundException {
        parseAnnotationOnClass();
        //parseAnnotationOnMethods();
        //parseAnnotationOnMethods();
    }

    public static void parseAnnotationOnClass() throws ClassNotFoundException  {
        Class cls = Class.forName("com.tandem.demo.annotation.example2.Example");
        Annotation[] annotations = cls.getDeclaredAnnotations();
        parseAnnotations(annotations);
    }


    public static void parseAnnotationOnMethods() throws ClassNotFoundException{
        Class cls = Class.forName("com.tandem.demo.annotation.example2.Example");
        Method[] methods = cls.getMethods();
        for (Method method: methods) {
            Annotation[] annotations = method.getAnnotations();
            parseAnnotations(annotations);
        }

    }

    public static void parseAnnotationOnFields() throws ClassNotFoundException{
        Class cls = Class.forName("com.tandem.demo.annotation.example2.Example");
        Field[] fields = cls.getFields();

        for (Field field: fields) {
            Annotation[] annotations = field.getAnnotations();
            parseAnnotations(annotations);
        }
    }

    private static void parseAnnotations(Annotation[] annotations){
        for (Annotation annotation: annotations) {
            if (annotation instanceof MakerAnnotation) {
                System.out.println("============ There is a maker annotation  ============");
            }
            if (annotation instanceof SingleValueAnnotation) {
                System.out.println("============  There is a single annotation ============");
                String value = ((SingleValueAnnotation) annotation).value();
                System.out.println("single annotation Value is :" + value);
            }

            if (annotation instanceof FullAnnotation) {
                System.out.println("============ There is a full annotation ============");
                FullAnnotation fullAnnotation = (FullAnnotation) annotation;
                String value = fullAnnotation.value();
                System.out.println("full annotation Value is :" + value);

                int age = fullAnnotation.age();
                System.out.println("   Age is: " + age);

                String[] configs = fullAnnotation.configs();
                for (String config: configs) {
                    System.out.println("    Config: " + config);
                }
            }
        }
    }

}
