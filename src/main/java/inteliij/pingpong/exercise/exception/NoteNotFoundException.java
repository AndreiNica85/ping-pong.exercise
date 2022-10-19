package inteliij.pingpong.exercise.exception;

public class NoteNotFoundException extends RuntimeException {
    private String message;
    public NoteNotFoundException(String message) {
        this.message = message;
    }
}
