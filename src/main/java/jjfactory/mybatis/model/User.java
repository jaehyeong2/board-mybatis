package jjfactory.mybatis.model;


import jjfactory.mybatis.model.enums.Role;
import lombok.*;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    private String role;
    private Timestamp createDate;


}
