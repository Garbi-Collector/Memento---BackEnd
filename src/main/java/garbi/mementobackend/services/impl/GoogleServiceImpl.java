package garbi.mementobackend.services.impl;

import garbi.mementobackend.dtos.GoogleUserDTO;
import garbi.mementobackend.exception.GoogleUserException;
import garbi.mementobackend.services.GoogleService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class GoogleServiceImpl implements GoogleService {

    @Override
    public GoogleUserDTO extractUserData(Object principal) {
        if (principal instanceof OAuth2User oauth2User) {
            return GoogleUserDTO.builder()
                    .name(oauth2User.getAttribute("name"))
                    .givenName(oauth2User.getAttribute("given_name"))
                    .familyName(oauth2User.getAttribute("family_name"))
                    .email(oauth2User.getAttribute("email"))
                    .emailVerified(oauth2User.getAttribute("email_verified"))
                    .picture(oauth2User.getAttribute("picture"))
                    .sub(oauth2User.getAttribute("sub"))
                    .build();
        }
        throw new GoogleUserException(); // lanzamos la excepción si principal no es OAuth2User
    }
}
