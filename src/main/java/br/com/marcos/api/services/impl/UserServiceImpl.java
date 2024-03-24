package br.com.marcos.api.services.impl;

import br.com.marcos.api.domain.User;
import br.com.marcos.api.domain.dto.UserDTO;
import br.com.marcos.api.repositories.UserRepository;
import br.com.marcos.api.services.UserService;
import br.com.marcos.api.services.exeptions.ObjectFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectFoundException("Objeto não encontrado! "));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        return repository.save(mapper.map(obj, User.class)) ;
    }
}
