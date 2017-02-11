package it.test.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.test.spring.generator.AnimaleGenerator;


public class AnimaleTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test-context.xml");
		AnimaleGenerator animaleGenerator = (AnimaleGenerator) applicationContext.getBean("animaleGenerator");
		animaleGenerator.getAnimale().mangia();
		animaleGenerator.getAnimale().dormi();
	}

}
