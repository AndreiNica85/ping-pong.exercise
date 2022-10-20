package inteliij.pingpong.exercise;

import inteliij.pingpong.exercise.model.Note;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() throws MalformedURLException {

		Note note = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(), "http://localhost:8080/notes", 1);

		Assert.isNull(null, note.getDescr());
	}

	@Test
	void textIsOverTenCharacters() throws MalformedURLException {
		Note note = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(),"http://localhost:8080/notes", 1);
		int t = note.getText().length();
		boolean v = t > 10;
		Assert.isTrue(v,"The string length need to be greater then 10");
	}
}
