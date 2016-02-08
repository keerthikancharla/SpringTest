package com.learning;

/**
 * Created by keerthiprasad on 12/10/15.
 */
public class Learn {
    private int i=4;
    private int j=6;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int add(int i, int j)
    {
        int k;
        k=i+j;
        System.out.println("My final sum"+ k);
        return k;
    }

}
