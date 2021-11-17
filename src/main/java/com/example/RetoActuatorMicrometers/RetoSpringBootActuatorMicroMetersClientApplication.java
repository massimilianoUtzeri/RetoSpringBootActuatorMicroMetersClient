package com.example.RetoActuatorMicrometers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.RetoActuatorMicrometers.Entity.Client;
import com.example.RetoActuatorMicrometers.Service.Service;

@SpringBootApplication
public class RetoSpringBootActuatorMicroMetersClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RetoSpringBootActuatorMicroMetersClientApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//Creo un nuevo cliente
		
		Client testClient = new Client ("Massimiliano","Utzeri","Half-Open");
		
		//Falta la implementación del Circuit Breaker, no he tenido tiempo y tenía unas cuantas dudas.
		//Intentare alinearme esta tarde
		
	}

}
