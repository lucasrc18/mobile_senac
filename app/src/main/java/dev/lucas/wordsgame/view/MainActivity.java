package dev.lucas.wordsgame.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import dev.lucas.wordsgame.R;
import dev.lucas.wordsgame.controller.WordsController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        TextView meaning = findViewById(R.id.meaning);
        EditText input = findViewById(R.id.input);

        WordsController controller = new WordsController(meaning);

        findViewById(R.id.calc).setOnClickListener(view -> {
            String attempt = input.getText().toString();

            controller.newAttempt(attempt);
        });
    }
}