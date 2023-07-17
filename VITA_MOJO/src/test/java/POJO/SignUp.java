package POJO;

public class SignUp {
	
	private String email;
	private String firstName;
	private String password;
	private String[] subscriptions;
	
	public String[] getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(String[] subscriptions) {
		this.subscriptions = subscriptions;
	}
	private String storeUUID;
	private String locale;
	
	public String getStoreUUID() {
		return storeUUID;
	}
	public void setStoreUUID(String storeUUID) {
		this.storeUUID = storeUUID;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String name) {
		this.firstName = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
