package com.toDo.springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	//config file
    //	ApplicationContext context=new ClassPathXmlApplicationContext("com/toDo/springJDBC/config.xml");
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
    	//deleting student
//     	studentDAO sd=(studentDAO) context.getBean("studentDao");
//    	int result=sd.delete(46);
//    	System.out.println("number of records deleted"+result);
//    	
    	//fetching data single row
    	
//       	studentDAO sd=(studentDAO) context.getBean("studentDao");
//       	student  result=sd.getStudent(1354);
//       	System.out.println(result);
    	
    	
    	//fetching all rows
//       	studentDAO sd=(studentDAO) context.getBean("studentDao");
//       	List<student>  result=sd.getAllStudents();
//       	System.out.println(result);
    
    	
    	//using java config
    	//without using xml file
    	ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);
    	studentDAO sd=(studentDAO) context.getBean("studentDao");
   	List<student>  result=sd.getAllStudents();
  	System.out.println(result);
    	
    	
    }
}
