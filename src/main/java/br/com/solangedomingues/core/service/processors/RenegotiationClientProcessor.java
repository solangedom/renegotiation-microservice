package br.com.solangedomingues.core.service.processors;

import java.time.LocalDate;

public interface RenegotiationClientProcessor {

    void processRenegotiationClient(LocalDate processDate);

    String type();

}
