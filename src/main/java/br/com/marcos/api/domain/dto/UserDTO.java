package br.com.marcos.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private Integer id;
    private String name;
    private String email;

    @JsonIgnore
    private String senha;

}
