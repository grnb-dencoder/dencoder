package io.github.glebremniov.dencoder.services.encode;

public interface EncodeService {
    String encode(String message, Object secret);
}
