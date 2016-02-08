package com.learning;

import org.springframework.stereotype.Component;

/**
 * Created by keerthiprasad on 12/16/15.
 */
@Component
public class MultiplicationImpl implements Multiplication {

    public int multiply(int a, int b) {
        return a*b;
    }

    public float multiply(float a, float b) {
        return a*b;
    }
}
