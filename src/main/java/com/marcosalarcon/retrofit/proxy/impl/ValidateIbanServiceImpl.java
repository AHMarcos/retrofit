package com.marcosalarcon.retrofit.proxy.impl;

import com.marcosalarcon.retrofit.proxy.api.ValidateIbanApi;
import com.marcosalarcon.retrofit.proxy.service.ValidateIbanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class ValidateIbanServiceImpl implements ValidateIbanService {

    private final ValidateIbanApi validateIbanApi;

    @Override
    public Object validateIban(String iban) throws IOException {
        return validateIbanApi.validateIban(iban)
                .execute()
                .body();
    }
}
