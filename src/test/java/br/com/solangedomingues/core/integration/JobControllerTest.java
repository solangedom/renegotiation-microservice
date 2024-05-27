package br.com.solangedomingues.core.integration;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;
import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;
import static io.restassured.http.ContentType.JSON;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JobControllerTest extends BaseIntegrationTest {

    @Test
    void processRenegotiationPJTest() {
        final LocalDate processDate = LocalDate.now();
        final String type = PJ.name();

        String url = String.format("/jobs/process-renegotiation?type=%s&processDate=%s", type, processDate);

        RestAssured.given()
                .when()
                .contentType(JSON)
                .post(url)
                .then()
                .assertThat()
                .statusCode(HttpStatus.NO_CONTENT.value());
    }

    @Test
    void processRenegotiationPFTest() {
        final LocalDate processDate = LocalDate.now();
        final String type = PF.name();

        String url = String.format("/jobs/process-renegotiation?type=%s&processDate=%s", type, processDate);

        RestAssured.given()
                .when()
                .contentType(JSON)
                .post(url)
                .then()
                .assertThat()
                .statusCode(HttpStatus.NO_CONTENT.value());
    }

}
