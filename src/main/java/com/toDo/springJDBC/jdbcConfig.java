package com.toDo.springJDBC;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.toDo.springJDBC.dao.studentDAO;
import com.toDo.springJDBC.dao.studentDAOImpl;

@Configuration
@ComponentScan(basePackages = {"com.toDo.springJDBC.dao"})
public class jdbcConfig {

	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springJDBC");
		ds.setUsername("root");
		ds.setPassword("vaibhav");
		
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbctemplate=new JdbcTemplate();
		jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate;
	}
//	@Bean("studentDao")
//	public studentDAO getStudentDao()
//	{
//		studentDAOImpl sd=new studentDAOImpl();
//		sd.setTemplate(getTemplate());
//		
//		return sd;
//		
//		
//	}
	
}
