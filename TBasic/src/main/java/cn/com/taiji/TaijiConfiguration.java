package cn.com.taiji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import cn.com.taiji.Bean.FooProperties;





@Configuration
@EnableConfigurationProperties(FooProperties.class)
public class TaijiConfiguration {
	@Autowired
	private FooProperties fooProperties;
	
	
	
	public String toString() {
		return fooProperties.toString();
		
	}
}
