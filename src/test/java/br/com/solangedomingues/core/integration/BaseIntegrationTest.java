package br.com.solangedomingues.core.integration;

import br.com.solangedomingues.core.repositories.CustomerPFRepository;
import br.com.solangedomingues.core.repositories.CustomerPJRepository;
import br.com.solangedomingues.core.repositories.DebtRepository;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseIntegrationTest {

    @Autowired
    protected CustomerPFRepository customerPFRepository;

    @Autowired
    protected CustomerPJRepository customerPJRepository;

    @Autowired
    protected DebtRepository debtRepository;

    @LocalServerPort
    Integer port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = this.port;
    }

}
