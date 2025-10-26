package garbi.mementobackend.services.impl;

import garbi.mementobackend.dtos.GoogleUserDTO;
import garbi.mementobackend.entities.User;
import garbi.mementobackend.enums.OauthProvider;
import garbi.mementobackend.enums.UserRole;
import garbi.mementobackend.repositories.UserRepository;
import garbi.mementobackend.services.AuthService;
import garbi.mementobackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;


    public void SignGoogle(GoogleUserDTO userDto){
        if (userService.userExist(userDto.getEmail())){
            //si el usuario existe entonces solo logearlo
            User user = userService.findUserByEmail(userDto.getEmail());
        }
        //en caso contrario registrarlo
        User user = User.builder()
                .email(userDto.getEmail())
                .username(userDto.getName())
                .oauthProvider(OauthProvider.GOOGLE)
                .isEnabled(true)
                .build();
        userRepository.save(user);
    }



}
