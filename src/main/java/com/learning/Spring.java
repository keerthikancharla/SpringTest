package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by keerthiprasad on 12/10/15.
 */
public class Spring {

    static ApplicationContext appcontxt = new AnnotationConfigApplicationContext(CalculatorConfig.class);

    public static void main(String Args[]) {
        Calculator calculator = (Calculator)appcontxt.getBean("myCal");
        //Annotate ann=appcontxt.getBean("Ann",Annotate.class);
        //Player player =appcontxt.getBean("collWiring",Player.class);
        //for (int j=0;j<player.getTeams().size();j++)
        //System.out.println("list"+player.getTeams().toArray()[j]);
        System.out.println("multiplication" + calculator.multiply(2, 6));
        System.out.println("division" + calculator.divide(12, 6));
        System.out.println("addition" + calculator.add());
        System.out.println("n-1234".split("n-")[1]);
        System.out.println("Inside main");
        /*if(appcontxt.containsBean("multiply"))
            System.out.println("contains");
        System.out.println("getType:"+appcontxt.getType("multiply"));*/
        //System.out.println("my name"+ann.getStName().toUpperCase());
       // System.out.println("my SSN"+ann.getSocial());
       /* for (int i = 0; i <2 ; i++) {
            calculator = appcontxt.getBean("calculator", Calculator.class);
            //Calculator calculator2= new Calculator();
            System.out.println("bean"+calculator);
            //System.out.println("new obj"+calculator2);
            FactoryImpl factory = FactoryImpl.getFactoryObject();
            System.out.println(factory);
        }*/
    }

}
