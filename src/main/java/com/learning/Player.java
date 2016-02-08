package com.learning;

import java.util.List;

/**
 * Created by keerthiprasad on 12/26/15.
 */
public class Player {
    private String [] quotes;
    private String name;
    private List<Teams> teams;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String[] getQuotes() {

        return quotes;
    }

    public void setQuotes(String[] quotes) {

        this.quotes = quotes;
    }

    public List<Teams> getTeams() {

        return teams;
    }

    public void setTeams(List<Teams> teams) {

        this.teams = teams;
    }
}
