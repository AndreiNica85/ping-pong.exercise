package inteliij.pingpong.exercise.resource;

import inteliij.pingpong.exercise.exception.NoteNotFoundException;
import inteliij.pingpong.exercise.model.Note;
import inteliij.pingpong.exercise.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {

    @Autowired
    private NoteService ns;

    @GetMapping("/notes")
    public List<Note> retriveNotes(){
        return ns.getAllNotes();
    }

    @GetMapping("/notes/{id}")
    public Note getNote(@PathVariable Integer id){
        Optional<Note> searchResult =  ns.findNoteById(id);
        if (searchResult.isEmpty()) {
            throw new NoteNotFoundException("Note not found!");
        }
        else{
            return searchResult.get();
        }
    }

    @DeleteMapping ("/notes/{id}")
    public Note deleteNote(@PathVariable Integer id){
        Optional<Note> searchResult =  ns.findNoteById(id);
        if (searchResult.isEmpty()) {
            throw new NoteNotFoundException("Note not found!");
        }
        else{
            return ns.deleteNote(searchResult.get());
        }
    }
    @PostMapping("/notes")
    public void createNote(@RequestBody Note note){
        ns.addNote(note);
    }

    @PutMapping("/notes/{id}")
    public Note updateNote(@RequestBody Note note, @PathVariable Integer id){
        Optional<Note> searchResult =  ns.findNoteById(id);
        if (searchResult.isEmpty()) {
            throw new NoteNotFoundException("Note not found!");
        }
        else{
            System.out.println(searchResult.get());
            return null;

        }
    }

}