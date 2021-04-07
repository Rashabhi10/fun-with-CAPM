package sst.rash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sst.rash.myClasses.Laptop;

@SpringBootApplication
public class MyFirstProgApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MyFirstProgApplication.class, args);
		Laptop apple = context.getBean(Laptop.class);
		apple.setBrandName("Dell");
		System.out.println(apple.toString());
		
	}

}
