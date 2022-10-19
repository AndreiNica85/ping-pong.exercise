package inteliij.pingpong.exercise.service;

import inteliij.pingpong.exercise.model.Note;
import inteliij.pingpong.exercise.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    NoteRepository noteRepo;

    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }

    public Note addNote(Note note) {
        noteRepo.save(note);
        return note;
    }

    public Optional<Note> findNoteById(Integer id) {
        return noteRepo.findById(id);
    }

    public Note deleteNote(Note note) {
        noteRepo.delete(note);
        return note;
    }

    public Note updateNote(Note note) {
        noteRepo.save(note);
        return note;
    }


}
