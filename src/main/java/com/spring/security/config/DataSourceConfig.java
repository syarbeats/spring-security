package com.spring.security.config;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
public class DataSourceConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName(env.getProperty("mysql.driver"));
	    dataSource.setUrl(env.getProperty("mysql.jdbcUrl"));
	    dataSource.setUsername(env.getProperty("mysql.username"));
	    dataSource.setPassword(env.getProperty("mysql.password"));
	    return dataSource;
	}
	  
}
