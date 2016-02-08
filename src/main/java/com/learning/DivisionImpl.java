package com.learning;

import org.springframework.stereotype.Component;

/**
 * Created by keerthiprasad on 12/16/15.
 */
@StereoAnnotation
public class DivisionImpl implements Division{
    public int divide(int a, int b) {
        if(b!=0)
            return a/b;
        else
            return -1;
    }
}
