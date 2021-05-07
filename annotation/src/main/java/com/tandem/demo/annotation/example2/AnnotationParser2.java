package com.tandem.demo.annotation.example2;

import org.reflections.Reflections;

public class AnnotationParser2 {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("com.worldfirst.demo.annotation.example2");

        for (Class<?> cl : reflections.getTypesAnnotatedWith(SingleValueAnnotation.class)) {

            SingleValueAnnotation singleValueAnnotation = cl.getAnnotation(SingleValueAnnotation.class);

            System.out.printf("Found class with SingleValueAnnotation: %s, with annotation value: %s%n",
                    cl.getCanonicalName(), singleValueAnnotation.value());
        }
    }
}
