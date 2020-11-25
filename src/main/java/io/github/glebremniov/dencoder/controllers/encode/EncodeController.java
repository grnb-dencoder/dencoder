package io.github.glebremniov.dencoder.controllers.encode;

import io.github.glebremniov.dencoder.services.encode.EncodeService;
import io.github.glebremniov.dencoder.utils.request.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/encode")
public class EncodeController {

    private final EncodeService encodeService;

    public EncodeController(EncodeService encodeService) {
        this.encodeService = encodeService;
    }

    @PostMapping
    public String encode(@RequestBody Request request) {
        return encodeService.encode(request.getMessage(), request.getSecret());
    }
}
