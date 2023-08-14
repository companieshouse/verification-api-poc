package uk.gov.companieshouse.api.verification.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
@Document(collection = "identity_verifications")
public class IdentityVerificationDao {

        @Id
        private String id;

        @Field("user_id")
        private String user_id;

        @Field("sub")
        private String sub;

        @Field("verification_source")
        private String verification_source;

        @Field("created")
        private LocalDateTime created;

        @Field("status")
        private String status;

        @Field("status_date")
        private LocalDateTime status_date;

        @Field("email")
        private String email;

        @Field("date_of_birth")
        private LocalDateTime date_of_birth;

        public String getId() {
                return id;
            }

        public void setId(String id) {
            this.id = id;
        }

        public String getUser_id() {
                return user_id;
        }

        public void setUser_id(String user_id) {
                this.user_id = user_id;
        }

        public String getSub() {
                return sub;
        }

        public void setSub(String sub) {
                this.sub = sub;
        }

        public String getVerification_source() {
                return verification_source;
        }

        public void setVerification_source(String verification_source) {
                this.verification_source = verification_source;
        }

        public LocalDateTime getCreated() {
                return created;
        }

        public void setCreated(LocalDateTime created) {
                this.created = created;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public LocalDateTime getStatus_date() {
                return status_date;
        }

        public void setStatus_date(LocalDateTime status_date) {
                this.status_date = status_date;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public LocalDateTime getDate_of_birth() {
                return date_of_birth;
        }

        public void setDate_of_birth(LocalDateTime date_of_birth) {
                this.date_of_birth = date_of_birth;
        }

    }


