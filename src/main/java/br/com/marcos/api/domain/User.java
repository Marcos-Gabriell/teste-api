package br.com.marcos.api.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios") // Renomeando a tabela para evitar conflitos
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;

    // Renomeando a coluna 'senha' para evitar conflitos
    @Column(name = "senha_usuario")
    private String senha; // Coluna de senha renomeada para 'senha_usuario'

}
