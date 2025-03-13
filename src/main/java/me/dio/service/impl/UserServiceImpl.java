package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.repository.UserRepositoy;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoy userRepositoy;

    public UserServiceImpl(UserRepositoy userRepositoy) {
        this.userRepositoy = userRepositoy;
    }

    @Override
    public User findById(Long id) {
        return userRepositoy.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
      if (userRepositoy.existsById(userToCreate.getAccount().getId())){
          throw new IllegalArgumentException("Account already exists!");
      }
        return userRepositoy.save(userToCreate);
    }
}
