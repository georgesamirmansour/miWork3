package com.example.gogos.miwork;

/**
 * Created by gogos on 2017-10-27.
 */

public class word {
    private static final int noImageProvided = -1;
    private String englishWord;
    private String miWorkWord;
    private int imageResourceID = noImageProvided;
    private int audioResourceId;

    public word(String englishWord, String miWorkWord, int imageResourceID, int audioResourceId) {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
        this.imageResourceID = imageResourceID;
        this.audioResourceId = audioResourceId;
    }

    public word(String englishWord, String miWorkWord, int audioResourceId) {
        this.englishWord = englishWord;
        this.miWorkWord = miWorkWord;
        this.audioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return audioResourceId;
    }

    public void setAudioResourceId(int audioResourceId) {
        this.audioResourceId = audioResourceId;
    }

    public boolean hasImage() {
        return imageResourceID != noImageProvided;
    }
}
