package br.com.marcos.api.config;

import br.com.marcos.api.domain.User;
import br.com.marcos.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Marcos", "marcos@email.com", "123");
        User u2 = new User(null, "João", "João@email.com", "1589");

        repository.saveAll(List.of(u1, u2));
    }
}
