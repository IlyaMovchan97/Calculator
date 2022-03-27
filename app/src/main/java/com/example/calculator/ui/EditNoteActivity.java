package com.example.calculator.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;
import com.example.calculator.data.Note;

public class EditNoteActivity extends AppCompatActivity {
    private Note note;
    private EditText NoteSetName;
    private EditText NoteSetText;
    private Button ButSaveNote;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        note = (Note) getIntent().getSerializableExtra(Note.NOTE);
        NoteSetName = findViewById(R.id.note_set_name);
        NoteSetText = findViewById(R.id.note_set_text);
        ButSaveNote = findViewById(R.id.but_save_note);

        setContentView(R.layout.activity_edit_note);

    }

    void saveNote(){
        Intent result = new Intent();
        result.putExtra(Note.NOTE,note);
        setResult(RESULT_OK, result);
        finish();
    }

}
