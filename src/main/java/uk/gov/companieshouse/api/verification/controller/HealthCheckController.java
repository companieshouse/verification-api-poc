package uk.gov.companieshouse.api.verification.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verification-account")
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public ResponseEntity<String> getHealthCheck() {
        return ResponseEntity.ok().body("Verification API is Healthy");
    }
}