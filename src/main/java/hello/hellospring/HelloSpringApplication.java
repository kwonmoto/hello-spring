package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	// Tomcat started on port(s): 8080 (http) with context path '' localhost:8080 으로 무언가가 실행
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
