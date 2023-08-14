package uk.gov.companieshouse.api.verification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableMongoRepositories("uk.gov.companieshouse.api.verification.repositories")
public class VerificationAPIApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(VerificationAPIApplication.class, args);
    }
}
