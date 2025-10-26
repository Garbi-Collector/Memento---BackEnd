package garbi.mementobackend.services.impl;

import garbi.mementobackend.entities.User;
import garbi.mementobackend.exception.UserNotFoundException;
import garbi.mementobackend.repositories.UserRepository;
import garbi.mementobackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User findUserByEmail(String email) {
        return repository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("Usuario no encontrado con email: " + email));
    }

    @Override
    public boolean userExist(String email){
        return repository.findByEmail(email).isPresent();
    }

}
