package com.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by keerthiprasad on 1/18/16.
 */
@Configuration
public class CalculatorConfig {
    @Bean
    public Calculator myCal(){
        Calculator cal = new Calculator();
        //cal.setDivision(myDiv());
       // cal.setMultiplication(myMul());
        return new Calculator();
    }
    @Bean
    public DivisionImpl myDiv(){
        return new DivisionImpl() ;
    }
    @Bean
    public MultiplicationImpl myMul(){
        return new MultiplicationImpl();

    }

}
