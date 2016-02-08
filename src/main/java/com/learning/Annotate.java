package com.learning;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by keerthiprasad on 12/30/15.
 */
public class Annotate {
    private String stName;
    private Integer social;

    public String getStName() {
        return stName;
    }
    @Required
    public void setStName(String stName) {
        this.stName = stName;
    }

    public Integer getSocial() {
        return social;
    }
    @Required
    public void setSocial(Integer social) {
        this.social = social;
    }
}
