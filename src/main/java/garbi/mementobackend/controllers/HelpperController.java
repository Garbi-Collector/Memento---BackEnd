package garbi.mementobackend.controllers;

import garbi.mementobackend.dtos.GoogleUserDTO;
import garbi.mementobackend.services.GoogleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelpperController {

    @Autowired
    GoogleService googleService;

    @GetMapping("/user")
    public GoogleUserDTO user(@AuthenticationPrincipal OAuth2User principal) {
        return googleService.extractUserData(principal);
    }

    @GetMapping("/")
    public String greet() {
        return "HOLAAAAAAAAAA";
    }
}
