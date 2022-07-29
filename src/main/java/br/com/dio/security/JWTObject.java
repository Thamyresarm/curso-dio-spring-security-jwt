package br.com.dio.security;

import lombok.Data;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
public class JWTObject {

    private String subject;
    private Date issuedAt;
    private Date expiration;
    private List<String> roles;

    public void setRoles(String... roles){
        this.roles = Arrays.asList(roles);
    }

}
