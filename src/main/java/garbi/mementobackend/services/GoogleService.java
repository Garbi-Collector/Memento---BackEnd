package garbi.mementobackend.services;

import garbi.mementobackend.dtos.GoogleUserDTO;
import org.springframework.stereotype.Service;

@Service
public interface GoogleService {
    GoogleUserDTO extractUserData(Object principal);
}
