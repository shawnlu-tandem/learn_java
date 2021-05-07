package com.tandem.demo.annotation.example2;

@MakerAnnotation
@SingleValueAnnotation("single value annotation on class")

@FullAnnotation(value = "full annotation on class", age=19, configs = "ABC")
public class Example {

    @SingleValueAnnotation("single value annotation on field")
    public String name;

    @FullAnnotation(value = "full annotation on field", age=30, configs = {"X", "Y"})
    public Object owner;

    @SingleValueAnnotation("single value annotation on method")
    public String getName(){
        return name;
    }

}
