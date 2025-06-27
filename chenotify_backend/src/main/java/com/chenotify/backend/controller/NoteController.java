package com.chenotify.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenotify.backend.model.Note;
import com.chenotify.backend.repository.NoteRepository;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    // 🔹 Fetch all notes
    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    // 🔹 Create a new note
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        System.out.println("Received note: " + note.getTitle());
        return noteRepository.save(note);
    }
}
