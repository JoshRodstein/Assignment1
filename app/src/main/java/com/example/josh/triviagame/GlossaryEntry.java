/*
* By: Joshua Rodstein
* Assignment1 - CS1699
* PItt: jor94@pitt.edu
* ID: 4021607
*
* */


package com.example.josh.triviagame;

/**
 * Created by Josh Rodstein on 1/24/18.
 *
 * GlossaryEntry class represents the Term and matching definition
 * to be added to or read from an existing glossary file.
 */

class GlossaryEntry {
    private String term;
    private String definition;

    public GlossaryEntry(String t, String d){
        this.term = t;
        this.definition = d;
    }

    public String getTerm(){
        return this.term;
    }

    public String getDefinition(){
        return this.definition;
    }

    public void setTerm(String t){
        this.term = t;
    }

    public void setDefinition(String d){
        this.definition = d;
    }

}
