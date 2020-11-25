package io.github.glebremniov.dencoder.services.decode;

import org.springframework.stereotype.Service;

@Service(value = "decodeService")
public class DecodeServiceImpl implements DecodeService {
    @Override
    public String decode(String message, Object secret) {
        return new StringBuilder(message).reverse().toString();
    }
}
