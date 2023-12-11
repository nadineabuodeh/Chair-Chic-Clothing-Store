package clothes;

public class User {
	private String username;
	private String password;
	private String city;
    private	final static String country="Palestine";
	
	public User(String username, String password, String city) {
		super();
		this.username = username;
		this.password = password;
	this.city = city;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}
	
}
