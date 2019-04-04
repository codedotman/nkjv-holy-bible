package com.bible.amplified.test.bible.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 03/03/2019.
 */

public class Book {

    String name;
    List<Chapter> chapters;

    public Book(String name){
        this.name = name;
        this.chapters = new ArrayList<Chapter>();
    }

    public Chapter addChapter(Chapter chapter){
        Chapter myChapter = chapter;
        chapters.add(chapter);
        return myChapter;
    }

    public String getName() {
        return name;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        //return super.toString();
        return this.name;
    }

    public Chapter getChapter(int pos){
        return chapters.get(pos);
    }

    public int getSize(){
        return chapters.size();
    }
}
