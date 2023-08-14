package uk.gov.companieshouse.api.verification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import uk.gov.companieshouse.api.verification.dao.IdentityVerificationDao;

import java.util.List;

@Repository
public interface IdentityVerificationRepository extends MongoRepository<IdentityVerificationDao, String> {

       List<IdentityVerificationDao> findByEmail(String email);
       //List<IdentityVerificationDao> findById(String id);

}
