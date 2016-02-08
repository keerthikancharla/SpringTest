package com.learning;

import com.sun.tracing.dtrace.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by keerthiprasad on 12/16/15.
 */
@StereoAnnotation
public class Calculator {
    //@Autowired(required = false)
    @Named("kee")
    private Integer kee =5;
    //@Autowired(required = false)
    @Named("kee3")
    private Integer pus=9;
    @Autowired
    private Division division;

    private Multiplication multiplication;
   public Calculator(){

    }
    public int getKee() {
        return kee;
    }

    public void setKee(int kee) {
        this.kee = kee;
    }

    public int getPus() {
        return pus;
    }

    public void setPus(int pus) {
        this.pus = pus;
    }

    public Division getDivision() {
        return division;
    }
    @Resource
    public void setDivision(Division division) {
        this.division = division;
    }

    public Multiplication getMultiplication() {
        return multiplication;
    }
   @Autowired
    public void setMultiplication(Multiplication multiplication) {
        this.multiplication = multiplication;
    }

    public int divide(int a,int b) {
        return division.divide(a,b);
    }
    public int multiply(int a,int b) {
        return multiplication.multiply(a,b);
    }
//@Autowired(required = false)
    public int add(){
        return kee+pus;
    }

    public void setup(){
        System.out.println("calculator init method");
    }

    public void destroy(){
        System.out.println("calculator destroy method");
    }
}
