package br.com.marcos.api.services;

import br.com.marcos.api.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Integer id);
}
