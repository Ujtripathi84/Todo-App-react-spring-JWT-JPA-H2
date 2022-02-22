package com.ujjwal.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1amp3YWx0cmlwYXRoaSIsImV4cCI6MTY0NTczMTA3OSwiaWF0IjoxNjQ1MTI2Mjc5fQ.i5jxK08SQE7Kw0_R4xcvoeGtiS3Sf_zw-401j-cJUuSmNz7P0yemvRgBe5zZ_vUsLZiMxqN-4QYLJgJQZthjRA"
//    }


    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

