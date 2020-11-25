package io.github.glebremniov.dencoder.services.encode;

import org.springframework.stereotype.Service;

@Service(value = "encodeService")
public class EncodeServiceImpl implements EncodeService {
    @Override
    public String encode(String message, Object secret) {
        return new StringBuilder(message).reverse().toString();
    }
}
