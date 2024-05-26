package br.com.solangedomingues.core;

import br.com.solangedomingues.core.controller.JobController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class CoreApplicationTests {

    @Autowired
    private JobController jobController;

    @Test
    void contextLoads() {
        assertThat(jobController).isNotNull();
    }

}
