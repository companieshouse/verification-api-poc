package uk.gov.companieshouse.api.verification.controller;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HealthCheckControllerTest {
    @Test
    public void testGetHealthCheck() {
        // Create an instance of the controller
        HealthCheckController controller = new HealthCheckController();
        // Call the getHealthCheck() method
        ResponseEntity<String> response = controller.getHealthCheck();
        // Verify the response status code and body
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Verification API is Healthy", response.getBody());
    }
}
