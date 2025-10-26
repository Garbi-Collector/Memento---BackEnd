package garbi.mementobackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoogleUserDTO {
    private String name;
    private String givenName;
    private String familyName;
    private String email;
    private Boolean emailVerified;
    private String picture;
    private String sub;
}
