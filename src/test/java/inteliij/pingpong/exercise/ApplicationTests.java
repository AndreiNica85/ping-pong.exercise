package inteliij.pingpong.exercise;

import inteliij.pingpong.exercise.model.Note;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.net.MalformedURLException;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;

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

	@Test
	void testTypeOfLink() throws MalformedURLException {
		Note noteWeb = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(),"http://localhost:8080/notes", 1);
		Note noteEmail = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(),"http://gertyu@yahoo.com", 1);
		Note noteYoutube = new Note(1, "Do", "some text in here", LocalDate.now(), LocalDate.now(), LocalDate.now(),"http://youtube.com", 1);
		String webLink = noteWeb.getLink().toString();
		String emailLink = noteEmail.getLink().toString();
		String youtubeLink = noteYoutube.getLink().toString();
		assertThat(webLink, webLink.contains("localhost"));
		assertThat(emailLink, emailLink.contains("@"));
		assertThat(youtubeLink, youtubeLink.contains("youtube"));
	}
}
