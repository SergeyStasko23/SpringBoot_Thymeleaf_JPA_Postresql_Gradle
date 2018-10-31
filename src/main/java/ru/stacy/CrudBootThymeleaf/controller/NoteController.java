package ru.stacy.CrudBootThymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.stacy.CrudBootThymeleaf.model.Note;
import ru.stacy.CrudBootThymeleaf.service.NoteService;

@Controller
public class NoteController {
    @Autowired
    NoteService noteService;

    @RequestMapping(value="/")
    public String notesList(Model model) {
        model.addAttribute("notesList", noteService.findAll());
        return "notesList";
    }

    @RequestMapping(value={"/notesEdit","/notesEdit/{id}"}, method = RequestMethod.GET)
    public String notesEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            model.addAttribute("notes", noteService.findOne(id));
        } else {
            model.addAttribute("notes", new Note());
        }
        return "notesEdit";
    }

    @RequestMapping(value="/notesEdit", method = RequestMethod.POST)
    public String notesEdit(Model model, Note note) {
        noteService.saveNote(note);
        model.addAttribute("notesList", noteService.findAll());
        return "notesList";
    }

    @RequestMapping(value="/notesDelete/{id}", method = RequestMethod.GET)
    public String notesDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
        noteService.deleteNote(id);
        model.addAttribute("notesList", noteService.findAll());
        return "notesList";
    }
}
