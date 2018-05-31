package cn.com.taiji.Bean;

import java.io.Serializable;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cn.com.taiji")
public class FooProperties implements Serializable{
  
	private String email;
	
	private String userName;
	
	private Map<String, String> map;
	
	public FooProperties(String email, String userName, Map<String, String> map) {
		super();
		this.email = email;
		this.userName = userName;
		this.map = map;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "FooProperties [email=" + email + ", userName=" + userName + ", map=" + map + "]";
	}
	
	
 
}
