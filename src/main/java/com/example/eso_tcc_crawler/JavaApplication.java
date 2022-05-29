package com.example.eso_tcc_crawler;

import com.example.eso_tcc_crawler.integration.AppService;
import com.example.eso_tcc_crawler.integration.AppServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class JavaApplication {

	@Autowired
	private static AppServiceImpl appService;
	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		System.out.println("Running...");
		appService = new AppServiceImpl();
		var result = appService.get();
		System.out.println(result.toString());
	}

}
