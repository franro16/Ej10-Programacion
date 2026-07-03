package com.example.ejercicio10;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio10Application {

    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure()
                .ignoreIfMissing()
                .load();

        setPropertyIfPresent("DB_URL", dotenv);
        setPropertyIfPresent("DB_USER", dotenv);
        setPropertyIfPresent("DB_PASS", dotenv);

        SpringApplication.run(Ejercicio10Application.class, args);
    }

    private static void setPropertyIfPresent(String key, Dotenv dotenv) {
        String value = dotenv.get(key);
        if (value != null) {
            System.setProperty(key, value);
        }
    }
}