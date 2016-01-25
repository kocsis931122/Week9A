package title;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MovieManager {

	public static void main(String[] args, PrintWriter writer) {

		Person person = new Person();
		person.setFirstName("alabama");
		person.setLastName("jozsi");
		person.setGender(Gender.MALE);
		person.setHasOscar(false);
		person.setHasGoldenGlobe(false);

		Person person1 = new Person();
		person1.setFirstName("alabama");
		person1.setLastName("jozsi");
		person1.setGender(Gender.MALE);
		person1.setHasOscar(false);
		person1.setHasGoldenGlobe(false);

		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(person);
		persons.add(person1);

		Movie movie = new Movie();
		movie.setTitle("A nagy csapas");
		movie.setGenre(Genre.HORROR);
		movie.setDuration(119);
		movie.setRate(3.9);
		movie.setCast(persons);

		final String FILENAME = "demo_movies.xml";
		try {
			FileWriter fw = new FileWriter(FILENAME);
			writer = new PrintWriter(fw);

		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		writer.println(movie.toXMLString() + person.toXMLString() + person1.toXMLString());
		writer.close();
	}

}
