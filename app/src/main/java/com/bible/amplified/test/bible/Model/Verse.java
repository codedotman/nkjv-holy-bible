package com.bible.amplified.test.bible.Model;

import java.util.ArrayList;

/**
 * Created by USER on 03/03/2019.
 */

public class Verse {

    Integer num;
    String verse;

    public Verse(Integer num, String verse){
        this.num = num;
        this.verse = verse;
    }


    @Override
    public String toString() {
        //return super.toString();
        return num + " " + verse;
    }


}
