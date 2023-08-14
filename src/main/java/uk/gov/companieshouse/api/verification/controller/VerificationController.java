package uk.gov.companieshouse.api.verification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.gov.companieshouse.api.verification.dao.IdentityVerificationDao;
import uk.gov.companieshouse.api.verification.model.request.SearchIdentityVerificationRequest;
import uk.gov.companieshouse.api.verification.repository.IdentityVerificationRepository;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/verification")
public class VerificationController {
    private IdentityVerificationRepository identityVerificationRepository;

    @Autowired
    public VerificationController(IdentityVerificationRepository identityVerificationRepository) {
        this.identityVerificationRepository = identityVerificationRepository;
    }

    private static final Logger LOG = LoggerFactory.getLogger(VerificationController.class);

    @PostMapping("/generate_uvid")
    public ResponseEntity<String> createUVID() {
        LOG.info("Start generate uvid request");

        return ResponseEntity.ok().body("Verification API is Healthy");
    }

    @PostMapping("/identities")
    public ResponseEntity<String> createVerificationIdentity() {
        IdentityVerificationDao iv = new IdentityVerificationDao();
        iv.setUser_id("account_id");
        iv.setSub("example_sub");
        iv.setCreated(LocalDateTime.now());
        identityVerificationRepository.insert(iv);

        return ResponseEntity.ok().body("Created Verification Identity");
    }

    @PostMapping("/identities/search")
    public ResponseEntity<Optional<IdentityVerificationDao>> searchVerificationIdentity(@RequestBody SearchIdentityVerificationRequest searchIdentityVerificationRequest) {
        identityVerificationRepository.findById(searchIdentityVerificationRequest.getId());

        return ResponseEntity.ok().body(identityVerificationRepository.findById(searchIdentityVerificationRequest.getId()));
    }
    private String generateUVID() {
        SecureRandom random = new SecureRandom();
        byte[] values = new byte[4];
        random.nextBytes(values);
        String rand = String.format("%010d", random.nextInt(Integer.MAX_VALUE));
        String time = String.format("%08d", Calendar.getInstance().getTimeInMillis() / 100000L);
        String rawId = rand + time;
        String[] uvid = rawId.split("(?<=\\G.{5})");
        String[] uvidtest = rawId.split("(?<=\\{5})");

        return String.join("-", uvid);
    }

}
