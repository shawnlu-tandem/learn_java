package com.tandem.demo.annotation.exercise;

import org.reflections.Reflections;
import java.lang.reflect.Field;
import java.util.HashMap;

public class SpringContainer {

    private static SpringContainer instance;

    public static synchronized SpringContainer getInstance() {
        if (instance == null) {
            instance = new SpringContainer();
        }
        return instance;
    }

    private HashMap<String, Object> beans = new HashMap<String, Object>();

    // You are not allowed to change the signature of `private SpringContainer()`
    // You can add private variables
    // You can add private methods
    // You have to add 2 more Annotations in this package: Component, Autowired
    // You are only allowed to write code start from here

    private SpringContainer() {
        Reflections reflections = new Reflections("com.tandem.demo.annotation.exercise");
//
//        for (Class<?> cl : reflections.getTypesAnnotatedWith(Component.class)) {
//            try {
//                Object object = cl.newInstance();
//                String key = cl.getCanonicalName();
//                //beans.put(key, object);
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }

    }

    // You are allowed to write code end to here
    public Object getBeanByClass(Class<?> cls) {
        return beans.get(cls.getCanonicalName());
    }

}
