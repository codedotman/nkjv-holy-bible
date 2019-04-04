package com.bible.amplified.test.bible.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 04/03/2019.
 */

public class Library {

    //singleton instance start
    private static Library instance;

    public static Library getInstance() {
        if (instance == null)
            instance = new Library();
        return instance;
    }

    private Library() {}

    //singleton instance end
    String name;
    List<Bible> bibles;

    public void init(String name){
        this.name = name;
        this.bibles = new ArrayList<Bible>();
        //System.out.println("bible added");
    }

    public Bible addBible(Bible bible){
        //Bible bible = new Bible();
        bibles.add(bible);
        return bible;
    }

    public List<Bible> getBibles() {
        return bibles;
    }

    public Bible getBible(int pos){
        return bibles.get(pos);
    }

    public void setBibles(List<Bible> bibles) {
        this.bibles = bibles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize(){
        return bibles.size();
    }

    @Override
    public String toString() {
        //return super.toString();
        return name;
    }
}
