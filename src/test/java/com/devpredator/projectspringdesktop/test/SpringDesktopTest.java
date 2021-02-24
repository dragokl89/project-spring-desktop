/**
 * 
 */
package com.devpredator.projectspringdesktop.test;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.devpredator.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author c-ado
 *Clase de prueba unitaria que permite realizar prueba de spring
 */
public class SpringDesktopTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	assertNotNull(context);
	DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
	assertNotNull(disqueraDAO);
	
	DisqueraDAO disqueraDAONuevo = (DisqueraDAO) context.getBean("disqueraDAO");
	
	System.out.println("Contexto cargado");
	System.out.println(disqueraDAO);
	System.out.println(disqueraDAONuevo);
	
	//:::::::::::::::::::
	
	
	Properties properties = (Properties) context.getBean("properties");
	System.out.println(properties.get("spring-username"));
	}

}
