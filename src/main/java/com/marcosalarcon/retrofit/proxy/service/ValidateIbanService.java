package com.marcosalarcon.retrofit.proxy.service;

import java.io.IOException;

public interface ValidateIbanService {
    Object validateIban(String iban) throws IOException;
}
