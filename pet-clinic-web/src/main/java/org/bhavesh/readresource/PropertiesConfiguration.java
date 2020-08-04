package org.bhavesh.readresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({ @PropertySource("classpath:datasource.properties"), @PropertySource("classpath:jms.properties")

})
public class PropertiesConfiguration {

	@Value("${db.username}")
	String dbusername;

	@Value("${db.password}")
	String dbpassword;

	@Value("${db.url}")
	String dburl;

	@Value("${jms.username}")
	String jmsusername;

	@Value("${jms.password}")
	String jmspassword;

	@Value("${jms.url}")
	String jmsurl;

	@Bean
	public FakeDBPropertyReader fakePropertyRead() {
		FakeDBPropertyReader fakereader = new FakeDBPropertyReader();
		if (dbusername.equals(null))
			throw new NullPointerException();
		fakereader.setUsername(dbusername);
		fakereader.setPassword(dbpassword);
		fakereader.setUrl(dburl);
		return fakereader;
	}

	@Bean
	public FakeJMSPropertyReader jmsPropertyRead() {
		FakeJMSPropertyReader jmsreader = new FakeJMSPropertyReader();
		if (jmsusername.equals(null))
			throw new NullPointerException();
		jmsreader.setUsername(jmsusername);
		jmsreader.setPassword(jmspassword);
		jmsreader.setUrl(jmsurl);
		return jmsreader;
	}

	@Autowired
	Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public String getDbusername() {
		return dbusername;
	}

	public String getDbpassword() {
		return dbpassword;
	}

	public String getDburl() {
		return dburl;
	}

	public String getJmsusername() {
		return jmsusername;
	}

	public String getJmspassword() {
		return jmspassword;
	}

	public String getJmsurl() {
		return jmsurl;
	}
}
