package com.example.mocklog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @PostMapping("/success")
    public ResponseEntity<String> logInfo() {
        logger.info("{\"httpId\":\"2eol58458gk\",\"httpIPAddress\":\"171.4.218.65\",\"httpUserAgent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36\",\"httpUserId\":null,\"httpUrl\":\"/api/v1/users/my-profile/social-network/line/connect/user-line-id\",\"httpMethod\":\"POST\",\"httpStatus\":200,\"httpIncoming\":null,\"httpOutgoing\":null,\"httpException\":null,\"timeTakenMs\":76}");
        return ResponseEntity.ok("Info log printed.");
    }

    @PostMapping("/error")
    public ResponseEntity<String> logError() {
        logger.error("{\"httpId\":\"2eol58458gk\",\"httpIPAddress\":\"171.4.218.65\",\"httpUserAgent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36\",\"httpUserId\":null,\"httpUrl\":\"/api/v1/users/my-profile/social-network/line/connect/user-line-id\",\"httpMethod\":\"POST\",\"httpStatus\":500,\"httpIncoming\":null,\"httpOutgoing\":null,\"httpException\":null,\"timeTakenMs\":76}");
        return ResponseEntity.ok("Error log printed.");
    }
}
