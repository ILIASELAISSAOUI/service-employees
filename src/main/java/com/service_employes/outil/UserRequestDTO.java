package com.service_employes.outil;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserRequestDTO {
    private String email;
    private String password;

}
