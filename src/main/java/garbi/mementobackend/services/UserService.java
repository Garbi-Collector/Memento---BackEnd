package garbi.mementobackend.services;

import garbi.mementobackend.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findUserByEmail(String email);

    boolean userExist(String email);
}
