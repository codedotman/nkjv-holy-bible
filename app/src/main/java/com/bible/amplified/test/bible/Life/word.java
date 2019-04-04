package com.bible.amplified.test.bible.Life;

/**
 * Created by USER on 14/03/2019.
 */

public class word {

    private String mDefaultTranslation;
    private String mBibleBook;
    private String mBibleWord;


    public word(String defaultTranslation) {

        mDefaultTranslation = defaultTranslation;
    }

    public word (String BibleBook, String BibleWord){

        mBibleBook = BibleBook;
        mBibleWord = BibleWord;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getBibleBook(){
        return mBibleBook;
    }

    public String getBibleWord(){
        return mBibleWord;
    }

    @Override
    public String toString() {
        return "Word{" +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                '}';
    }

}






