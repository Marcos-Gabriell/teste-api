package br.com.marcos.api.services;

import br.com.marcos.api.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
