package com.toDo.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.toDo.springJDBC.dao.studentDAO;
import com.toDo.springJDBC.entities.student;

/**
 * 
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/toDo/springJDBC/config.xml");
    	//inserting data
//    	student st=new student(1354,"monRK","russia");
//    studentDAO sd=(studentDAO) context.getBean("studentDao");
//    	int result=sd.insert(st);
//    	System.out.println("number of records inserted"+result);
//    	
    	
    	//updating data
//    	student st=new student(1354,"divyank","russia");
//    	studentDAO sd=(studentDAO) context.getBean("studentDao");
//    	int result=sd.change(st);
//    	System.out.println("number of records updated"+result);
//    	
     	studentDAO sd=(studentDAO) context.getBean("studentDao");
    	int result=sd.delete(46);
    	System.out.println("number of records deleted"+result);
    	
    }
}
