package programmerzamannow.spring.core.commandapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// belajar Command Line Runner
// Springboot application itu akan menscan dalam package yang sama  di commandapp
@SpringBootApplication
public class CommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
    }

}
