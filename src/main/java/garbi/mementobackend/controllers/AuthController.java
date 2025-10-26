package garbi.mementobackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/auth/google")
    public String redirectToGoogle(){
        return "redirect:/oauth2/authorization/google";
    }

    @PostMapping("/auth/local/signup")
    public void localSignUp(){

    }

    @PatchMapping("/auth/local/signin")
    public void localSignIn(){}

}
