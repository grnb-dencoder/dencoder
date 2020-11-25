package io.github.glebremniov.dencoder.services.decode;

public interface DecodeService {
    String decode(String message, Object secret);
}
