package inteliij.pingpong.exercise.service;

import inteliij.pingpong.exercise.exception.NoteNotFoundException;
import inteliij.pingpong.exercise.model.Note;
import inteliij.pingpong.exercise.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class NoteService {
    @Autowired
    NoteRepository noteRepo;
    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }
    public Note addNote(Note note) {
        System.out.println(note);
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
    public ResponseEntity<Object> updateNote(Note note, Integer id) {
        Optional<Note> noteToUpdate = noteRepo.findById(id);

        if(noteToUpdate.isEmpty()){
            throw new NoteNotFoundException("Note not found possibly wrong id passed with the body");
        }

        note.setId(id);
        noteRepo.save(note);
        return ResponseEntity.noContent().build();
    }
    //public Note patchNote()
}
