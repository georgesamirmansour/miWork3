package com.example.gogos.miwork;

/**
 * Created by gogos on 2017-10-27.
 */

public class word {
    private String englishWord;
    private String miWorkWord;
    private int imageResourceID = noImageProvided;
    private static final int noImageProvided = -1;

    public word(String englishWord, String miWorkWord, int imageResourceID) {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
        this.imageResourceID = imageResourceID;
    }

    public word(String englishWord, String miWorkWord) {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getMiWorkWord() {
        return miWorkWord;
    }

    public void setMiWorkWord(String miWorkWord) {
        this.miWorkWord = miWorkWord;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
    public boolean hasImage(){
        return imageResourceID != noImageProvided;
    }
}
