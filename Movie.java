package title;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> cast = new ArrayList<Person>();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<movie>");
		sb.append(Tools.toXMLTag("title", getTitle()));
		sb.append(Tools.toXMLTag("genre", String.valueOf(getGenre())));
		sb.append(Tools.toXMLTag("duration", String.valueOf(getDuration())));
		sb.append(Tools.toXMLTag("rate", String.valueOf(getRate())));
		sb.append(Tools.toXMLTag("cast", this.cast.toString()));
		sb.append("\n</movie>\n");
		return sb.toString();
	}

}
