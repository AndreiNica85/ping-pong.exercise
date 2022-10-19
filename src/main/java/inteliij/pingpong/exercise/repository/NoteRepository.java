package inteliij.pingpong.exercise.repository;

import inteliij.pingpong.exercise.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

}
