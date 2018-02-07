package com.example.josh.assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;


import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

/**
 * Created by josh on 1/24/18.
 */

public class GlossaryTable {
    private ArrayList<GlossaryEntry> glossaryEntries;
    private Map<Integer, Integer> indexMap;
    private GlossaryEntry sample;
    private Scanner scan;

    public GlossaryTable(InputStream file1) throws FileNotFoundException {
        String term, def;
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(file1));
        glossaryEntries = new ArrayList<GlossaryEntry>();
        try {
            while ((term = reader1.readLine()) != null && (def = reader1.readLine()) != null) {
                glossaryEntries.add(new GlossaryEntry(term, def));
            }
        } catch (Exception e){
            System.exit(1);
        }
    }

    public void addGloss(String s) throws FileNotFoundException {
        String term, def;
        String[] ssplit = s.split("\n");
        try {
            for(int i = 0; i < ssplit.length; i++){
                glossaryEntries.add(new GlossaryEntry(ssplit[i], ssplit[i+1]));
                i++;
            }
        } catch (Exception e){
            //System.exit(1);
        }
    }

    public String getDefinitionByTerm(String term){
        return glossaryEntries.get(glossaryEntries.indexOf(term)).getDefinition();
    }

    public String getTermByDef(String definition){
        return glossaryEntries.get(glossaryEntries.indexOf(definition)).getTerm();
    }

    public String getTermByIndex(int index){
        return glossaryEntries.get(index).getTerm();
    }

    public String getDefinitionByIndex(int index){
        return glossaryEntries.get(index).getDefinition();
    }

    public int getSize(){
        return glossaryEntries.size();
    }

    public void shuffle(){
        Collections.shuffle(glossaryEntries);
    }



}
