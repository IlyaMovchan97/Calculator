package com.example.calculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.calculator.data.InMemoryRepoImp;
import com.example.calculator.data.Note;
import com.example.calculator.data.Repo;
import com.example.calculator.recycler.NotesAdapter;
import com.example.calculator.ui.EditNoteActivity;

public class NotesListActivity extends AppCompatActivity implements NotesAdapter.OnNoteClickListener {

    /*
    1. Переименновываем "MainActivity" в "NotesListActivity".
    2. Переименновываем ее "activity_main" в "activity_notes_list.xml"

    3. Создаем пакеты "data" - для файлов, и  "ui" - для отображения контента
    4. Создаем в пакете "data" Java-класс "Note" - Отуда будет брать адаптер данные для показа
    - Прописываем ему конструктор, геттеры и сеттеры
    5. Создаем в пакете "data" интерфейс "Repo" для нашей "Note"
    - Прописываем ему "CRUD" и фун-ю "getAll()", которая возвращает список всех заметок

    6. Создаем в пакете "data" Java-класс "InMemoryRepoImp" - для сохранения заметки в памяти
    - Имплементируем его в интерфейс "Repo"
    P.s.: Alt+Enter - имплементируем все методы
    - Создаем шаблон Singleton - статический инициализатор
    - Создаем ArrayList<Note> - массив
    6.1. Создать, присвоить и вывести id заметки
    6.2. Найти заметку по идетификатору
    6.3. Обновляем содержимое заметки
    6.4. Удаляем содержимое заметки (также как и находим)
    6.5. Возвращаем список заметок - public List<Note> getAll() --> вернуть "notes"
    6.6. В  private InMemoryRepoImp() вызываем ф-цию "init()", который выводит количество заметок
    - в самой ф-ции "init()" прописываем кол-во создаваемых заметок

    7. Создаем в пакете "Layout" файл "note_item.xml" - устанавливаем "LinearLayout"
    7.1. Заменим android:layout_height="match_parent" на "wrap_content"

    8. Создаем пакет "recycler"
    8.1. В нем создаем Java-класс "NoteHolder" - Классс, котороый содержит в себе view и ссылки на эго элементы
    - Экстендим его от RecyclerView.ViewHolder - генерируем конструктор
    - В конструктре прописваем сыылки на элементы View из "note_item.xml"
    - Прописываем bind, в котором сохраняем и заменяем заметку
    8.2. И второй Java-класс "NotesAdapter" - адаптер
    - Экстендим его от RecyclerView.Adapter<NoteHolder>, имплементим все методы
    -  Меняем в getItemCount() return на "notes.size()"
    - Перерисоввываем новый Холдер - onBindViewHolder
    - Создаем новый ViewHolder - onCreateViewHolder
    - Создаем LayoutInflater, коорый на вход получает ссылку на note_item.xml а возвращает view

    9. В "NotesListActivity" присваеваем переменно "List" ссылку на "list" в "activity_note_list"
    -  Прописываем private Repo repo = InMemoryRepoImp.getInstance();
    - Прописываем переменную "adapter"
    - Прописываем адапетру метод "setNotes(repo.getAll())"
    - Добавляем разделительную линию между Note

    10. Создем "щелчки"
    - в note_item.xml создамем:
    - android:background="?selectableItemBackground" - для работы "врибл-эффекта
    - android:clickable="true"
    - android:focusable="true"

    11. Создаем редактор Note
    - В NoteHolder определяем itemView (setOnClickListener)
    - В NotesAdapter создаем интерфейс "OnNoteClickListener"
     с методом "onNoteClick", которому будут передаваться клики из "note"
     - В onCreateViewHolder добавляем в "return new NoteHolder(view)" "listener" и в конструктов
     - В "NoteHolder", в  itemView.setOnClickListener пропишем метод onClick(View view),
     добавим "listener.onNoteClick(note)"

     12. Класс "Note" implements Serializable
     - Добавит ее в манифест
     - Создаем ключ "NOTE" - psfs
     - В пакете "ui" создаем Java-класс "EditNoteActivity" и экстендим его от "AppCompatActivity"
     - В пакете "layout" создаем "activity_edit_note.xml"
     - В "EditNoteActivity" создать onCreate и прописать R.layout.activity_edit_note

     */

    private RecyclerView list; // Ссылка на ListView
    private Repo repo = InMemoryRepoImp.getInstance();
    private NotesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);

        list = findViewById(R.id.list);

        adapter = new NotesAdapter();
        adapter.setOnNoteClickListener(this);

        adapter.setNotes(repo.getAll());

        /*
        Разделительная линия между Note
         */
        list.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        /*
        Разделительная линия между Note
         */

        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this)); //Ориентация скролтрования менеджера

    }

    public static final int EDIT_NOTE_REQUEST = 10;

    @Override
    public void onNoteClick(Note note) {
        Log.d("hello",note.getDescription()); // видеть, что на щелчки мы получаем информацию

        Intent editNoteIntent = new Intent(this, EditNoteActivity.class);
        editNoteIntent.putExtra(Note.NOTE, note);
        startActivityForResult(editNoteIntent, EDIT_NOTE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}