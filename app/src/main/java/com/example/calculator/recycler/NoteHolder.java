package com.example.calculator.recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calculator.R;
import com.example.calculator.data.Note;

public class NoteHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView description;
    private Note note;

    public NoteHolder(@NonNull View itemView, NotesAdapter.OnNoteClickListener listener) {
        super(itemView);

        title = itemView.findViewById(R.id.note_title);
        description = itemView.findViewById(R.id.note_description);
        itemView.setOnClickListener(view -> {
            listener.onNoteClick(note); // Сообщает, что на конкретную note произвели щелчок
        }); //ЛЯМДА

    }

    void bind (Note note){
        this.note = note; // Храним, какая note является текущей
        title.setText(note.getTitle());
        description.setText(note.getDescription());
    }

}
