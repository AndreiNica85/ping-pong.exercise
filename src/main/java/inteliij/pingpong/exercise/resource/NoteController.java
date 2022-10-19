package inteliij.pingpong.exercise.resource;

import inteliij.pingpong.exercise.model.Note;
import inteliij.pingpong.exercise.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService ns;

    @GetMapping("/notes")
    public List<Note> retriveNotes(){
        return ns.getAllNotes();
    }

    @PostMapping("/notes")
    public void createNote(@RequestBody Note note){
        System.out.println(note);
        ns.addNote(note);
    }
}