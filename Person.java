package title;

public class Person {
	private String firstName;
	private String lastName;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;
	private Gender gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<person>");
		sb.append(Tools.toXMLTag("firstName", getFirstName()));
		sb.append(Tools.toXMLTag("lastName", getLastName()));
		sb.append(Tools.toXMLTag("gender", String.valueOf(getGender())));
		sb.append(Tools.toXMLTag("hasOscar", String.valueOf(isHasOscar())));
		sb.append(Tools.toXMLTag("hasGoldenGlobe", String.valueOf(isHasGoldenGlobe())));
		sb.append("\n</person>\n");
		return sb.toString();
	}

}
