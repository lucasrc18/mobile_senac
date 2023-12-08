package dev.lucas.wordsgame.controller;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import dev.lucas.wordsgame.model.Word;
import dev.lucas.wordsgame.utils.Utils;

public class WordsController {
    private final Word[] word_list = new Word[]{
        new Word("cavalo", "4 patas, usado para transporte"),
        new Word("casa", "Usado para moradia, normalmente possui de 1 a 2 andares para uma familia unica"),
        new Word("faca", "Pode ser usado como arma ou ferramenta, corta bem as carnes no churrasco")
    };

    TextView meaning;
    private Word currentWord;

    public WordsController(TextView meaning){
        this.meaning = meaning;

        loadNewWord();
    }

    public void newAttempt(String attempt){
        if(attempt == this.currentWord.getWord()){
            Toast.makeText(meaning.getContext(), "Você acertou!", Toast.LENGTH_SHORT).show();
            loadNewWord(attempt);
        }
    }

    private void loadNewWord(){
        this.currentWord = (Word) Utils.choice(word_list);
        this.meaning.setText(this.currentWord.getMeaning());
    }

    private void loadNewWord(String lastWord){
        while(lastWord == this.currentWord.getWord()){
            loadNewWord();
        }
    }
}
