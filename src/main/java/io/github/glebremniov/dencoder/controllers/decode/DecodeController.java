package io.github.glebremniov.dencoder.controllers.decode;

import io.github.glebremniov.dencoder.services.decode.DecodeService;
import io.github.glebremniov.dencoder.utils.request.Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/decode")
public class DecodeController {

    private final DecodeService decodeService;

    public DecodeController(DecodeService decodeService) {
        this.decodeService = decodeService;
    }

    @PostMapping
    String decode(@RequestBody Request request) {
        return decodeService.decode(request.getMessage(), request.getMessage());
    }
}
