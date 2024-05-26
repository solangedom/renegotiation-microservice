package br.com.solangedomingues.core.service.processors;

import java.time.LocalDate;

public interface RenegotiationCustomerProcessor {

    void process(LocalDate processDate);

    String type();

}
