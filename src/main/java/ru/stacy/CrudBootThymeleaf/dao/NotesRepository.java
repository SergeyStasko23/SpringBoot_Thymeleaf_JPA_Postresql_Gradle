package ru.stacy.CrudBootThymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stacy.CrudBootThymeleaf.model.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {}
