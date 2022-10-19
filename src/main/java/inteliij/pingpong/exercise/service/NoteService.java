package inteliij.pingpong.exercise.service;

import inteliij.pingpong.exercise.model.Note;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {

    public static List<Note> notes = new ArrayList<>();
    static int counter = 0;

    static {
        try {
            notes.add(new Note(++counter, "Do java !!!", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(), new URL("http://localhost:8080/notes"), 1));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(notes);
    }

    public Note addNote(Note n) {
        notes.add(n);
        return n;
    }

    public Note findNote(long id) {
        Note foundNote = notes.stream().filter(note -> note.getId() == id).findFirst().orElse(null);
        return foundNote;

    }

    public Note deleteNote() {
        return null;
    }

    public Note updateNote() {
        return null;
    }

}
