package com.example.calculator.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calculator.R;
import com.example.calculator.data.Note;

import java.util.ArrayList;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NoteHolder> {

    private List<Note> notes = new ArrayList<>();//Контейнер, в котором хранятся заметки, которые нужно будет отображать в рецайтлеле


    @NonNull
    @Override //Создает новый ViewHolder
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.note_item,parent,false);

        return new NoteHolder(view, listener);
    }

    @Override // Перерисоввываем новый Холдер
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {

       /*
        Note note = notes.get(position);
        holder.bind(note);
        */
        holder.bind(notes.get(position));
    }

    @Override
    public int getItemCount() { // Возвращает кол-во элементов, которые нужно отобразить во View
        return notes.size();
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
        notifyDataSetChanged(); //адаптер уведомляет рецайилер о том, что у него поменялся view
    }

    /*
    Создаем обраточки кликов
     */

    public interface OnNoteClickListener{
        void onNoteClick(Note note);
    }
    private OnNoteClickListener listener;

    public void setOnNoteClickListener(OnNoteClickListener listener){
        this.listener = listener;

    }
}
