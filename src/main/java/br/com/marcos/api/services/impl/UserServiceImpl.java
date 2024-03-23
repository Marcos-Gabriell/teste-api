package br.com.marcos.api.services.impl;

import br.com.marcos.api.domain.User;
import br.com.marcos.api.repositories.UserRepository;
import br.com.marcos.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }

    // Implemente outros métodos da interface UserService, se houver
}
