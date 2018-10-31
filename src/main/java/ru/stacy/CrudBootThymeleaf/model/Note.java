package ru.stacy.CrudBootThymeleaf.model;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @Column(name = "note_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "note_title")
    private String title;

    @Column(name = "note_content", length = 10000)
    private String content;

    public Note() {}

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
