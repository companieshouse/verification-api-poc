package uk.gov.companieshouse.api.verification.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchIdentityVerificationRequest {
    @JsonProperty
    private String id;
    @JsonProperty("email_address")
    private String emailAddress;
    public String getId() {
        return id;
    }

    public void setIid(String id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
