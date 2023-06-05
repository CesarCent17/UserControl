package com.usercontrol.UserControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.usercontrol.UserControl.dao")
public class UserControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserControlApplication.class, args);
	}

}
