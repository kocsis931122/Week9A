package title;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	public static final String FILE_PATH = "C:\\Users\\Vitya\\Java\\Movies\\src\\title\\movies.xml";

	public static void main(String[] args) {

		Person attila = new Person("Nagy", "Attila", Gender.MALE, false, false);
		Person caprio = new Person("Leonardo", "Di caprio", Gender.MALE, false, true);
		List<Person> persons = new ArrayList<Person>();
		List<Movie> movies = new ArrayList<Movie>();
		persons.add(attila);
		persons.add(caprio);
		Movie titanic = new Movie("Titanic", Genre.DRAMA, 143, 8.9, persons);
		movies.add(titanic);


		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(FILE_PATH)));
			StringBuffer sb = new StringBuffer();
			sb.append("<movies>");
			sb.append(titanic.toXMLString());
			sb.append("</movies>");
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
