package tema10.domain;

import lombok.*;

@Data
@Builder

@Setter
@Getter

public class UserModel {

    private int id;

    private String userName;
    private String password;

    private String email;

    private String userType;

    @Override
    public String toString() {
        return
                "id: " + id + "\n" +
                        "Name: " + userName + "\n" +
                        "password: " + password + "\n" +
                        "email: " + email + "\n" +
                        "Type: " + userType + "\n"
                ;
    }
}
