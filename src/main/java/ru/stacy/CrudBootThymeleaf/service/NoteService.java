package ru.stacy.CrudBootThymeleaf.service;

import ru.stacy.CrudBootThymeleaf.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> findAll();

    Note findOne(Long id);

    Note saveNote(Note note);

    void deleteNote(Long id);
}
