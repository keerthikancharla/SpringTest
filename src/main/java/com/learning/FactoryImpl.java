package com.learning;

/**
 * Created by keerthiprasad on 12/22/15.
 */
public class FactoryImpl {
    private static FactoryImpl factory;
    private FactoryImpl(){
        System.out.println("Private Constructor");
    }
    public static FactoryImpl getFactoryObject(){
        if(factory==null)
            factory = new FactoryImpl();
        return factory;

    }
}
