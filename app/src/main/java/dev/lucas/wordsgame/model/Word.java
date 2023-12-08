package dev.lucas.wordsgame.model;

public class Word {
    private int id;
    private String word, meaning;

    public Word(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getWord(){
        return this.word;
    }

    public String getMeaning(){
        return this.meaning;
    }
}
