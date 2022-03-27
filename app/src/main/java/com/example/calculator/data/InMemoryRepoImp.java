package com.example.calculator.data;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepoImp implements Repo {

    //Singleton - прежде всего, проверяет равен ли репо нулю. Создается с помощью статического инициализатора
    private static InMemoryRepoImp repo;

    private InMemoryRepoImp()
    {
        init();
    }

    private void init() {
        create(new Note("title 1", "Description 1"));
        create(new Note("title 2", "Description 2"));
        create(new Note("title 3", "Description 3"));
        create(new Note("title 4", "Description 4"));
        create(new Note("title 5", "Description 5"));
        create(new Note("title 6", "Description 6"));
        create(new Note("title 7", "Description 7"));
        create(new Note("title 8", "Description 8"));
        create(new Note("title 9", "Description 9"));
        create(new Note("title 10", "Description 10"));
        create(new Note("title 11", "Description 11"));
        create(new Note("title 12", "Description 12"));
        create(new Note("title 13", "Description 13"));
        create(new Note("title 14", "Description 14"));
        create(new Note("title 15", "Description 15"));

    }

    public static InMemoryRepoImp getInstance() // Статический инициализатор
    {
        if (repo == null) {
            repo = new InMemoryRepoImp();
        }
        return repo;
    }

    private ArrayList<Note> notes = new ArrayList<>();
    private int counter = 0;

    @Override
    public int create(Note note) { //Создать, присвоить и вывести id заметки
        int id = counter++;
        note.setId(id); //Создаем заметке id
        notes.add(note); //Присваиваем заметке id

        return id; //Возвращаем id заметки
    }

    @Override
    public Note read(int id) { //Найти заметку по идетификатору
        for (int i = 0; i < notes.size(); i++){
            if (notes.get(i).getId() == id)
                return notes.get(i);
        }
        return null;
    }

    @Override
    public void update(Note note) { //Обновляем содержимое заметки
        for (int i = 0; i < notes.size(); i++){
            if (notes.get(i).getId() == note.getId()){ //Если ид в цикле = ид имеющийся, то..
                notes.set(i, note); // ..бновляем заметку имеющуюся на ту, которую передают и..
                break; //... и выходим из цикла
            }
        }

    }

    @Override
    public void delete(int id) { //Удаляем содержимое заметки

        for (int i = 0; i < notes.size(); i++){
            if (notes.remove(i).getId() == id) {
                notes.remove(i);// Удаляем по ключу (i)
                break;
            }
        }

    }

    @Override
    public List<Note> getAll() {
        return notes;
    }
}
