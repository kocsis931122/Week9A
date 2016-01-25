package title;

import java.util.HashMap;
import java.util.List;

public class Tools {
	public static String toXMLTag(String tagName, String value) {
		return "<" + tagName + ">" + value + "</" + tagName + ">";
	}

	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> countMap = new HashMap<>();
		for (Movie movie : movies) {
			for (Person person : movie.getCast()) {
				if (!countMap.containsKey(person)) {
					countMap.put(person, new Integer(0));
				}
				countMap.put(person, countMap.get(person) + 1);
			}
		}
		return countMap;
	}

	public static String[] getMovieTitles(List<Movie> movie) {
		for (int i = 0; i < movie.size(); i++) {
			System.out.println(movie.get(0));
		}
		return titles;
	}

}
