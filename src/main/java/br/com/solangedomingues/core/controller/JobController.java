package br.com.solangedomingues.core.controller;


import br.com.solangedomingues.core.service.RenegotiationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    private final RenegotiationService renegotiationService;

    @PostMapping(path = "/process-renegotiation")
    public ResponseEntity<Void> processRenegotiationCustomer(@RequestParam String type,
                                                             @RequestParam LocalDate processDate) {
        renegotiationService.processRenegotiationCustomer(type, processDate);
        return ResponseEntity.noContent().build();
    }

}
