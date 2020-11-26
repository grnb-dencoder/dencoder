package io.github.glebremniov.dencoder.controllers.decode;

import io.github.glebremniov.dencoder.services.decode.DecodeService;
import io.github.glebremniov.dencoder.utils.request.Request;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/decode")
public class DecodeController {

    private final DecodeService decodeService;

    public DecodeController(DecodeService decodeService) {
        this.decodeService = decodeService;
    }

    @PostMapping
    String decode(@RequestBody Request request) {
        return decodeService.decode(request.message(), request.secret());
    }
}
