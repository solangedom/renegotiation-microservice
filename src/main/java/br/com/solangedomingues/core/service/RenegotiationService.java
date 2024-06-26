package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.service.processors.RenegotiationCustomerProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Slf4j
@Service
@RequiredArgsConstructor
public class RenegotiationService {

    private final Set<RenegotiationCustomerProcessor> processors;

    public void processRenegotiationCustomer(String type, LocalDate processDate) {
        log.info("M=processRenegotiationClient, stage=init, type={}, processDate={}", type, processDate);

        final RenegotiationCustomerProcessor processor = processors.stream()
                .collect(Collectors.toMap(RenegotiationCustomerProcessor::type, Function.identity())).get(type);

        ofNullable(processor).ifPresentOrElse(it -> it.process(processDate),
                () -> log.info("M=processRenegotiationClient, stage=processNotFound, type={}", type));
    }

}
