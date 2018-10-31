package ru.stacy.CrudBootThymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stacy.CrudBootThymeleaf.dao.NotesRepository;
import ru.stacy.CrudBootThymeleaf.model.Note;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NotesRepository notesRepository;

    @Override
    public List<Note> findAll() {
        return notesRepository.findAll();
    }

    @Override
    public Note findOne(Long id) {
        return notesRepository.getOne(id);
    }

    @Override
    public Note saveNote(Note note) {
        return notesRepository.save(note);
    }

    @Override
    public void deleteNote(Long id) {
        notesRepository.deleteById(id);
    }
}
