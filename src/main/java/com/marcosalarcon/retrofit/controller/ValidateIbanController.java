package com.marcosalarcon.retrofit.controller;

import com.marcosalarcon.retrofit.proxy.service.ValidateIbanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/")
public class ValidateIbanController {

    private final ValidateIbanService validateIbanService;

    @GetMapping("/validate-iban/{iban}")
    public Object validateIban(@PathVariable String iban) throws IOException {
        return validateIbanService.validateIban(iban);
    }

}
